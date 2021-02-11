package DependencyInversion;

public class MySQLDb implements Database {
    @Override
    public void connect(){
        System.out.println("Connecting to MySQLDB...");
    }
    @Override
    public void disconnect(){
        System.out.println("Disconnecting from MySQLDB...");
    }
}
