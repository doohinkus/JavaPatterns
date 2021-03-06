package SingleResponsibilityII;

public class ViolationChecker {
    public static Boolean isValid(Pair pair){
        String first = pair.getFirst();
        String second = pair.getSecond();
        try{
          Integer.parseInt(first);
          Integer.parseInt(second);
        } catch (NumberFormatException nfe){
            return false;
        }

        return true;
    }
}
