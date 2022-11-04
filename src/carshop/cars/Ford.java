package carshop.cars;

public class Ford extends Car{
    private int year;
    private double manufactureDiscount;
    public Ford(int speed,boolean isSellOut,double reguralPrice,String color,int year,double manufactureDiscount){
        super(speed,isSellOut,reguralPrice,color);
        this.year=year;
        this.manufactureDiscount=manufactureDiscount;
    }

    @Override
    public double getSalePrice(){
        double price = getReguralPrice();
        price *=manufactureDiscount;
        return price;
    }
    @Override
    public String outputCarInfo() {
        return String.format("Ford, price: %.2f$, color: %s, speed: %d, year: %d.", getSalePrice(), color, speed, year);
    }
}
