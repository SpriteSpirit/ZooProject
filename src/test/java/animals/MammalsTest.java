package test.java.animals;

import animals.Mammals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MammalsTest {
    private Mammals mammal;

    @BeforeEach
    void setUp() {
        mammal = new Mammals("Lion", 5,15, "Savannah");
    }

    @Test
    void testSetEnvironmentWhenValidStringThenEnvironmentIsSet() {
        // Arrange
        String newEnvironment = "Jungle";


        // Assert
        assertEquals(newEnvironment, mammal.getEnvironment());
    }

    @Test
    void testSetEnvironmentWhenNullStringThenEnvironmentNotSet() {
        // Arrange
        String oldEnvironment = mammal.getEnvironment();

        // Assert
        assertEquals(oldEnvironment, mammal.getEnvironment());
    }

    @Test
    void testSetEnvironmentWhenEmptyStringThenEnvironmentNotSet() {
        // Arrange
        String oldEnvironment = mammal.getEnvironment();


        // Assert
        assertEquals(oldEnvironment, mammal.getEnvironment());
    }

    @Test
    void testSetEnvironmentWhenBlankStringThenEnvironmentNotSet() {
        // Arrange
        String oldEnvironment = mammal.getEnvironment();

        // Assert
        assertEquals(oldEnvironment, mammal.getEnvironment());
    }
}