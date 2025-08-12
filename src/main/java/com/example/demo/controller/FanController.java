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
    public void switchOn(@PathVariable int fanNumber) {
        fanService.switchOn(fanNumber);
    }

    public void switchOff() {

    }

    public void increase() {

    }

    public void decrease() {

    }

    @GetMapping("/fan/switchon")
    public void report() {
        fanService.report();
    }
}
