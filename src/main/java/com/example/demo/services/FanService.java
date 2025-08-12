package com.example.demo.services;

import com.example.demo.fan.Fan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FanService {
    ArrayList<Fan> fanArrayList = new ArrayList<>();
    int overAllCount = 0;
    int countOfFansOn = 0;

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
    public void switchOn(Integer fanNumber) {
        Fan f1 = fanArrayList.get(fanNumber);
        if (f1.isSwitchedOn() == false) {
            System.out.println("Starting the fan: " + fanNumber);
            f1.switchOnTheFan();
            overAllCount++;
            countOfFansOn++;
        } else {
            System.out.println("Fan is already running");
        }
    }

    public void switchOff(Integer fanNumber) {
        //Get the fan from warehouse
        Fan f1 = fanArrayList.get(fanNumber);
        // Switch off the fan
        f1.switchOfTheFan();
        System.out.println("Fan is switched");
        overAllCount++;
        countOfFansOn--;
    }

    public void increase(Integer fanNumbner) {
        Fan f1 = fanArrayList.get(fanNumbner);
        f1.increaseSpeed();
        overAllCount++;
        System.out.println("Fan speed is: " + f1.getSpeed());
    }

    public void decrease(Integer fanNumber) {
        //Get the fan from warehouse
        Fan f1 = fanArrayList.get(fanNumber);
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
