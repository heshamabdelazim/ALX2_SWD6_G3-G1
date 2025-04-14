package com.amazon.data;

import javax.xml.crypto.Data;

public class DataBase {
//    Singleton Design patter return the same one object anywhere

    private static DataBase instance;

    public static DataBase startDataBase(){
        if(instance ==null){
            instance = new DataBase();
        }
        return instance;
    }

    /* *****************************
    Singleton done, next are variables + its getters + its setters
    * *******************************/

    public String url = "https://www.amazon.eg/?language=en_AE"; //while registering, maybe be https://qa.team/session/new
//    regular expression for url
    private String email= "+201096933795"; //will modify later to be depi.selenium@qa.team

    private  String password="aA1!testest00";

    /* *****************************
    Setters to put data only "if null"
    * *******************************/
    public void setEmail(String e){
        if(email==null){
        email=e;
        }
    }
    public void setPassword(String p){
        if(password==null){
            password = p;
        }
    }
    /* *****************************
    getters
    * *******************************/
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
    /* *****************************
     logout method to clear after logout and before registeration
    * *******************************/
    public void logout(){
        email=null;
        password=null;
    }
    public static void main (String[] args){
        DataBase s=DataBase.startDataBase();
        s.setEmail("heshamabdelazim3@gmail.com");
        System.out.println(s.email);
        s.setEmail("hi");
        System.out.println(s.email);
        s.logout();
        System.out.println(s.email);
    }
}
