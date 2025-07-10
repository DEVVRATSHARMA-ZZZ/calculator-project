
import java.util.Scanner;

import Methods.operations;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("devvrat");
        operations O1 = new operations();
        System.out.println("enter the first number");
        O1.a = sc.nextDouble();
        sc.nextLine();
        System.out.println("enter the second number");
        O1.b = sc.nextDouble();
        sc.nextLine();
        System.out.println("enter the operation");
        O1.operation = sc.nextLine();
        if (Double.isNaN(O1.a) || Double.isInfinite(O1.a) || Double.isNaN(O1.a) || Double.isInfinite(O1.b)) {
            System.out.println("input is not correct");
            return;
        }
        ;
       
        System.out.println(O1.op());

     
}
}
