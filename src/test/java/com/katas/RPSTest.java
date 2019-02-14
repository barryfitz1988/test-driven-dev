package com.katas;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RPSTest {



    // Arrange
    private String player_one_hand = null;
    private String player_two_hand = null;
    private RPS rps = new RPS(player_one_hand,player_two_hand);

    @Test
    public void test_draw_game() {

        // Arrange
        this.player_one_hand = "Rock";
        this.player_two_hand = player_one_hand;

        // Act
        String newGame = this.rps.play_rock_paper_scissors(this.player_one_hand,this.player_two_hand);

        // Assert
        assertThat(newGame).isEqualTo("draw");
    }


    @Test
    public void test_rock_beats_scissors() {

        // Arrange
        this.player_one_hand = "rock";
        this.player_two_hand = "scissors";

        // Act
        String newGame = this.rps.play_rock_paper_scissors(this.player_one_hand, this.player_two_hand);

        // Assert
        assertThat(newGame).isEqualTo("rock wins");
    }

    @Test
    public void test_paper_beats_rock() {

        // Arrange
        this.player_one_hand = "rock";
        this.player_two_hand = "paper";

        // Act
        String newGame = this.rps.play_rock_paper_scissors(this.player_one_hand, this.player_two_hand);

        // Assert
        assertThat(newGame).isEqualTo("paper wins");
    }

    @Test
    public void test_scissors_beats_paper(){

        // Arrange
        this.player_one_hand = "paper";
        this.player_two_hand = "scissors";

        // Act
        String newGame = this.rps.play_rock_paper_scissors(this.player_one_hand, this.player_two_hand);

        // Assert
        assertThat(newGame).isEqualTo("scissor wins");
    }



}
