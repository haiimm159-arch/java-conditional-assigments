import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter 3 numbers: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();

    int greatestNumber;

    if (num1 > num2) {
        greatestNumber = num1;
    } else {
        greatestNumber = num2;
    } if (greatestNumber < num3) {
        greatestNumber = num3;
    }
    // here I created a variable that contains the highest number and checks if the next number is higher if it is
    // it will overwrite it and become the new greatest number if not greatest number won't change.

    System.out.println("the highest number is: " + greatestNumber);
}