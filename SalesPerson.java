public class SalesPerson extends Manager {
    protected double commission;

    public SalesPerson(String name, double age, String gender, double baseSalary, double bonus, double commission) {
        super(name, age, gender, baseSalary, bonus);
        this.commission = commission;
    }

    public void calculateSalary() {
        System.out.println(baseSalary + baseSalary * commission);
    }

    public void displayEmployeeDetails() {
        System.out.println(
                "name: " + name +
                        " age: " + age +
                        " gender: " + gender +
                        " baseSalary: " + baseSalary +
                        " bonus: " + bonus +
                        " Salary:" + (baseSalary + baseSalary * commission) +
                        " commission: " + commission
        );
    }
}
