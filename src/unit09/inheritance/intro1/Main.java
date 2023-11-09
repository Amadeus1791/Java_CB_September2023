package unit09.inheritance.intro1;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Max","Mustermann",22);
        Employee e = new Employee("Susi","Mueller",29,4500);
        SkilledEmployee s = new SkilledEmployee("Tom", "mayer", 46, 3021,"Java");

        p.increaseAge();
        e.increaseAge();
        e.increaseAge();
        System.out.println(p.getAge());
        System.out.println(e.getAge());
        e.raiseSalary(1000);
        System.out.println(e.getSalary());
        p.sayName();
        e.sayName();
    }
}
