package inheritance;

/**
 * Created by Administrator on 2017/4/1.
 */
public class TestBox {
    public static void main(String[] args) {
        WeightBox wBox = new WeightBox(1,2,3,4);
        System.out.println(wBox.volumn());
        System.out.println(wBox.weight());
    }
}
