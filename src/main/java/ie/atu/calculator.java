package ie.atu;

import java.sql.SQLOutput;
import java.util.Scanner;


public class calculator {
    public static void main(String[]args){
        subtract();

}

public static void subtract()
{
    System.out.println("Please your first number : ");
    Scanner inputs = new Scanner(System.in);
    int firstNumber = inputs.nextInt();

    System.out.println("Please your second number : ");
    int secondNumber = inputs.nextInt();

    int total = firstNumber - secondNumber;
    System.out.println("The total is " + total);


}
public static void delete(){

}
}