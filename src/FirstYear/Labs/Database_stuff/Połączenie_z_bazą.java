package FirstYear.Labs.Database_stuff;

import java.sql.*;
public class Połączenie_z_bazą {
    public static void main(String args[] ) {
        Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
        } catch (Exception e ) {System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Openeddatabase successfully");}
}