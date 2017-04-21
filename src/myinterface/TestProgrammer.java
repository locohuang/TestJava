package myinterface;

/**
 * Created by Administrator on 2017-4-18.
 */
public class TestProgrammer {
    public static void main(String[] args) {
        JavaProgrammer javaer = new JavaProgrammer();
        //javaer.displayId("1001");
        PythonProgrammer per = new PythonProgrammer();
        CSharpProgrammer cer = new CSharpProgrammer();
        PhpProgrammer phper = new PhpProgrammer();
        Manager manager = new Manager();
        manager.send(javaer,"1001");
        manager.send(per,"1002");
        manager.send(cer,"1003");
        manager.send(phper,"1004");
    }
}
