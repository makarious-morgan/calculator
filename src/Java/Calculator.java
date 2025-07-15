package Java;

import  java.util.Scanner ;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First num : ");
        double a = scanner.nextDouble();
        System.out.print("Enter second num : ");
        double b = scanner.nextDouble();
        System.out.println("Addition IS : " + (a+b) + "\n" +"Subtraction IS : " + (a-b) + "\n" +"Multiplication IS : " + (a*b) + "\n" +"Division IS : " + (a/b));


    }
}
