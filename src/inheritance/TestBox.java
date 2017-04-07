package inheritance;

/**
 * Created by Administrator on 2017/4/1.
 */
public class TestBox {
    public static void main(String[] args) {
        WeightBox wBox = new WeightBox(1,2,3,4);
        System.out.println(wBox.volumn());
        System.out.println(wBox.weight());

        Box box ;
        box = wBox;//子类对象赋值给超类变量,超类变量只能访问超类里面有的实例变量及成员方法，
        //但是无法访问子类的实例变量及成员方法,因为超类里面没有
        System.out.println("volumn:"+box.volumn());
        //System.out.println("weight:"+box.weight);
        //超类对象不能赋值给子类变量
        /*Box box2 = new Box(3,4,5);
        WeightBox wb2 =(WeightBox) box2;
        System.out.println("volumn:"+wb2.volumn());
        System.out.println("weight:"+wb2.weight);*/

        Shipment shipment = new Shipment(1,2,3,4,1000);
        System.out.println("volumn:"+shipment.volumn());
        System.out.println("weight:"+shipment.weight());
        System.out.println("cost:"+shipment.getCost());
    }
}
