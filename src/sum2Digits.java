import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("enter a number with 2 digits");
    int userNumber = scanner.nextInt();

    // calculations
    int userNumberLastDigit  = userNumber % 10;
    int userNumberFirstDigit = userNumber / 10;
    int sum = userNumberFirstDigit + userNumberLastDigit;

    // I had 2 if statements to cover edge case.
    if (userNumber > 9 && userNumber < 100) {
        System.out.println("you chose 2 digit number, the sum of the is: " + sum );
    } else if(userNumber < -9 && userNumber >= -99) {
        System.out.println("you chose 2 digit number, the sum of the is: " + sum );
    } else System.out.println("you didn't pick a 2 digit number");
}