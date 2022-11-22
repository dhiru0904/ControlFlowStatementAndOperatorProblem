import java.util.Scanner;

public class DigitToWord {
        public static void main(String[] args) {
            int i;
            Scanner d=new Scanner(System.in);
            System.out.println("Enter Number:");
            i=d.nextInt();
            if(i==0)
            {
                System.out.println("Zero");
            }else if (i==1) {
                System.out.println("One");
            } else if (i==2) {
                System.out.println("Two");
            } else if (i==3) {
                System.out.println("Three");
            }else if (i==4) {
                System.out.println("Four");

            }else if (i==5) {
                System.out.println("Five");

            }else if (i==6) {
                System.out.println("Six");

            }else if (i==7) {
                System.out.println("Seven");

            }else if (i==8) {
                System.out.println("Eight");

            }else if (i==9) {
                System.out.println("Nine");

            }else
                System.out.println("not a single digit");

        }
    }
}
