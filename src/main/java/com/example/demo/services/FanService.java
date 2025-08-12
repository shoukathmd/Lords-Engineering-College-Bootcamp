package com.example.demo.services;

import com.example.demo.fan.Fan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FanService {
    ArrayList<Fan> fanArrayList = new ArrayList<>();
    int overAllCount = 0;
    int countOfFansOn = 0;
    Fan f1 = new Fan();


    public FanService() {
        int i = 1;
        while (i <= 180) {
            //Creating the fan
            Fan f = new Fan();
            //Adding the fan to warehouse(Fan arraylist)
            fanArrayList.add(f);
            i++;
        }
    }
    public void switchOn(int fanNumber) {
        Fan f1 = fanArrayList.get(fanNumber);
        if (f1.isSwitchedOn() == false) {
            System.out.println("Starting the fan");
            f1.switchOnTheFan();
            overAllCount++;
            countOfFansOn++;
        } else {
            System.out.println("Fan is already running");
        }
    }

    public void switchOff() {
        f1.switchOfTheFan();
        System.out.println("Fan is switched");
        overAllCount++;
        countOfFansOn--;
    }

    public void increase() {
        f1.increaseSpeed();
        overAllCount++;
        System.out.println("Fan speed is: " + f1.getSpeed());
    }

    public void decrease() {
        f1.decreaseSpeed();
        overAllCount++;
        System.out.println("Fan speed is: " + f1.getSpeed());
    }

    public void report() {
        //overAllCount++;
        System.out.println("No of fans in switched on status : " + countOfFansOn);
        System.out.println("Overall count of buttons tested: " + overAllCount);
    }


}
