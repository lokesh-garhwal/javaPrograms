import java.util.Scanner;

class ParkingSystem {

    int small;
    int medium;
    int big;

    public ParkingSystem(int big,
                         int medium,
                         int small) {

        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {

        if (carType == 1) {

            if (big > 0) {
                big--;
                return true;
            }
            else {
                return false;
            }

        }
        else if (carType == 2) {

            if (medium > 0) {
                medium--;
                return true;
            }
            else {
                return false;
            }

        }
        else {

            if (small > 0) {
                small--;
                return true;
            }
            else {
                return false;
            }
        }
    }
}

public class designParkingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
        "Enter big slots: ");

        int big = sc.nextInt();

        System.out.print(
        "Enter medium slots: ");

        int medium = sc.nextInt();

        System.out.print(
        "Enter small slots: ");

        int small = sc.nextInt();

        ParkingSystem obj =
        new ParkingSystem(
        big,
        medium,
        small
        );

        System.out.print(
        "Enter number of cars to add: ");

        int n = sc.nextInt();

        for(int i=1;i<=n;i++){

            System.out.print(
            "Enter car type (1=Big, 2=Medium, 3=Small): ");

            int carType =
            sc.nextInt();

            boolean ans =
            obj.addCar(carType);

            System.out.println(
            "Parking result: "
            + ans);
        }

        sc.close();
    }
}