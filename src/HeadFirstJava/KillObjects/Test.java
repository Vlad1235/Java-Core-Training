package HeadFirstJava.KillObjects;

public class Test {
    Duck d = new Duck();

    public void go() {
        d = new Duck();
        d.setVar(12);
    }

        public static void main(String[] args){
            Test test = new Test();
            test.d.setVar(10);
            test.go();
            System.out.println(test.d.getVar());
        }
    }
