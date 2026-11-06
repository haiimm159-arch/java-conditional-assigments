import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 3 numbers ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    boolean isRemainderEqual = num1 - num2 == num2 - num3;

    System.out.println(isRemainderEqual ? "the remainder is equal" : "the remainder isn't equal");
}