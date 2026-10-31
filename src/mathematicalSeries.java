import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter 3 numbers: ");
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();
    int number3 = scanner.nextInt();

    int numberGap = number2 - number3;
    int nextNumber = number3 - numberGap; // I used minus to reverse the operator to match what I want.

    if (number1 - number2 == numberGap) {
        System.out.println("you got a mathematical series, the next number in your series is " + nextNumber );
    } else System.out.println("you didn't get a mathematical series");
}