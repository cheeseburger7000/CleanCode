package clean.code.chapter14;

import clean.code.chapter14.refactored.step.by.step.Args;
import clean.code.chapter14.refactored.step.by.step.ArgsException;

public class ArgsTest {
    public static void main(String[] args) throws ArgsException {
        String schema = "n*,p#,m##,e";
        String[] inputs = {"-n", "bi", "-p", "80", "-m", "12.45", "-e", "true"};
        Args args1 = new Args(schema, inputs);
        String n = args1.getString('n'); // bi
        int p = args1.getInt('p'); // 80
        double m = args1.getDouble('m'); // 12.45
        boolean e = args1.getBoolean('e'); // true
        System.out.println("n: " + n);
        System.out.println("p: " + p);
        System.out.println("m: " + m);
        System.out.println("e: " + e);
    }
}
