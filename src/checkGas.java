import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("enter your gas tank capacity");
    double userTankCapacity = scanner.nextDouble();
    System.out.println("enter the current amount of gas in your tank");
    double currentGas = scanner.nextDouble();

    double currentGasPercentage = (currentGas/ userTankCapacity) * 100;
    // I created a variable that calculates the percentage separately so the if statement could be simplified

    if (currentGasPercentage > 50 ) {
        System.out.println("No need to refuel");
    } else if (currentGasPercentage <= 50 && currentGasPercentage >= 15) {
        System.out.println("It is recommended to refuel soon");
    } else {
        System.out.println("Refuel is required now!");
    }
}