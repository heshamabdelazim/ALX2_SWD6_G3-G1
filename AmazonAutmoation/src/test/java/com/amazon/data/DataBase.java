package com.amazon.data;

public class DataBase {
//    Singleton Design patter return the same one object anywhere

    private static DataBase instance;

    public static DataBase startDataBase(){
        if(instance ==null){
            instance = new DataBase();
        }
        return instance;
    }
    //Singleton done, next are variables + its getters + its setters


public int x = 2;

}

/*
* public static String getUrl(String q){
         if(q.equals("qa")){
             return "qa.team";
         }
         return "https://www.amazon.eg/?language=en_AE";
     }
*
* */