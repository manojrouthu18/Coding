public class P12{
    public static void main(String[] args) {


        Product p1=new Product(11,"Tshirt",300);
        p1.showDetails();
        
    }
} 


class Product{
    int prod_id;
    String prod_name;
    double price;
    int quantity_on_hand;

    Product(){
        System.out.println("default constructor called");
    }
    Product(int prod_id,String prod_name,int price){
        this.prod_id=prod_id;
        this.price=price;
        this.prod_name=prod_name;
        this.quantity_on_hand=0;
    }
  



    public void init(int prod_id,String prod_name,double price){
        this.prod_id=prod_id;
        this.price=price;
        this.prod_name=prod_name;
    }

    public double getNetPrice(){

        return price+price*0.12;

    }

   //purchse decreases the stock
    void purchase(int qty) {
        if (qty > 0) {
            quantity_on_hand += qty;
        }
    }

    // sell decreases stock
    void sell(int qty) {
        if (qty > 0 && qty <= quantity_on_hand) {
            quantity_on_hand -= qty;
        } else {
            System.out.println("Insufficient stock");
        }
    }


    public void showDetails(){
        System.out.println("id :"+prod_id+", name: "+prod_name+", price :"+price+", quanity on hand ,"+quantity_on_hand );
    }

}