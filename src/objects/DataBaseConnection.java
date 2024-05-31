package objects;

/*
 * Question 15: Design Patterns (Singleton)
Create a class DatabaseConnection that implements the Singleton pattern.
Ensure that only one instance of DatabaseConnection is created.
Demonstrate the Singleton pattern in a main method.
 */
public class DataBaseConnection {
    private static DataBaseConnection dataBaseConnection;

    private DataBaseConnection() {

    }

    public static DataBaseConnection getDataBaseConnection() {
        if (dataBaseConnection == null) {
            dataBaseConnection = new DataBaseConnection();
        }
        return dataBaseConnection;
    }
}
