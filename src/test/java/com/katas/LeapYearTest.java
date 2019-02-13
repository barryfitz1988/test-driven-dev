package com.katas;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearTest {

    // Arrange
    private int year = 0;
    private LeapYear leapYear = new LeapYear(0);

    @Test
    public void test_that_the_leap_year_is_valid() {

        // Arrange
        this.year = 1996;

        // Act
        boolean newYear = this.leapYear.valid_leap_year(this.year);

        // Assert
        assertThat(newYear).isEqualTo(true);
    }

    @Test
    public void test_check_if_number_is_divisible_by_4_fails() {

        // Arrange
        this.year = 1995;

        // Act
        boolean newYear = this.leapYear.valid_leap_year(this.year);

        // Assert
        assertThat(newYear).isEqualTo(false);
    }

    @Test
    public void test_check_if_number_is_divisible_by_100_fails() {

        // Arrange
        this.year = 1999;

        // Act
        boolean newYear = this.leapYear.valid_leap_year(this.year);

        // Assert
        assertThat(newYear).isEqualTo(false);
    }

    @Test
    public void test_check_if_number_is_divisible_by_400_fails() {

        // Arrange
        this.year = 2013;

        // Act
        boolean newYear = this.leapYear.valid_leap_year(this.year);

        // Assert
        assertThat(newYear).isEqualTo(false);
    }

}


