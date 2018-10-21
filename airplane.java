import java.util.ArrayList;

public class airplane extends transport {
    airplane(){
        method = "airplane";
        getToStationTime = 3;
        returnFromStationTime = 3;
        ticketTime = 2;
        securitycheckTime =2;
        waitingTime = 2;
        speed = 3;
        pricePerKil = 0.75;
    }
    @Override
    public ArrayList<Double> timeMoneySpending(double kil){
        ArrayList<Double> calculate = new ArrayList<>();
        calculate.add(getToStationTime + returnFromStationTime + ticketTime + securitycheckTime + waitingTime + kil / speed);
        calculate.add(kil * pricePerKil);
        return calculate;
    }


}
