package NullPattern;

public class NullCustomer extends AbstractCustomer{
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getCustomer() {
        return "Hey man there is no one here by that name!!!";
    }
}
