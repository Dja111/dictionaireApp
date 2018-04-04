package dbadapter;

public class list {
    private int id;
    private String wort;
    private String bedeutung;

    public list(int id, String wort , String bedeutung){
        this.id = id;
        this.wort = wort;
        this.bedeutung = bedeutung;

    }

    public int getId(){ return id;}
    
    public String getWort() {
        return wort;
    }

    public String getBedeutung() {
        return bedeutung;
    }



}
