public class TestEmployee {
    public static void main(String[] args) {
        Employee manager = new Manager("Udara",30,"Male",600000,85000);
        Employee worker = new Worker("fix",22,"Female",20,180);
        Employee salesPerson = new SalesPerson("Sadu",30,"Male",600000,85000,0.08);
        manager.displayEmployeeDetails();
        worker.displayEmployeeDetails();
        salesPerson.displayEmployeeDetails();
    }
}
