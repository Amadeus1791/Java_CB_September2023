package unit09.inheritance.intro1;

public class Employee extends Person {
    private double salary;
    private String companyName;

    public Employee(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    public void raiseSalary(int raise) {
        if (raise > 0) {
            salary += raise;
        }
    }

    @Override
    void sayName() {
        super.sayName();
        System.out.println("hello world");
    }



    //    @Override
//    void sayName() {
//        System.out.println(getFirstName()+ getLastName()+ " earning: "+ salary);
//    }

    public double getSalary() {
        return salary;
    }

    public String getCompanyName() {
        return companyName;
    }
}
