package springexamples;

public class Main {

    public static void main(String[] args) {

        DatabaseConnection db = new DatabaseConnection();

        EmailService em = new EmailService();
        em.dbConnection.sendEmail();
    }

}



class EmailService{

    IDatabaseConnection dbConnection = new DatabaseConnection();

    public EmailService() {

    }
}





interface IDatabaseConnection{
    void sendEmail();
}

class DatabaseConnection implements IDatabaseConnection {

    @Override
    public void sendEmail() {

    }
}