package databases.datasourceConnection;


public class Main {
    private final static String CONN_STRING = "jdbc:postgresql://localhost:5432/postgres";
    public static void main(String[] args) {

       DbConnection.getConnection();


    }
}
