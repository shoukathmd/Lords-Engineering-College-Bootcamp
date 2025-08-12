package com.example.demo.fan;

public enum FanSpeed {
        OFF, LOW, MEDIUM, HIGH;
        public FanSpeed increase() {
            return switch (this) {
                case OFF -> LOW;
                case LOW -> MEDIUM;
                case MEDIUM -> HIGH;
                case HIGH -> HIGH; // already max
            };
        }


        public FanSpeed decrease() {
            return switch (this) {
                case HIGH -> MEDIUM;
                case MEDIUM -> LOW;
                case LOW -> OFF;
                case OFF -> OFF; // already min
            };
        }
    }

