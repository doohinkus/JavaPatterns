package NullPattern;

import java.util.ArrayList;
import java.util.List;

public class DatabaseNull {

    private List<String> customerNames;
    public DatabaseNull(){
        this.customerNames = new ArrayList<>();
        this.customerNames.add("Jimmy");
        this.customerNames.add("Jack");
        this.customerNames.add("John");
        this.customerNames.add("Jake");
        this.customerNames.add("Jason");

    }
   public boolean existCustomer(String name){
      for(String s : customerNames){
          if(s.equals(name)) return true;
      }
       return false;

   }
}
