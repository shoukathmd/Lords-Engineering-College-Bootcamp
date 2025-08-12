package com.example.demo.fan;

public class Fan {
    private boolean isOn = false;
    private FanSpeed speed;
    private String brandName;

    public Fan() {
        this.speed = FanSpeed.OFF;
    }

    public void switchOnTheFan() {
       isOn = true;
       speed = FanSpeed.LOW;
       System.out.println("Starting the fan with speed: " + speed);
    }

    public void switchOfTheFan() {
        isOn = false;
        speed = FanSpeed.OFF;
        System.out.println("Turning off the fan");
    }

    public boolean isSwitchedOn() {
        return isOn == true;
    }

    public void increaseSpeed() {
        if(isOn == false) {
            System.out.println("Please switch on the fan");
        } else {
            speed = speed.increase();
        }
    }

    public void decreaseSpeed() {
        speed = speed.decrease();
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public FanSpeed getSpeed() {
        return speed;
    }

    public void setSpeed(FanSpeed speed) {
        this.speed = speed;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "isOn=" + isOn +
                ", speed=" + speed +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
