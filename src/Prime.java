import java.util.Scanner;

public class Prime {
    // prime number is the number devide by 1 and itself.



    public static void main(String[] args) {


            int num = 7;
            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i) {
                // condition for nonprime number
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");


        int n,count =0;
        System.out.println("Enter any number");
        Scanner sca = new Scanner(System.in);
        n=sca.nextInt();

        for (int i = 1; i <n; i++) {
            if (n%i==0){
                count++;
            }
        }
           if (count==2){
               System.out.println("Prime number");
           }else {
               System.out.println("Not Prime number");
           }
        }
    }
