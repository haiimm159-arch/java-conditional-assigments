package loopsPractice;

import java.util.Scanner;

public class printLimit {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number that will be the amount of prints:");
        int limit = scanner.nextInt();
        if(limit <= 0) {
            System.out.println("The number is not positive");
        } else {
            for(int i = 0; i <= limit; i++) {
                System.out.println("The current number is " + i);
            }
        }
    }
}
