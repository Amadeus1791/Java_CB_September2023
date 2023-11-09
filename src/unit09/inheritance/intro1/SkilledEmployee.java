package unit09.inheritance.intro1;

public class SkilledEmployee extends Employee {
    private String task = "Plastic technology";

    public SkilledEmployee(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age, salary);
    }

    public SkilledEmployee(String firstName, String lastName, int age, double salary, String task) {
        // this(firstName, lastName, age, salary);
        super(firstName, lastName, age, salary);
        this.task = task;
    }
}
