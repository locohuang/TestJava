package inheritance;

/**
 * Created by Administrator on 2017/4/1.
 */
public class WeightBox extends Box{
    double weight;
    //构造方法
    public WeightBox(double width, double height, double depth,double weight){
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }
    public WeightBox(){
        this.weight = -1;
    }
    public double weight(){
        return this.weight;
    }
}
