import java.util.ArrayList;

public class railway extends transport {
    railway() {
        method = "railway";
        getToStationTime = 2;
        returnFromStationTime = 2;
        ticketTime = 1;
        securitycheckTime = 1;
        waitingTime = 1;
        speed = 2;
        pricePerKil = 0.45;
    }

    @Override
    public ArrayList<Double> timeMoneySpending(double kil) {
        ArrayList<Double> calculate = new ArrayList<>();
        calculate.add(getToStationTime + returnFromStationTime + ticketTime + securitycheckTime + waitingTime + kil / speed);
        calculate.add(kil * pricePerKil);
        return calculate;
    }
}
