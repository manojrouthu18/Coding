public class P17 {
    public static void main(String[] args) {
        
    }
}


class Product {

    protected String name;
    protected double basePrice;

    Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public void setPrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getNetPrice() {
        return basePrice;  
    }

    public void print() {
        System.out.println("Product Name : " + name);
        System.out.println("Base Price  : " + basePrice);
    }
}



class ImportedProduct extends Product {

    private double importDuty;

    ImportedProduct(String name, double basePrice, double importDuty) {
        super(name, basePrice);
        this.importDuty = importDuty;
    }

    public void setImportDuty(double importDuty) {
        this.importDuty = importDuty;
    }

    @Override
    public double getNetPrice() {
        return basePrice + importDuty;   //if importduty taken percentage ,we can change this to + importDuty*basePrce + baseprice
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Import Duty : " + importDuty);
        System.out.println("Net Price  : " + getNetPrice());
    }
}


class DiscountedProduct extends Product {

    private double discountRate; // percentage

    DiscountedProduct(String name, double basePrice, double discountRate) {
        super(name, basePrice);
        this.discountRate = discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double getNetPrice() {
        return basePrice - (basePrice * discountRate / 100);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Discount % : " + discountRate);
        System.out.println("Net Price  : " + getNetPrice());
    }
}

