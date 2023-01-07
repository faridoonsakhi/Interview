import java.util.Scanner;

public class OddAndEven {

    public static void main(String[] args) {
        int number=0;
        System.out.println("enter your number: ");
        Scanner sca = new Scanner(System.in);
        number= sca.nextInt();
        sca.close();

        if (number%2==0){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }
    }

}
