package com.katas;

import org.junit.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingTest {

    // Arrange
    private int ball_1 = 0;
    private int ball_2 = 0;
    private Bowling bowling = new Bowling(0,0);
    private Random rand = new Random();

    @Test
    public void test_that_the_bowling_game_is_valid() {

        // Arrange
        this.ball_1 = this.rand.nextInt(10);
        this.ball_2 = this.rand.nextInt(10 - this.ball_1 );

        // Act
        boolean bowlingGame = this.bowling.carry_out_bowling_game(ball_1,ball_2);

        // Assert
        assertThat(bowlingGame).isEqualTo(true);
    }

    @Test
    public void test_that_first_ball_can_roll_anything_between_0_10_fail() {

        // Arrange
        this.ball_1 = this.rand.nextInt((12-11) + 1) + 11;
        this.ball_2 = 0;

        // Act
        boolean bowlingGame = this.bowling.carry_out_bowling_game(this.ball_1,ball_2);

        // Assert
        assertThat(bowlingGame).isEqualTo(false);
    }

    @Test
    public void test_that_second_ball_can_knock_down_the_remainder_as_long_as_its_less_than_10_fail() {

        // Arrange
        this.ball_1 = this.rand.nextInt((12-11) + 1) + 11;
        this.ball_2 = 10 - ball_1;

        // Act
        boolean bowlingGame = this.bowling.carry_out_bowling_game(this.ball_1,this.ball_2);

        // Assert
        assertThat(bowlingGame).isEqualTo(false);
    }

    @Test
    public void test_for_strike() {

        // Arrange
        this.ball_1 = this.rand.nextInt(11);
        this.ball_2 = this.rand.nextInt(11 - this.ball_1);

        // Act
        boolean bowlingGame = this.bowling.carry_out_bowling_game(this.ball_1,this.ball_2);
        // Assert
        assertThat(bowlingGame).isEqualTo(false);
    }








}
