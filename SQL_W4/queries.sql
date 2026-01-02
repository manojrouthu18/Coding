

/*
This Is The Schema i Have followed to solve the SQL Assignement Problems

DATABASE STRUCTURE (SCHEMA)

products
---------
product_id   VARCHAR(10)  PK
product_name VARCHAR(100)
price        DECIMAL(8,2)
tax_rate     DECIMAL(5,2)

publishers
-----------
pub_id    VARCHAR(10)  PK
pub_name  VARCHAR(100)
city      VARCHAR(50)
state     VARCHAR(50)
country   VARCHAR(50)

titles
-------
title_id    VARCHAR(10)  PK
title       VARCHAR(150)
type        VARCHAR(50)
price       DECIMAL(8,2)
sales       INT
pub_id      VARCHAR(10)  FK → publishers(pub_id)
pubdate     DATE


authors
--------
author_id   VARCHAR(10)  PK
first_name  VARCHAR(50)
last_name   VARCHAR(50)
city        VARCHAR(50)
state       VARCHAR(50)
country     VARCHAR(50)




titleauthor
------------
author_id   VARCHAR(10)  FK → authors(author_id)
title_id    VARCHAR(10)  FK → titles(title_id)
au_ord      INT          -- author order (1 = primary)
royalty     INT
PRIMARY KEY (author_id, title_id)

*/



-- 1. Add new column to products table that stores tax rate for the products update tax rate to 12% to all products.

ALTER TABLE products
ADD tax_rate DECIMAL(5,2);

UPDATE products
SET tax_rate = 12;


-- 2. Display tiles that End with 's'/'t'.
SELECT title
FROM titles
WHERE title LIKE '%s'
   OR title LIKE '%t';


-- 3. Display books of type business, psychology & undecided.
SELECT title
FROM titles
WHERE type IN ('business', 'psychology', 'undecided');



-- 4. Display titles where the sales>5,000 & royality<20.
SELECT DISTINCT t.title
FROM titles t
JOIN titleauthor ta ON t.title_id = ta.title_id
WHERE t.sales > 5000
  AND ta.royalty < 20;

--5. Display titles in the ascending of sales for publisher 0736.
SELECT title, sales
FROM titles
WHERE pub_id = '0736'
ORDER BY sales ASC;



-- 6. Display the difference between maximum & minimum royality of books published day publisher 0877.
SELECT MAX(ta.royalty) - MIN(ta.royalty) AS royalty_diff
FROM titles t
JOIN titleauthor ta ON t.title_id = ta.title_id
WHERE t.pub_id = '0877';


-- 7. Display author_id & no of books written by Author.
SELECT author_id, COUNT(title_id) AS no_of_books
FROM titleauthor
GROUP BY author_id;



-- 8. Display how many authors are there for each title.
SELECT title_id, COUNT(author_id) AS author_count
FROM titleauthor
GROUP BY title_id;

-- 9. Display average royality % for authors with order 1.
SELECT AVG(royalty) AS avg_royalty
FROM titleauthor
WHERE au_ord = 1;

-- 10. Display titles in the order of price if sales are in the range 10k to 20k.
SELECT title, price
FROM titles
WHERE sales BETWEEN 10000 AND 20000
ORDER BY price;



-- 11. Display how many authors are in the city Menlo park.
SELECT COUNT(*) AS author_count
FROM authors
WHERE city = 'Menlo Park';

-- 12. Display state and no of authors we have in the state in the order of state.
SELECT state, COUNT(*) AS author_count
FROM authors
GROUP BY state
ORDER BY state;

-- 13. Display States in which we have more than 2 authors, with 1st name starting with 's'.
SELECT state, COUNT(*) AS author_count
FROM authors
WHERE first_name LIKE 's%'
GROUP BY state
HAVING COUNT(*) > 2;


-- 14. Display title after replacing all spaces with (dots) and (hypens) with (stars).
SELECT 
REPLACE(REPLACE(title, ' ', '.'), '-', '*') AS modified_title
FROM titles;



-- 15. Display title by Removing all spaces.

SELECT REPLACE(title, ' ', '') AS title_no_spaces
FROM titles;

-- 16. Display first word in the title.
SELECT SUBSTRING_INDEX(title, ' ', 1) AS first_word
FROM titles;

-- 17. Display month and no of books published.
SELECT MONTH(pubdate) AS month, COUNT(*) AS book_count
FROM titles
GROUP BY MONTH(pubdate);

-- 18. Display title publisher name for titles where the publisher is in USA.
SELECT t.title, p.pub_name
FROM titles t
JOIN publishers p ON t.pub_id = p.pub_id
WHERE p.country = 'USA';

-- 19. Display publisher name and average price of books.
SELECT p.pub_name, AVG(t.price) AS avg_price
FROM publishers p
JOIN titles t ON p.pub_id = t.pub_id
GROUP BY p.pub_name;

-- 20. Display City of author and then no of books written by authors in the City.
SELECT a.city, COUNT(ta.title_id) AS book_count
FROM authors a
JOIN titleauthor ta ON a.author_id = ta.author_id
GROUP BY a.city;



-- 21. Display auther name, title for all authors including the once without a title.
SELECT a.first_name, a.last_name, t.title
FROM authors a
LEFT JOIN titleauthor ta ON a.author_id = ta.author_id
LEFT JOIN titles t ON ta.title_id = t.title_id;

-- 22. Display title publisher name and author name of the primary author.
SELECT t.title, p.pub_name, a.first_name, a.last_name
FROM titles t
JOIN publishers p ON t.pub_id = p.pub_id
JOIN titleauthor ta ON t.title_id = ta.title_id
JOIN authors a ON ta.author_id = a.author_id
WHERE ta.au_ord = 1;

-- 23. Display City of publisher and maximum price of all titles.
SELECT p.city, MAX(t.price) AS max_price
FROM publishers p
JOIN titles t ON p.pub_id = t.pub_id
GROUP BY p.city;


-- 24. Display titles written by any author in City (menlo park).
SELECT DISTINCT t.title
FROM titles t
JOIN titleauthor ta ON t.title_id = ta.title_id
JOIN authors a ON ta.author_id = a.author_id
WHERE a.city = 'Menlo Park';

-- 25. Display publishers who published a titles in 1991.

SELECT DISTINCT p.pub_name
FROM publishers p
JOIN titles t ON p.pub_id = t.pub_id
WHERE YEAR(t.pubdate) = 1991;


-- 26. Display titles not published in USA.
SELECT t.title
FROM titles t
JOIN publishers p ON t.pub_id = p.pub_id
WHERE p.country <> 'USA';

-- 27. Display titles either published in USA (or) having price <5.
SELECT DISTINCT t.title
FROM titles t
JOIN publishers p ON t.pub_id = p.pub_id
WHERE p.country = 'USA'
   OR t.price < 5;


-- 28. create a view to contain title, publisher, year of publishing, price and type. Make sure when price is null display Zero and type is null display Unknown.
CREATE VIEW vw_title_details AS
SELECT 
    t.title,
    p.pub_name AS publisher,
    YEAR(t.pubdate) AS publish_year,
    ISNULL(t.price, 0) AS price,
    ISNULL(t.type, 'Unknown') AS type
FROM titles t
JOIN publishers p ON t.pub_id = p.pub_id;



-- 29. Display publishers who published books by author who wrote more than 2 titles.
SELECT DISTINCT p.pub_name
FROM publishers p
JOIN titles t ON p.pub_id = t.pub_id
JOIN titleauthor ta ON t.title_id = ta.title_id
WHERE ta.author_id IN (
    SELECT author_id
    FROM titleauthor
    GROUP BY author_id
    HAVING COUNT(title_id) > 2
);

-- 30. Delete rows from title author for author with first_name as dean.
DELETE FROM titleauthor
WHERE author_id IN (
    SELECT author_id
    FROM authors
    WHERE first_name = 'dean'
);

-- 31. Update the price of the book BU1111 with the Price of book MC2222.
UPDATE titles
SET price = (
    SELECT price
    FROM titles
    WHERE title_id = 'MC2222'
)
WHERE title_id = 'BU1111';

-- 32. Display titles published in last 25 years.
SELECT title
FROM titles
WHERE pubdate >= DATEADD(YEAR, -25, GETDATE());

-- 33. Display titles published by any publisher who published a title in 2021.
SELECT DISTINCT t2.title
FROM titles t2
WHERE t2.pub_id IN (
    SELECT DISTINCT pub_id
    FROM titles
    WHERE YEAR(pubdate) = 2021
);

-- 34. Create a view to display publisher name, city, and no of books published.
CREATE VIEW vw_publisher_book_count AS
SELECT 
    p.pub_name,
    p.city,
    COUNT(t.title_id) AS book_count
FROM publishers p
LEFT JOIN titles t ON p.pub_id = t.pub_id
GROUP BY p.pub_name, p.city;
