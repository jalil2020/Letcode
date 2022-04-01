package com.company.easy;

public class DesignParkingSystem {
    public static void main(String[] args) {

        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));

    }
}

class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        boolean bool = false;
        switch (carType) {
            case 1:
                big--;
                if (big >= 0) bool = true;
                break;
            case 2:
                medium--;
                if (medium >= 0) bool = true;
                break;
            case 3:
                small--;
                if (small >= 0) bool = true;
                break;
        }

        return bool;
    }
}
