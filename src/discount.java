import java.util.Scanner;
void main() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 3 prices of products you purchased");
    double num1 = scanner.nextDouble(); // double because prices could have decimals
    double num2  = scanner.nextDouble();
    double num3  = scanner.nextDouble();
    double sum =  num1 + num2 + num3; // sum = 500

    if (sum > 500) {
        System.out.println("You got 10% discount, the new price is " + sum * 0.9);
    } else {
        System.out.println("The price is " + sum);
    }
}