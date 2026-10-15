public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Tahmed");

        Manager manager = new Manager("Rahim", 12);

        Intern intern = new Intern("Karim", 5);

        System.out.println("=== Employee ===");
        employee.describe();
        System.out.println("Access Hours: " + employee.getDailyAccessHours());

        System.out.println();

        System.out.println("=== Manager ===");
        manager.describe();
        System.out.println("Access Hours: " + manager.getDailyAccessHours());

        System.out.println();

        System.out.println("=== Intern ===");
        intern.describe();
        System.out.println("Access Hours: " + intern.getDailyAccessHours());

        System.out.println();

        System.out.println("=== Blank Name Validation ===");

        Employee invalidEmployee = new Employee("   ");

        invalidEmployee.describe();
    }
}