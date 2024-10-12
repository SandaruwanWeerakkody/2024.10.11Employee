public abstract class Employee {
    protected String name;
    protected double age;
    protected String gender;

    public Employee(String name, double age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public abstract void calculateSalary();

    public abstract void displayEmployeeDetails();
}
