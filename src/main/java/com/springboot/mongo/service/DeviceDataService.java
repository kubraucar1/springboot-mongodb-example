package com.springboot.mongo.service;

import com.springboot.mongo.model.DeviceData;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface DeviceDataService {
    public void AddDeviceData();
    public List<DeviceData> getDailyData(String deviceId);

    List<DeviceData> getWeeklyData(String deviceId);

    List<DeviceData> getMonthlydata(String deviceId);

    List<DeviceData> getYearlyData(String deviceId);
}
