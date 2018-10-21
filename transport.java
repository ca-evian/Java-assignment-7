import java.util.ArrayList;

public abstract class transport{
    public String method;
    public int getToStationTime;
    public int returnFromStationTime;
    public int ticketTime;
    public int securitycheckTime;
    public int waitingTime;
    public int speed;
    public double pricePerKil;

    public abstract ArrayList<Double> timeMoneySpending(double kil);

    public void print(ArrayList<Double> spending){
        System.out.println("消耗时间：" + spending.get(0) +" 金钱：" + spending.get(1));

    }
}