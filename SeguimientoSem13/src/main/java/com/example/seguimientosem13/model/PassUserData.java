package com.example.seguimientosem13.model;

public class PassUserData {

    //formato singleton
    private static PassUserData instance;
    public String pass = "000000";
    public String textCont;

   private PassUserData(){

   }

    public static PassUserData getInstance() {

       if(instance == null){
           instance = new PassUserData();
       }
        return instance;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTextCont() {
        return textCont;
    }

    public void setTextCont(String textCont) {
        this.textCont = textCont;
    }
}
