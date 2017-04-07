package inheritance;

/**
 * Created by Administrator on 2017/4/1.
 */
public class WeightBox extends Box{
    private double weight;
    int color;
    //构造方法
    public WeightBox(double width, double height, double depth,double weight){
       /* this.width = width;
        this.height = height;
        this.depth = depth;*/
        super(width,height,depth);
        this.weight = weight;
    }
    public WeightBox(){
        /*this.width = -1;
        this.height = -1;
        this.depth = -1;*/
        super();
        super.color =2;
        this.color = 1;
        this.weight = -1;
    }
    public double weight(){
        return this.weight;
    }
}
