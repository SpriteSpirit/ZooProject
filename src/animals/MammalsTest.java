package animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MammalsTest {
    private Mammals mammal;

    @BeforeEach
    void setUp() {
        mammal = new Mammals("Lion", 5, "Savannah");
    }

    @Test
    void testSetEnvironmentWhenValidStringThenEnvironmentIsSet() {
        // Arrange
        String newEnvironment = "Jungle";

        // Act
        mammal.setEnvironment(newEnvironment);

        // Assert
        assertEquals(newEnvironment, mammal.getEnvironment());
    }

    @Test
    void testSetEnvironmentWhenNullStringThenEnvironmentNotSet() {
        // Arrange
        String oldEnvironment = mammal.getEnvironment();

        // Act
        mammal.setEnvironment(null);

        // Assert
        assertEquals(oldEnvironment, mammal.getEnvironment());
    }

    @Test
    void testSetEnvironmentWhenEmptyStringThenEnvironmentNotSet() {
        // Arrange
        String oldEnvironment = mammal.getEnvironment();

        // Act
        mammal.setEnvironment("");

        // Assert
        assertEquals(oldEnvironment, mammal.getEnvironment());
    }

    @Test
    void testSetEnvironmentWhenBlankStringThenEnvironmentNotSet() {
        // Arrange
        String oldEnvironment = mammal.getEnvironment();

        // Act
        mammal.setEnvironment(" ");

        // Assert
        assertEquals(oldEnvironment, mammal.getEnvironment());
    }
}