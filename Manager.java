public class Manager extends Employee{
    protected double baseSalary;
    protected double bonus;

    public Manager(String name,double age,String gender,double baseSalary,double bonus){
        super(name, age, gender);
        this.baseSalary = baseSalary;
        this.bonus =bonus;
    }
    public void calculateSalary(){
        System.out.println(baseSalary+bonus);
    }
    public void displayEmployeeDetails(){
        System.out.println(
                        "name: "+name+
                        " age: "+age+
                        " gender: "+gender+
                        " baseSalary: "+baseSalary+
                        " bonus: "+bonus+
                        " Salary:"+(baseSalary+bonus)
        );
    }
}
