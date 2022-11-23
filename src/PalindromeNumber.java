import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int temp,sum,reverse;
        Scanner d=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=d.nextInt();
        temp=number;
        for(sum=0;number>0;number/=10)
        {
            reverse=number%10;
            sum=(sum*10)+reverse;
        }
        if (sum==temp)
        {
            System.out.println("number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }}
