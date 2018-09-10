package net.bakaar.solidviolation.srp;

public class EntrepriseService {

    public int calculatePayForEmplyee(Employee employee) {
        return employee.calculatePay();
    }

    public void storeNewEmployee(Employee employee) {
        employee.store();
    }
}
