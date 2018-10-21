import java.util.Scanner;

public class control {
    public static void main(String[] args){
        String departure;
        String destination;
        double distance;
        Scanner s = new Scanner(System.in);
        System.out.println("输入出发地：");
        departure = s.nextLine();
        System.out.println("输入目的地：");
        destination = s.nextLine();
        System.out.println("输入距离：");
        distance = s.nextDouble();
        automobile a = new automobile();
        railway b = new railway();
        airplane c = new airplane();
        System.out.print("汽车");
        a.print(a.timeMoneySpending(distance));
        System.out.print("火车");
        b.print(b.timeMoneySpending(distance));
        System.out.print("飞机");
        c.print(c.timeMoneySpending(distance));
    }
}
