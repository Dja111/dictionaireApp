package dbadapter;

public class suchens {
    private int id;
    private String wort;
    private String bedeutung ;


    public suchens(int id, String wort , String bedeutung){
               this.id = id;
               this.wort = wort;
               this.bedeutung = bedeutung;
    }
    public int getId(){ return id;    }

    public String getWort() {   return wort;    }

    public String getBedeutung() {
        return bedeutung;
    }



    @Override
    public String toString() {
        return " Das SuchenErgebnis " + id +"von dem :" + wort + "ist :" + bedeutung;
    }
}

