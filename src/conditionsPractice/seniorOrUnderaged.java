import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter your age: ");
    int age = scanner.nextInt();

    if (age > 65) {
        System.out.println("you are retired");
    } else if (age > 18 ) {
        System.out.println("you are an adult");
    } else {
        System.out.println("you are underaged");
    }
}