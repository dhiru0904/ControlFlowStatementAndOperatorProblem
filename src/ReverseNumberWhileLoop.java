public class ReverseNumberWhileLoop {
    public class Reverse {
        public static void main(String[] args) {
            int number = 1234, reversed = 0;
            System.out.println("Original Number: " + number);
            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }
            System.out.println("Reversed Number: " + reversed);
        }
    }
}
