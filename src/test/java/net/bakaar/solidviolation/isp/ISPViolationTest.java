package net.bakaar.solidviolation.isp;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ISPViolationTest {

    /**
     * This test is awaited for a ToyHouse because we selling ToyHouse so they should have a price.
     */
    @Test
    void setPrice_should_set_price() {
        // Given
        ToyHouse toy = new ToyHouse();
        // When
        toy.setPrice(29.90);
        // Then
        assertThat(toy.getPrice()).isEqualTo(29.90);
    }

    /**
     * This test is not awaited because, it is well known, a ToyHouse cannot fly !
     * <br>
     * You should separate the fly method from the setPrice method.
     */
    @Test
    void fly_should_dont_know() {
        // Given
        ToyHouse toy = new ToyHouse();
        // When
        toy.fly();
        // Then
    }
}
