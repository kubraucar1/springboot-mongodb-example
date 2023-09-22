package com.springboot.mongo.controller;

import com.springboot.mongo.model.DeviceData;
import com.springboot.mongo.repo.DeviceDataRepository;
import com.springboot.mongo.service.DeviceDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
