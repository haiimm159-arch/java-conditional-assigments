import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter 3 digit number ");
    int userNumber = scanner.nextInt();

    //calculations!
    int userFirstDigit = userNumber / 100;
    int userSecondDigit = (userNumber % 100) /10;
    int userThirdDigit = userNumber % 10;
    int numberGap = userThirdDigit - userSecondDigit;
    boolean isNumberGapEqual =  userThirdDigit - userSecondDigit == userSecondDigit - userFirstDigit;

    if (userNumber >= 100 && userNumber <= 999) {
        if (isNumberGapEqual && (numberGap == 1 || numberGap == -1)) { //checks if the gap between numbers is equal and not higher than 1 or -1.
            System.out.println("The numbers you entered are in a consecutive order");
        } else {
            System.out.println("the numbers are not in a consecutive order");
        }

    } else if (userNumber <= -100 && userNumber >= -999) {
        if (isNumberGapEqual && (numberGap == -1 || numberGap ==1)) { // nested condition for edge case.
            System.out.println("The numbers you entered are in a consecutive order");
        } else {
            System.out.println("the numbers are not in a consecutive order");
        }

    } else {
        System.out.println("you didn't enter 3 digit number"); //shared input for all failed the statements.
    }
}