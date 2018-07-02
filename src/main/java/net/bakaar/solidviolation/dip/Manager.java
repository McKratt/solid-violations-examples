package net.bakaar.solidviolation.dip;

public class Manager {

    private Employee employee;

    public void manage() {
        employee.work();
    }

    public void setEmployee(Employee empl) {
        this.employee = empl;
    }

}
