package carshop.cars;

public abstract class Car {

    protected int speed;
    protected boolean isSellOut;
    protected double reguralPrice;
    protected String color;

    public Car(int speed,boolean isSellOut,double reguralPrice,String color){
        this.speed=speed;
        this.isSellOut=isSellOut;
        this.reguralPrice=reguralPrice;
        this.color=color;
    }
    public String getColor (){return color;}
    public boolean isSellOut(){return isSellOut;}
    public void setSellOut(boolean isSellOut){
        this.isSellOut=isSellOut;
    }
    public double getReguralPrice(){return reguralPrice;}
    public abstract double getSalePrice();
    public abstract String outputCarInfo();

}
