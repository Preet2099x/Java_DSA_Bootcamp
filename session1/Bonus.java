import java.util.Scanner;
class Bonus
{
    public static void main (String args[])
    {
        int totalSalary;
        int salary;
        int bonus;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        salary = sc.nextInt();

        if(salary > 10000) {
            bonus = 2000;
        }
        else {
            bonus = 1000;
        }

        totalSalary = salary + bonus; 
        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total Salary = " + totalSalary);

        sc.close();
    }
}