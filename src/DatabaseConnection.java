public class DatabaseConnection {
    private static DatabaseConnection instance;
    private DatabaseConnection() {
        Connect();
    }

    public static DatabaseConnection getInstance()
    {
        // Check if an instance exists
        if (instance == null) {
            // If no instance exists, create one
            instance = new DatabaseConnection();
        }
        Disconnect();
        return instance;
    }

    private void Connect(){
        System.out.println("Connected to the Database");
    }
    private static void Disconnect(){
        System.out.println("Disconnected from the Database");
    }
}
class gfg{
    public static void main(String[] args) {
        DatabaseConnection dc = DatabaseConnection.getInstance();
    }
}
