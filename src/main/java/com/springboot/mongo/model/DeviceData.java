package com.springboot.mongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Document(collection = "devicedata")
public class DeviceData {
    @Id
    private String id;
    private int baseDataLength;
    private String byteData;
    private int channelCount;
    private int dataDuration;
    private String deviceId;
    private String idHlsDiagnostic;
    private String liveModeKey;
    private String registerDate;
    private int sampleRate;
    private EcgData ecgData; // EcgData sınıfına atıfta bulunuyoruz
    private ChannelData channelData; // ChannelData sınıfına atıfta bulunuyoruz
    private String source;
    private String patientCode;

    @Data
    public static class EcgData {
        private int pulse;
        private String bodyTemp;
        private int saturation;
        private int systolic;
        private int diastolic;
    }

    @Data
    public static class ChannelData {
        private List<Integer> ch1= new ArrayList();
        private List<Integer> ch2= new ArrayList();
        private List<Integer> ch= new ArrayList();
        private List<Integer> ch4= new ArrayList();
        private List<Integer> ch5= new ArrayList();
        private List<Integer> ch6= new ArrayList();
        private List<Integer> ch7= new ArrayList();
        private List<Integer> ch8= new ArrayList();
        private List<Integer> ch9= new ArrayList();
        private List<Integer> ch10= new ArrayList();
        private List<Integer> ch11= new ArrayList();
        private List<Integer> ch12= new ArrayList();

    }
}