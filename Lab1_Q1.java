import java.util.Scanner;

public class Lab1_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of hours worked : ");
        float hoursWorked = sc.nextFloat();
        System.out.print("Enter the hourly rate : ");
        float hourlyRate = sc.nextFloat();

        float totalSalary = calculateSalary(hoursWorked, hourlyRate);
        System.out.println("The salary of the employee = ₹" + totalSalary);
    }

    private static float calculateSalary(float hoursWorked, float hourlyRate) {
        float salary = 0;
        float overtimeHours = hoursWorked - 40;
        if(hoursWorked <= 40){
            salary = hourlyRate * hoursWorked;
        }
        else{
            salary = hourlyRate * 40  + 1.5f * overtimeHours * hourlyRate;
        }
        return salary;
    }
}
