import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter a number: ");
    int number =  sc.nextInt();
    boolean isNumberGreaterThan1000 = number > 1000;
    System.out.println(isNumberGreaterThan1000 ? "success" : "failure");
}