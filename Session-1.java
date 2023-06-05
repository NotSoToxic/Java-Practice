import java.util.Scanner;

class SquareUnitDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int square = number * number;
        int unitDigit = square % 10;

        System.out.println("Unit digit of the square: " + unitDigit);
        scanner.close();
    }
}