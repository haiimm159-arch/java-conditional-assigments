import java.util.Scanner;
import java.util.Random;
void main() {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.println("Enter what is the overall distance of your flight in km: ");
    int flightLengthKm = scanner.nextInt();

    System.out.println("Enter the capacity of the plane ");
    int flightCapacity = scanner.nextInt();

    System.out.println("Enter how many people are flying on this plane?");
    int flightOccupation = scanner.nextInt();

    double occupationPercentage = flightOccupation * 100.0 / flightCapacity;
    boolean isStormyWeather = random.nextBoolean();
    double pricePerKm;

    if (flightLengthKm <= 100) {
        pricePerKm = 2;
    } else if (flightLengthKm <= 200) {
        pricePerKm = 1.5;
    } else {
        pricePerKm = 1.2;
    }
    double flightTicketPrice = flightLengthKm * pricePerKm;

    if (occupationPercentage == 100) {
        System.out.println("You get 10% discount: " + (flightTicketPrice *= 0.9));
    } else if (occupationPercentage >= 90) {
        System.out.println("You get 5% discount: " + (flightTicketPrice *= 0.95));
    }

    System.out.println(isStormyWeather ? "The weather is stormy, your charge will double "
            + flightTicketPrice * 2  : "The weather is stable, no extra charges! price is: " + flightTicketPrice);
}