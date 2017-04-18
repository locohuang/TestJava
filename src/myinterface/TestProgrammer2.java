package myinterface;

/**
 * Created by Administrator on 2017-4-18.
 */
public class TestProgrammer2 {
    public static void main(String[] args) {
        JavaProgrammer javaer = new JavaProgrammer();
        PythonProgrammer per = new PythonProgrammer();
        CSharpProgrammer cer = new CSharpProgrammer();
        Manager2 m2 = new Manager2();
        m2.sendJava(javaer);
        m2.sendPython(per);
        m2.sendCSharp(cer);
    }
}
