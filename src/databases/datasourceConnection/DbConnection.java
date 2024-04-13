package databases.datasourceConnection;

import org.postgresql.ds.PGPoolingDataSource;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;

public class DbConnection {
    private static String username = JOptionPane.showInputDialog(
            null,"Enter Db Username"
    );
    private static JPasswordField pf = new JPasswordField();
    private static int okCxl = JOptionPane.showConfirmDialog(null,pf, "Enter db password",JOptionPane.OK_CANCEL_OPTION);
    private static final char[] password =
            (okCxl == JOptionPane.OK_OPTION) ? pf.getPassword() : null;

    public static void getConnection(){
        var datasource = new PGPoolingDataSource();
        datasource.setServerName("localhost");
        datasource.setPortNumber(5432);
        datasource.setDatabaseName("postgres");
        datasource.setUser(username);
        datasource.setPassword(new String(password));

        try(Connection conn = datasource.getConnection()){
            System.out.println("Connected");
        } catch (
                SQLException e){
            System.out.println("There was an error");
            e.printStackTrace();
        }
    }




}
