package variant_task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number1,number2;
        System.out.println("Enter two numbers");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        FistClass n1 = new FistClass();
        SecondClass n2 = new SecondClass();
        System.out.println(n1.match(number1,number2));
        System.out.println(n2.match(number1,number2));


    }
}
