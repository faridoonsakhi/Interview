import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {


        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int BackUp=num;
        int sum=0;

        while (num>0){
            sum=sum+(num%10)*(num%10)*(num%10);
            num=num/10;
        }
        if (sum==BackUp){
            System.out.println("Armstrong");
        }else {
            System.out.println("NOt Armstrong");
        }




    }
}
