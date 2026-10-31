import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter 3 of your grades: ");
    int gradeA = scanner.nextInt();
    int gradeB = scanner.nextInt();
    int gradeC = scanner.nextInt();

    int sumGrades = (gradeA + gradeB + gradeC) / 3;

    if(sumGrades <= 90 && sumGrades >= 70 ) {
        System.out.println("Good");
    } else if (sumGrades > 90 ) {
        System.out.println("exceptional");
    } else {
        System.out.println("struggling");
    }
}