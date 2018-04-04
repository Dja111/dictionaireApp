package dbadapter;


import Interfaces.merk;
import Interfaces.suchwort;


import java.sql.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.lang.Class.forName;

public class DBFacade implements merk, suchwort {

    private static DBFacade instance;

    private DBFacade() {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // singleton

    public static DBFacade getInstance() {
        if (instance == null) {
            instance = new DBFacade();
        }
        return instance;
    }

    // add wort mit bedeutung in der Merkliste

    public void add(String wort, String bedeutung) {

        String sql = "INSERT INTO merken (wort,bedeutung) VALUES(?,?) ";

        try (Connection connection = DriverManager.getConnection(
                "jdbc:" + configuration.getTYPE() + "/"
                        + configuration.getSERVER() + "/"
                        + configuration.getDATABASE())) {

            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setString(1, wort);
                ps.setString(2, bedeutung);
                ps.executeUpdate();

            } catch (SQLException e) {

                e.printStackTrace();

            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ausgeben der inhalt von der ganzen List


    public ArrayList<list> getlist() {

        int ids = 0;
        String wort ="";
        String bedeutung ="";
        ArrayList<list> answer = new ArrayList<list>();

        String sql = "SELECT * FROM merken";

        try (Connection connection = DriverManager.getConnection("jdbc:" + configuration.getTYPE() +"/"
                + configuration.getSERVER() +"/" + configuration.getDATABASE())) {

            try (PreparedStatement ps = connection.prepareStatement(sql)) {



                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        ids = rs.getInt(1);
                        wort = rs.getString(2);
                        bedeutung = rs.getString("bedeutung");
                        list resulat = new list(ids, wort, bedeutung);
                        answer.add(resulat);
                    }
                }


            } catch (SQLException e) {
                e.printStackTrace();

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return answer;
    }


    // Ein Wort Suchen


    public suchens getWort(String wort) {

        suchens answer = null;

        int  ids = 0;

        String bedeut = null;

        String sql = "SELECT id ,bedeutung FROM suchen WHERE wort =? ";


        try (Connection connection = DriverManager.getConnection("jdbc:" + configuration.getTYPE()+
                "/"+ configuration.getSERVER() +
                "/"+ configuration.getDATABASE())) {

            try (PreparedStatement ps = connection.prepareStatement(sql)) {

                ps.setString(1,wort);


                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        ids = rs.getInt("id");
                        bedeut = rs.getString(2);
                        answer = new suchens(ids,wort,bedeut);



                    }


                } catch (SQLException e) {
                    e.printStackTrace();


                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return answer;
    }

}
