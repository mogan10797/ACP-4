import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        ArrayList<Car> Carlists = new ArrayList<Car>();
        ArrayList<Bus> Buslists = new ArrayList<Bus>();
        ArrayList<Sedan> Sedenlists = new ArrayList<Sedan>();
        ArrayList<Truck> Trucklists = new ArrayList<Truck>();
        Scanner scn = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("1.Car---2.Bus---3.Seden---4.Truck---5.Search---6.Quit");

            int cho = scn.nextInt();
            switch (cho) {
            case 1:
                // System.out.println("Car1~~~" + "顏色 : " + "油箱容量 : " + "動力型態 : " + "排氣量 : " +
                // "出廠年 : ");
                // Carlists.add((scn.next(),scn.next(),scn.next(),scn.next(),scn.next());
                // System.out.println(Carlists.get(Carlists.size()-1).showinfo());
            case 2:
                System.out.println("Bus~~~" + "乘客人數 : " + "車門數 : " + "航運公司 : ");
                Buslists.add(new Bus("乘客人數 : " + scn.next(), "車門數 : " + scn.next(), "航運公司 : " + scn.next()));
                System.out.println(Buslists.get(Buslists.size() - 1).showinfo());
                break;
            case 3:
                System.out.println("Sedan~~~" + "乘客人數 : " + "型式 : " + "用途 : ");
                Sedenlists.add(new Sedan("乘客人數 : " + scn.next(), "型式 : " + scn.next(), "用途 : " + scn.next()));
                System.out.println(Sedenlists.get(Sedenlists.size() - 1).showinfo());
                break;
            case 4:
                System.out.println("Truck~~~" + "貨斗數量 : " + "輪子數 : ");
                Trucklists.add(new Truck("貨斗數量 : " + scn.next(), "輪子數 : " + scn.next()));
                System.out.println(Trucklists.get(Trucklists.size() - 1).showinfo());
                break;
            case 5:

                System.out.println("Search~~~");

                System.out.println("總共 " + Buslists.size() + " 輛巴士");
                for (Bus bus1 : Buslists) {
                    System.out.println(bus1.showinfo());
                }
                System.out.println("總共 " + Sedenlists.size() + " 輛休旅車");
                for (Sedan sedan1 : Sedenlists) {
                    System.out.println(sedan1.showinfo());
                }
                System.out.println("總共 " + Trucklists.size() + " 台貨車");
                for (Truck truck1 : Trucklists) {
                    System.out.println(truck1.showinfo());
                }
                break;
            case 6:
                flag = false;
                System.out.println("System offline");
                break;
            default:
                System.out.println("No Chance");
            }
        }
    }
}