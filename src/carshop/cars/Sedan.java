package carshop.cars;

public class Sedan extends Car{
    private int length;
    public Sedan (int speed,boolean isSellOut,double reguralPrice,String color,int length) {
        super(speed, isSellOut, reguralPrice, color);
        this.length = length;
    }

    @Override
    public double getSalePrice(){
        double price = getReguralPrice();
        if(length > 20){
            price *=0.95;
        }
        return price;
    }
    @Override
    public String outputCarInfo() {
        return String.format("Sedan, price: %.2f$, color: %s, speed: %d, length: %d.", getSalePrice(), color, speed, length);
    }
}
