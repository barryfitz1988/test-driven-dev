package com.katas;

public class Bowling {

    private int ball_1;
    private int ball_2;

    public Bowling(int ball_1, int ball_2)
    {
        this.ball_1 = ball_1;
        this.ball_2 = ball_2;
    }


    public boolean carry_out_bowling_game(int ball_1, int ball_2) {

        boolean return_value = true;

        for (int x = 0; x < 1000; x++) {

            if (ball_1 > 10) {
                return_value = false;
            }

            if (ball_2 < 0) {
                return_value = false;
            }

            if (ball_2  > 0) {
                return_value = false;
            }
        }

        return return_value;
    }


    public void carry_out_loads_of_games(int ball_1, int ball_2){

        //for (int x = 0; x < 100; x++){
            System.out.println("ball_1  " + ball_1);
            System.out.println("ball_2  " + ball_2);

        //}



    };



}
