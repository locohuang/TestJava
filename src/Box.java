/**
 * Created by Administrator on 2017-3-17.
 */
public class Box {
    double width;
    double height;
    double depth;
    //构造方法
    public Box(double width,double height,double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volumn(){
        return width*height*depth;
    }

    void setDim(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }
}
