import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    //declarations
    System.out.println("Enter agent's salary, sales goal and sales revenue (in this order):");
    int agentSalary = scanner.nextInt();
    int salesGoal = scanner.nextInt();
    int salesRevenue = scanner.nextInt();

    //calculations
    boolean isSalesGoalReached = salesGoal <= salesRevenue;
    boolean salesGoalAlmostReached = salesGoal / 2 < salesRevenue;
    int smallBonus = 2000;
    int largeBonus = agentSalary * 75/100;
    int salaryWithLargeBonus = agentSalary + largeBonus;
    int salaryWithSmallBonus = agentSalary + smallBonus;

    if(isSalesGoalReached) {
        System.out.println("agent reached the sales target, his salary now is: " + salaryWithLargeBonus);
    } else if (salesGoalAlmostReached) {
        System.out.println("agent reached more than 50% of the sales target, his salary now is: " + salaryWithSmallBonus);
    } else {
        System.out.println("agent hasn't come close to reaching sales target, his salary now is: " + agentSalary);
    }
}