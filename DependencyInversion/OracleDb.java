package DependencyInversion;

public class OracleDb implements Database{
    @Override
    public void connect(){
        System.out.println("Connecting Oracle DB.....");

    }
    @Override
    public void disconnect(){
        System.out.println("Disconnecting Oracle DB.....");
    }
}
