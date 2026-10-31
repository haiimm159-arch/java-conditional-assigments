import java.util.Scanner;
import java.util.Random;
void main() {
    Scanner scanner = new Scanner(System.in);
    Random random =  new Random();

    // user ticket cost input
    System.out.println("How much money would you like to spend on tickets? (10-100, in multiples of 5)");
    int userTicketCostAmount = scanner.nextInt();

    boolean isValidNumber = userTicketCostAmount % 5 == 0 &&
            (userTicketCostAmount >= 10 && userTicketCostAmount <= 100);

    if(isValidNumber) {

        //the instructions specify a range of 1–5 but also include a prize for 777.
        //I assumed the initial range should be 1–7.
        int randomNumber1 = random.nextInt(1, 8);
        int randomNumber2 = random.nextInt(1, 8);
        int randomNumber3 = random.nextInt(1, 8);

        //calculating conditions of winning.
        boolean isTwoNumbersEqual = (randomNumber1 == randomNumber2) || (randomNumber2 == randomNumber3)
                || (randomNumber1 == randomNumber3);
        boolean isThreeNumbersEqual = randomNumber1 == randomNumber2 && randomNumber1 == randomNumber3;
        boolean isThreeNumbersSeven = randomNumber1 == 7 && randomNumber2 == 7 && randomNumber3 == 7;


        System.out.println("The rolled numbers are: " + randomNumber1 + " " + randomNumber2 + " " + randomNumber3);

        if (isThreeNumbersSeven) {
            int bonusMultiplier = random.nextInt(1, 6);
            int prize = userTicketCostAmount * 4 * bonusMultiplier ;
            System.out.println("Congrats you got 777 rolled, your reward is quadruple the ticket cost plus double the next rolled number: "  + prize); // I assumed the additional number from 1–5 is  a multiplier for the 777 prize, not another round.
        } else if (isThreeNumbersEqual) {
            System.out.println("Congrats all the rolled numbers are equal, your reward is quadruple the ticket cost: " + userTicketCostAmount * 4);
        } else if (isTwoNumbersEqual) {
            System.out.println("Congrats 2 out of 3 numbers rolled are equal, your reward is double the ticket price: " + userTicketCostAmount * 2);
        } else System.out.println("Sorry you lost");
    } else System.out.println("Enter a valid number!");

    }