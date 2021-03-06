package net.bakaar.solidviolation.lsp;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LSPViolationTest {

    /**
     * This test should pass, it characterize the Rectangle area behaviour
     */
    @Test
    void calulate_the_area_of_rectangle() {
        // Given
        Rectangle shape = new Rectangle();
        // When
        shape.setWidth(3);
        shape.setHeight(2);
        // Then
        assertThat(shape.area()).isEqualTo(6);
    }

    /**
     * This test should failed because square is not substitutable to a rectangle -> LSP violation
     */
    @Test
    void calculate_the_area_of_square() {
        // Given
        Rectangle shape = new Square();
        // When
        shape.setWidth(3);
        shape.setHeight(2);
        // Then
        assertThat(shape.area()).isEqualTo(6);
    }
}
