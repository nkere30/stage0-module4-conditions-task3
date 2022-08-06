package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public static void calculateSalary(int salary) {
        double basicSalary = salary;
        if(salary <= 10000) {
            basicSalary = basicSalary * 0.85;
        } else if(salary > 10000 && salary <= 20000) {
            basicSalary = basicSalary * 0.82;
        } else if(salary > 20000) {
            basicSalary = basicSalary * 0.8;
        }

        if(basicSalary < 0) {
            System.out.println("wrong input!");
        } else {
            System.out.println(basicSalary);
        }
    }

    public static void main(String[] args) {
        calculateSalary(-5);
        calculateSalary(10000);
        calculateSalary(20000);
        calculateSalary(30000);
    }
}
