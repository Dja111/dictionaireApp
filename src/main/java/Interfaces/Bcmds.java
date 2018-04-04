package Interfaces;

import dbadapter.list;
import dbadapter.suchens;

import java.util.ArrayList;

public interface Bcmds {

    public suchens forwardSuchen(String wort);
    public  void forwardmerken(String wort,String bedeutung);
    public ArrayList<list> abfragen();
}
