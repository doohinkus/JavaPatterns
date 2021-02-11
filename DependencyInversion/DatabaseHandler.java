package DependencyInversion;

public class DatabaseHandler {
    private Database database;
    private MySQLDb mySQLDb;
    public DatabaseHandler(Database database){
        this.database = database;
    }
    public void connect(){
        this.database.connect();
    }
    public void disconnect(){
        this.database.disconnect();
    }
//    public DatabaseHandler(){
//        this.mySQLDb = new MySQLDb();
//    }
//    public void connect(){
//        this.mySQLDb.connect();
//    }
//    public void disconnect(){
//        this.mySQLDb.disconnect();
//    }
}
