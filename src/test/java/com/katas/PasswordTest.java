package com.katas;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordTest {

    // Arrange
    private String test = null;
    private Password password = new Password(null);

    @Test
    public void test_that_the_password_is_valid() {

        // Arrange
        this.test = "Test_Barry_1";

        // Act
        boolean newPassword = this.password.valid_password(this.test);

        // Assert
        assertThat(newPassword).isEqualTo(true);
    }


    @Test
    public void test_length_of_password_is_less_than_eight_fails() {

        // Arrange
        this.test = "test";

        // Act
        boolean newPassword = this.password.valid_password(this.test);

        // Assert
        assertThat(newPassword).isEqualTo(false);
    }

    @Test
    public void test_that_password_has_has_no_capital_fails() {

        // Arrange
        this.test = "TESTTEST";

        // Act
        boolean newPassword = this.password.valid_password(this.test);

        // Assert
        assertThat(newPassword).isEqualTo(false);
    }

    @Test
    public void test_that_password_has_has_no_lowercase_letter_fails() {

        // Arrange
        this.test = "TTTTTTTTTTTT";

        // Act
        boolean newPassword = this.password.valid_password(this.test);

        // Assert
        assertThat(newPassword).isEqualTo(false);
    }


    @Test
    public void test_that_password_has_a_number_fails() {

        // Arrange
        this.test = "T";

        // Act
        boolean newPassword = this.password.valid_password(this.test);

        // Assert
        assertThat(newPassword).isEqualTo(false);
    }

    @Test
    public void test_that_password_has_an_underscore_fails() {

        // Arrange
        this.test = "T";

        // Act
        boolean newPassword = this.password.valid_password(this.test);

        // Assert
        assertThat(newPassword).isEqualTo(false);
    }


}
