import java.util.Scanner;

public class AddEvenIntegers {

    public static void main(String[] args) {
        boolean checkUserInput = true;
        int number = 0;
        Scanner scan = new Scanner(System.in);
        while(checkUserInput) {
            System.out.println("Please enter a number");

             number = scan.nextInt();

            System.out.println(" the number you chose is " + number);

            if (number < 2){
                System.out.println("Please enter a number greater than or equal to 2");
            }
            else {
                checkUserInput = false;
            }

        }
        int numberofloops = number/2;
        System.out.println("The number of loops:" + numberofloops);
        int finalvalue = 0;
        for(int i = 1; i<=numberofloops; i++){
           // System.out.println("i value is : " + i);
            //System.out.println("finalvalue value is : " + finalvalue);
           // System.out.println("2 Multiplied ivalie is  value is : " + 2*i);
            finalvalue = finalvalue+(2*i);
            //System.out.println("Calculated finalvalue : " + finalvalue);


        }
        System.out.println("The sum of all even integers is " + finalvalue);
    }
}
