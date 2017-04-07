package inheritance;

/**
 * Created by Administrator on 2017-4-7.
 */
public class Shipment extends WeightBox{
    private double cost;
    public Shipment(double width,double height,double depth,double weight,double cost){
        super(width,height,depth,weight);
        this.cost = cost;
    }
    public Shipment(){
        super();
        this.cost = -1;
    }
    public double getCost(){
        return this.cost;
    }
}
