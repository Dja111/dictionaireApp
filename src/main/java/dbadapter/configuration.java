package dbadapter;

public class configuration {

    private static final String SERVER ="C:/Users/User/Desktop/dbwort";
    private static final String TYPE = "sqlite:";
    private static final int PORT = 8080;
    private static final  String DATABASE ="DictionaireDB.db";
    private  static final String USER ="root";

    private static final String PASSWORD ="";

    public static  String getSERVER(){
        return SERVER;
    }
    public static  String getTYPE(){
        return TYPE;
    }

    public static String getDATABASE() {
        return DATABASE;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static int getPORT() {
        return PORT;
    }

    public static String getUSER() {
        return USER;
    }
}
