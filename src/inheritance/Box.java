package inheritance;

/**
 * Created by Administrator on 2017-3-17.
 */
public class Box{
    double width;
    double height;
    double depth;
    //构造方法
    public Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public Box(){
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }
    public double volumn(){
        return width*height*depth;
    }
}
