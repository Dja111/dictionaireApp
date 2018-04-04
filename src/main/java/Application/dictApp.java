package Application;

import Interfaces.Bcmds;
import dbadapter.DBFacade;
import dbadapter.list;
import dbadapter.suchens;

import java.util.ArrayList;

public class dictApp implements Bcmds {

    private static dictApp instance;

    // implement of the Singleton pattern

    public static dictApp getInstance(){
        if(instance == null){
            instance = new dictApp();
        }
        return instance;
    }


    public void forwardmerken(String wort, String bedeutung) {

        try {
            DBFacade.getInstance().add(wort,bedeutung);
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public suchens forwardSuchen(String wort) {
        suchens result = null;

        try {
            result = DBFacade.getInstance().getWort(wort);
        }catch (Exception e){
            e.printStackTrace();
        }

        return  result;
    }


    public ArrayList<list> abfragen() {
        ArrayList<list> answer = null;
        try {

            answer = DBFacade.getInstance().getlist();

        } catch (Exception e){
            e.printStackTrace();
        }
            return  answer;
    }

}
