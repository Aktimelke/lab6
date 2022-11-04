package carshop.impl;

import carshop.cars.Car;
import carshop.cars.Sedan;
import carshop.interfaces.Customer;
import carshop.interfaces.Admin;
import carshop.cars.Truck;
import carshop.cars.Ford;


public class MyOwnCarShop implements Admin, Customer {

       protected  double totalIncome;
       protected Car[] Cars;
       public MyOwnCarShop(){
           Cars = new Car[]{
                   new Sedan(120, false, 14500, "Blue", 22),
           new Ford(135, false, 15500, "Red", 2002, 0.98),
           new Ford(140, false, 10000, "Green", 2003, 0.99),
           new Truck(100, false, 25000, "White", 2100),
           new Truck(95, false, 29000, "Grey", 1900),
           };
       }
       public Car[] getCars(){
           return Cars;
    }

    @Override
    public double getIncome(){
        return totalIncome;
    }
    @Override
    public double[] getCarsPrice(){
        double[] prices = new double[Cars.length];
        for(int i =0; i<prices.length;i++){
            prices[i]= Cars[i].getSalePrice();
        }
        return prices;
    }
    @Override
    public String[] getCarColors(){
        String[] colors = new String[Cars.length];
        for(int i =0; i<colors.length;i++){
            colors[i]= Cars[i].getColor();
        }
        return colors;
    }
    @Override
    public double getCarPrice(int id){
           return Cars[id].getSalePrice();
    }
    @Override
    public String getCarColor(int id){
           return Cars[id].getColor();
    }
    @Override
    public boolean purchaseCar(int id){
           if(!Cars[id].isSellOut()){
               Cars[id].setSellOut(true);
               totalIncome+=Cars[id].getSalePrice();
               return true;
           }
           else{
               return false;
           }

    }
}
