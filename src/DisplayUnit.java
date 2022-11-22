import java.util.Scanner;

public class DisplayUnit {
    public static void main(String[] args) {
        int i;
        Scanner d=new Scanner(System.in);
        System.out.println("Enter Number-------:");
        i=d.nextInt();
        if(i==1){
            System.out.println("Unit");
        } else if (i==10) {
            System.out.println("Ten");
        } else if (i==100) {
            System.out.println("Hundred");
        } else if (i==1000) {
            System.out.println("Thousand");
        }else
            System.out.println("Invalid Number");
    }
}
