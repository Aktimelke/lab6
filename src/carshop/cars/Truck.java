package carshop.cars;

public class Truck extends Car{
    private int weight;

    public Truck(int speed,boolean isSellOut,double reguralPrice,String color,int weight){
        super(speed,isSellOut,reguralPrice,color);
        this.weight=weight;
    }

    @Override
    public double getSalePrice() {
        double price = getReguralPrice();
        if (weight > 2000){
            price *= 0.90;
        }
         return price;
    }
    @Override
    public String outputCarInfo() {
        return String.format("Track, price: %.2f$, color: %s, speed: %d, weight: %d.", getSalePrice(), color, speed, weight);
    }

}
