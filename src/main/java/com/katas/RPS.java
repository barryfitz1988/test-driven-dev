package com.katas;

public class RPS {

    private String player_one_hand;
    private String player_two_hand;

    public RPS(String player_one_hand, String player_two_hand)
    {
        this.player_one_hand = player_one_hand;
        this.player_two_hand = player_two_hand;
    }

    public String play_rock_paper_scissors(String player_one_hand, String player_two_hand) {

        String return_value = null;

        if (player_one_hand.toUpperCase().equals(player_two_hand.toUpperCase())){

            return_value = "draw";
        }

        if (player_one_hand.equalsIgnoreCase("rock") && player_two_hand.equalsIgnoreCase("scissors")
            || player_one_hand.equalsIgnoreCase("scissors") && player_two_hand.equalsIgnoreCase( "rock")){

            return_value = "rock wins";
        }


        if (player_one_hand.equalsIgnoreCase("rock") && player_two_hand.equalsIgnoreCase("paper")
                || player_one_hand.equalsIgnoreCase("paper") && player_two_hand.equalsIgnoreCase( "rock")) {

            return_value = "paper wins";
        }

        if (player_one_hand.equalsIgnoreCase("paper") && player_two_hand.equalsIgnoreCase("scissors")
                || player_one_hand.equalsIgnoreCase("scissors") && player_two_hand.equalsIgnoreCase( "paper"))
        {
            return_value = "scissor wins";
        }

       return return_value;
    }


}
