public class Worker extends Employee{
    protected double hourlyRate;
    protected double hoursWorked;

    public Worker(String name,double age,String gender,double hourlyRate,double hoursWorked){
        super(name, age, gender);
        this.hourlyRate = hourlyRate;
        this.hoursWorked =hoursWorked;
    }
    public void calculateSalary(){
        System.out.println(hourlyRate*hoursWorked);
    }
    public void displayEmployeeDetails(){
        System.out.println(
                "name: "+name+
                        " age: "+age+
                        " gender: "+gender+
                        " baseSalary: "+hourlyRate+
                        " bonus: "+hoursWorked+
                        " Salary:"+hourlyRate*hoursWorked
        );
    }
}
