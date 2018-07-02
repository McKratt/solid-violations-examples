package net.bakaar.solidviolation.srp;

public class EmloyeeRepositoryImpl implements EmployeeRepository {

    @Override
    public void save(Employee employee) {
        System.out.println("Saving employee");
    }
}
