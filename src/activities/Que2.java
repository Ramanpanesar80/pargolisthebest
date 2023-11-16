package activities;
import java.util.Scanner;

public class Que2 {

            public static void main(String[] args) {
            // TODO Auto-generated method stub

            Scanner kb = new Scanner(System.in);

            System.out.print("Enter the Number1");
            double num1 = kb.nextDouble();
                System.out.print("Enter the Number2");
                double num2 = kb.nextDouble();
                System.out.print("Enter the Number3");
                double num3 = kb.nextDouble();
           double avg;
           avg=(num1+num2+num3)/3;
           System.out.print("the average is: " +avg);
            }

        }
