package myinterface;

/**
 * Created by Administrator on 2017-4-18.
 */
public class TestProgrammer {
    public static void main(String[] args) {
        JavaProgrammer javaer = new JavaProgrammer();
        PythonProgrammer per = new PythonProgrammer();
        CSharpProgrammer cer = new CSharpProgrammer();
        PhpProgrammer phper = new PhpProgrammer();
        Manager manager = new Manager();
        manager.send(javaer);
        manager.send(per);
        manager.send(cer);
        manager.send(phper);
    }
}
