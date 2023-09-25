package com.springboot.mongo.controller;

import com.springboot.mongo.model.DeviceData;
import com.springboot.mongo.repo.DeviceDataRepository;
import com.springboot.mongo.service.DeviceDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/device")
public class DeviceDataController {

    @Autowired
    private DeviceDataService deviceDataService;
    @Autowired
    private DeviceDataRepository deviceDataRepository;

    @GetMapping("/add")
    public String addDeviceData(){
        deviceDataService.AddDeviceData();
        return "cihaz datası eklendi";
    }
    @GetMapping()
    public List<DeviceData> getAllDevices(){
      return   deviceDataRepository.findAll();

    }

    @GetMapping("/daily")
    public List<DeviceData> getDailyData(
            @RequestParam String deviceId
    ) {
        return deviceDataService.getDailyData(deviceId);
    }

    @GetMapping("/weekly")
    public List<DeviceData> getWeeklyData(@RequestParam String deviceId){
        return deviceDataService.getWeeklyData(deviceId);

    }

    @GetMapping("/monthly")
    public List<DeviceData> getMonthlyData(@RequestParam String deviceId){
        return deviceDataService.getMonthlydata(deviceId);
    }
    @GetMapping("/yearly")
    public List<DeviceData> getYearlyData(@RequestParam String deviceId){
        return deviceDataService.getYearlyData(deviceId);
    }
}
