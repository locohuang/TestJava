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
    public Box(double width,double height){
        this.width = width;
        this.height = height;
    }
    double volumn(){
        return width*height*depth;
    }

    Box newBox(){
        Box b = new Box(1,2,3);
        return b;
    }
}
