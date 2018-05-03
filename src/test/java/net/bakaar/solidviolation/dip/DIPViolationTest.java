package net.bakaar.solidviolation.dip;

import org.junit.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

/**
 * Here the manager should not depends on the both workers, but it should have an abstraction to describe what is a worker.
 *
 * @see Manager
 * Note : It also violate the OCP !
 */
public class DIPViolationTest {

    private Manager manager = new Manager();

    /**
     * The great similarity between test and the presence of two different implementations inside those tests should be a trigger to refactoring.
     */
    @Test
    public void manager_should_manage_worker() {
        // Given
        Worker worker = spy(new Worker());
        manager.setWorker(worker);
        // When
        manager.manage();
        // Then
        verify(worker).work();
    }

    @Test
    public void manager_should_manage_superworker() {
        // Given
        SuperWorker worker = spy(new SuperWorker());
        manager.setWorker(worker);
        // When
        manager.manage();
        // Then
        verify(worker).work();
    }
}
