import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = sc.nextInt();

       /*

        int reverse=0;

        while (num!=0){
            reverse=reverse*10+num%10; // 0*10+1234%10    40+3=43    430+2=432   4320+1=4321
            num=num/10;      //  1234/123     123/10=1    12/10=1    1/10=0
        }

         */






   /*

        // using stringBuffer class method;

        StringBuffer reverse;

        StringBuffer sb=new StringBuffer(String.valueOf(num));
       StringBuffer rev =sb.reverse();


    */


        // using StringBuilder class

        StringBuilder sbl =new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();// to reassigned it to the StringBuilder


        System.out.println("reverse number is: = " + rev);

            System.out.println("reverse number is: = " + rev);
            System.out.println("reverse number is: = " + rev);
            System.out.println("reverse number is: = " + rev);


    }
}
