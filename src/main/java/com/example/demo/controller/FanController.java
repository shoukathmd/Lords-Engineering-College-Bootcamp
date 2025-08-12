package com.example.demo.controller;


import com.example.demo.services.FanService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FanController {
    private FanService fanService;
    @Autowired
    public FanController(FanService fanService) {
        this.fanService = fanService;
    }


    @GetMapping("/fan/switchon/{fanNumber}")
    public void switchOn(@PathVariable Integer fanNumber) {
        fanService.switchOn(fanNumber);
    }
    @GetMapping("/fan/switchoff/{fanNumber}")
    public void switchOff(Integer fanNumber) {
        fanService.switchOff(fanNumber);
    }
    @GetMapping("/fan/increase/{fanNumber}")
    public void increase(Integer fanNumber) {
        fanService.increase(fanNumber);
    }
    @GetMapping("/fan/decrease/{fanNumber}")
    public void decrease(Integer fanNumber) {
        fanService.decrease(fanNumber);
    }

    @GetMapping("/fan/report")
    public void report() {
        fanService.report();
    }
}
