package NullPattern;


import DependencyInversion.Database;
import DependencyInversion.MySQLDb;

public class CustomerFactory {

    protected Database database;

    public CustomerFactory(){
//        this.database = new Database();
    }

}
