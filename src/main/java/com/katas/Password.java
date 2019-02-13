package com.katas;

public class Password {


    private String password;

    public Password(String password)
    {
        this.password = password;
    }



    public boolean valid_password(String password) {

         boolean return_value = true;

         if(password.length() < 8 ){
             return_value = false;
         }

         if (password.toLowerCase().equals(password)){
             return_value = false;
         }

         if (password.toUpperCase().equals(password)){
             return_value = false;
         }

        if (password.matches("[a-zA-Z]+")){
            return_value = false;
        }

        if (password.matches("^[^_]+$")){
            return_value = false;
        }


         return return_value;
    }

}
