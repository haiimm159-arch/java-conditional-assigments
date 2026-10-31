import java.util.Random;
void main() {
    Random random = new Random();
    int randomNumber = random.nextInt(1001);
    boolean is3RemainerLeft = randomNumber % 3 == 0;

    System.out.println("the random number is " + randomNumber + (is3RemainerLeft ? "you won a bonus" : "sorry you didn't win"));
}