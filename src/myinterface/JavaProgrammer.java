package myinterface;

/**
 * Created by Administrator on 2017-4-18.
 */
public class JavaProgrammer implements Programmer{
    public void code(){
        System.out.println("Write Java Code!");
    }
    public void displayId(String id){
        //System.out.println("java id:"+id);
        Programmer.super.displayId(id);
    }
}
