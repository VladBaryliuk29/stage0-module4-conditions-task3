package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 10000 && salary > 0) {
            double realSalary = salary - salary * 15 / 100;
            System.out.println(realSalary);
        } else if (salary > 10000 && salary < 20000) {
                double realSalary = salary - salary * 18 / 100;
                System.out.println(realSalary);
        } else if (salary > 20000) {
            double realSalary = salary - salary * 20 / 100;
            System.out.println(realSalary);
        } else if (salary < 0) {
            System.out.println("wrong input!");
        }
    }
}
