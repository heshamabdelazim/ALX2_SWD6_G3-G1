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
    Singleton done, next are variables
    * *******************************/

    public String url = "https://www.amazon.eg/?language=en_AE"; //while registering, maybe be https://qa.team/session/new
//    regular expression for url
    public String email= "+201096933795"; //will modify later to be depi.selenium@qa.team

    public  String password="aA1!testest00";

    public static String registerMail = "abcABC.ABC@gmail.com";
    public static String registerPassword = "Hesh123@#$";
    public static String registerName = "Hesham";
    public static String registerPhone = "32324";

}
