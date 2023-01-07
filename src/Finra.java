import java.util.Scanner;

public class Finra {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input =new Scanner(System.in);
        int  enter=input.nextInt();

        returnFinras(enter);
        System.out.println(enter);
    }
    public  static void returnFinras(int result){
        for (int i = 0; i < result; i++) {
            if (result%3==0 || result%5==0){
                System.out.println("finra");
            }
            if (result%3==0){
                System.out.println("Fin");
            }else if(result%5==0){
                System.out.println("Ra");


            }else {
                System.out.println("Finra");
            }
        }

    }
}
/*

FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.
 */

