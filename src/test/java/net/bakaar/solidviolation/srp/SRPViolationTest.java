package net.bakaar.solidviolation.srp;

import org.junit.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Imagine we have already discover that we need to calculate pay for more than only employee (let's say manager) and we already have a PayCalulator.
 * Idem for the storage part, because we already store some other objects.
 * <p>
 * We will demonstrate here that we can construct the class by two exclusive ways and it works fine for each of the way.
 * (one of the visible symptom of the SRP : not all the private fields of a class are used for all the public methods of this class)
 */
public class SRPViolationTest {

    /**
     * This test pass without any trouble
     */
    @Test
    public void store_should_save_employee_in_storage() {
        // Given
        EmployeeRepository repository = mock(EmployeeRepository.class);
        Employee employee = new Employee(repository);
        // When
        employee.store();
        // Then
        verify(repository).save(employee);
    }

    /**
     * This test pass without any trouble
     */
    @Test
    public void calculatePay_should_compute_salary() {
        // Given
        PayCalculator calculator = mock(PayCalculator.class);
        given(calculator.calculatePay()).willReturn(new Random(1L).nextInt());
        Employee employee = new Employee(calculator);
        // When
        int salary = employee.calculatePay();
        // Then
        assertThat(salary).isNotZero(); // we hope that is really true !
    }

    /**
     * This test should failed because we handle only the calculation responsibility but not the store one.
     */
    @Test
    public void store_with_calculator() {
        // Given
        PayCalculator calculator = mock(PayCalculator.class);
        given(calculator.calculatePay()).willReturn(new Random(1L).nextInt());
        Employee employee = new Employee(calculator);
        // When
        employee.store();
        // Then
    }

    /**
     * This test should failed because we handle only the storage responsibility but not the calculation one.
     */
    @Test
    public void calculate_with_storage() {
        // Given
        EmployeeRepository repository = mock(EmployeeRepository.class);
        Employee employee = new Employee(repository);
        // When
        employee.calculatePay();
        // Then
    }
}
