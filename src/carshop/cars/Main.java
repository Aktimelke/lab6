package carshop.cars;

import carshop.impl.MyOwnCarShop;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MyOwnCarShop shop = new MyOwnCarShop();
        System.out.println("Welcome to the shop!");
        int userInput;
        boolean IsInputEnded=false;

        do {
            System.out.println("\nWhat you want to do (input number)?");
            System.out.println("1. See cars prices");
            System.out.println("2. See cars colors");
            System.out.println("3. See car price by id");
            System.out.println("4. See car color by id");
            System.out.println("5. Purchase a car");
            System.out.println("0. Exit");

            userInput = scanner.nextInt();

            switch (userInput) {
                case 0:
                    IsInputEnded=true;
                    break;
                case 1:
                    System.out.println("There are these prices in the shop:");
                    double[] prices=shop.getCarsPrice();
                    for (double i: prices) {
                        System.out.println("\t" + i + "$");
                    }
                    break;
                case 2:
                    System.out.println("There are these colors in the shop:");
                    String[] colors=shop.getCarColors();
                    for (String i: colors) {
                        System.out.println("\t" + i);
                    }
                    break;
                case 3:
                {
                    int id;
                    System.out.println("Input car id:");
                    id = scanner.nextInt();

                    if (id < 0 || id >= shop.getCars().length) {
                        System.out.println("ID is incorrect!");
                        break;
                    }

                    System.out.println("Price of this car is " + shop.getCarPrice(id) + "$");
                    break;
                }
                case 4:
                {
                    int id;
                    System.out.println("Input car id:");
                    id = scanner.nextInt();

                    if (id < 0 || id >= shop.getCars().length) {
                        System.out.println("ID is incorrect!");
                        break;
                    }

                    System.out.println("Color of this car is " + shop.getCarColor(id));
                    break;
                }
                case 5:
                {
                    int id;
                    System.out.println("Input car id:");
                    id = scanner.nextInt();

                    if (id < 0 || id >= shop.getCars().length) {
                        System.out.println("ID is incorrect!");
                        break;
                    }

                    if(shop.purchaseCar(id)) {
                        System.out.println("Purchase is success.");
                        System.out.println("Purchased: " + shop.getCars()[id].outputCarInfo());
                    }
                    else {
                        System.out.println("The car is already sold.");
                    }
                    break;
                }
                default:
                    System.out.println("Choose correct option please.");
                    break;
            }
        }while (!IsInputEnded);
        System.out.println("Admins mode");
        System.out.println(shop.getIncome());
    }

}
