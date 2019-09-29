package HeadFirstJava.TryCatchFinally;

public class TestExceptions  {
    public static void main(String[] args) {
        String test = "Yes";
        try{
            System.out.println("?????? try");
            doRisky(test);
            System.out.println("????? try");
        } catch (ScaryException se){
            System.out.println("!!!");
        } finally {
            System.out.println("Finally");
        }
    }

    static void doRisky(String test) throws ScaryException {
        System.out.println("?????? ???????? ??????");
        if("Yes".equals(test)){
            throw new ScaryException();
        }
        System.out.println("????? ???????? ??????");
        return;
    }
}
