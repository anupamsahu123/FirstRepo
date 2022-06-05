package oopsJavaPart2;
class Employee {
    public void salary() {
        System.out.println("Salary is 30000");
    }
}

class Manager extends Employee {
    @Override
    public void salary() {
        System.out.println("Salary is 100000");
    }
}

public class MethodOverridingTutorial {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.salary();
    }
}