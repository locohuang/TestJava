package inheritance;

/**
 * Created by Administrator on 2017-3-17.
 */
public class ColorBox extends Box{

    int color;
    //构造方法
    public ColorBox(int color){

        this.color = color;
    }
    public ColorBox(){

        this.color =0xffffff;
    }
    public int getColor(){
        return this.color;
    }
}
