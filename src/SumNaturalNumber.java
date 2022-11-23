import java.util.Scanner;

public class SumNaturalNumber {
    public static void main(String[] args) {
        int i,sum=0;
        Scanner d=new Scanner(System.in);
        System.out.println("Enter number:---");
        int number=d.nextInt();
        for(i=0;i<=number;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of natural no is: "+sum);
    }
}
