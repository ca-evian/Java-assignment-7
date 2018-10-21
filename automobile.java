import java.util.ArrayList;

public class automobile extends transport {
    automobile(){
        method = "automobile";
        getToStationTime = 1;
        returnFromStationTime =1;
        ticketTime = 1;
        securitycheckTime = 1;
        waitingTime = 1;
        speed = 1;
        pricePerKil = 0.32;
    }

    @Override
    public ArrayList<Double> timeMoneySpending(double kil) {
        ArrayList<Double> calculate = new ArrayList<>();
        calculate.add(getToStationTime + returnFromStationTime + ticketTime + securitycheckTime + waitingTime + kil / speed);
        calculate.add(kil * pricePerKil);
        return calculate;
    }
}
