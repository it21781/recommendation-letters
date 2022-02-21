package gr.hua.dit.ds.team8.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDb {
    public static void update(appove) {
        String approve = null;
        try
        {
            // create a java mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/student_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "pass123");

            // create the java mysql update preparedstatement
            String query = "update letters set approved = ? where id = ?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, approve);
            String letterid = null;
            preparedStmt.setString(2, letterid);

            // execute the java preparedstatement
            preparedStmt.executeUpdate();

            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}