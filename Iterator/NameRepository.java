package Iterator;

public class NameRepository {
    private String [] names = {"hokey", "dokey", "pokey", "lokey", "sokie"};

    public Iterator getIterator(){
        return new NameIterator(names);
    }
}
