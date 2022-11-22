import java.util.Scanner;

public class VowelSwitch {
    public static void main(String[] args) {
        System.out.println("Enter the Character:"+"\n");
        char ch ;
        Scanner d=new Scanner(System.in);
        ch=d.next().charAt(0);
        d.close();

        switch (ch) {
            //lower case letter
            case 'a':
                System.out.println(ch+"is a vowel");
                break;
            case 'e':
                System.out.println(ch+"is a vowel");
                break;
            case 'i':
                System.out.println(ch+"is a vowel");
                break;
            case 'o':
                System.out.println(ch+"is a vowel");
                break;
            case 'u':
                System.out.println(ch+"is a vowel");
                break;
            //upper case letter
            case 'A':
                System.out.println(ch+"is a vowel");
                break;
            case 'E':
                System.out.println(ch+"is a vowel");
                break;
            case 'I':
                System.out.println(ch+"is a vowel");
                break;
            case 'O':
                System.out.println(ch+"is a vowel");
                break;
            case 'U':
                System.out.println(ch+"is a vowel");
                break;
            default:
                if((ch >='a'&&ch <='z' || ch >='A'&& ch <='Z')){
                    System.out.println(ch + " is a Consonant");
                }else{
                    System.out.println(ch + " is not a Alphabets");
                }
                break;
        }
    }}


