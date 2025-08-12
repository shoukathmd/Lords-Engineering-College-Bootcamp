package com.example.demo.fan;

import java.util.ArrayList;
import java.util.Scanner;

public class FanDemo {

    public static void main(String[] args) {
        ArrayList<Fan> fanArrayList = new ArrayList<>();
        int i = 1;
        while (i <= 180) {
            //Creating the fan
            Fan f = new Fan();
            //Adding the fan to warehouse(Fan arraylist)
            fanArrayList.add(f);
            i++;
        }
        System.out.println("No of fans in warehouse : " + fanArrayList.size());
        Scanner sc = new Scanner(System.in);
        boolean outerRunning = true;
        int countOfFansOn = 0;
        int overAllCount = 0;
        while(outerRunning == true) {
            System.out.println("Enter the fan number to test :");
            int fanSelected = sc.nextInt();
            Fan f1 = fanArrayList.get(fanSelected);
            boolean running = true;
            while (running == true) {
                System.out.println("---Fan Controls---");
                System.out.println("1) Switch on the fan.");
                System.out.println("2) Switch of the fan.");
                System.out.println("3) Increase the fan speed.");
                System.out.println("4) Decrease the fan speed.");
                System.out.println("5) To select another fan.");
                System.out.println("6) Get report");

                int choice = sc.nextInt();
                //1, 2, 3, 4, 5

                switch (choice) {
                    case 1 -> {
                        if (f1.isSwitchedOn() == false) {
                            System.out.println("Starting the fan");
                            f1.switchOnTheFan();
                            overAllCount++;
                            countOfFansOn++;
                        } else {
                            System.out.println("Fan is already running");
                        }
                    }
                    case 2 -> {
                        f1.switchOfTheFan();
                        System.out.println("Fan is switched");
                        overAllCount++;
                        countOfFansOn--;
                    }
                    case 3 -> {
                        f1.increaseSpeed();
                        overAllCount++;
                        System.out.println("Fan speed is: " + f1.getSpeed());
                    }
                    case 4 -> {
                        f1.decreaseSpeed();
                        overAllCount++;
                        System.out.println("Fan speed is: " + f1.getSpeed());
                    }
                    case 5 -> {
                        running = false;
                        overAllCount++;
                      //  System.out.println("");
                    }
                    case 6 -> {
                        //overAllCount++;
                        System.out.println("No of fans in switched on status : " + countOfFansOn);
                        System.out.println("Overall count of buttons tested: " + overAllCount);
                    }
                }
            }
        }
    }
}
