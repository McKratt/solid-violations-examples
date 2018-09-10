package net.bakaar.solidviolation.srp;

public class Employee {

    private String nom;
    private String tel;
    //This two should be final because they are both necessary for the good behaviour of the class.
    private PayCalculator calculator;
    private EmployeeRepository repository;

    public Employee(PayCalculator calculator) {
        this.calculator = calculator;
    }

    public Employee(EmployeeRepository repository) {

        this.repository = repository;
    }

    public int calculatePay() {
        // Here you should have some logic to calculate the actual pay of the current employee
        return calculator.calculatePay();
    }

    public void store() {
        repository.save(this);
    }
}
