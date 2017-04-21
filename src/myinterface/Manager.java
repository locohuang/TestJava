package myinterface;

/**
 * Created by Administrator on 2017-4-18.
 */
public class Manager {
    public void send(Programmer programmer){
        programmer.code();
    }
    public void send(Programmer programmer,String id){
        programmer.code();
        programmer.displayId(id);

    }
}
