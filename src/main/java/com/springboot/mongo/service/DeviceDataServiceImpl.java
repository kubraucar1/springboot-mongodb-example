package com.springboot.mongo.service;

import com.springboot.mongo.repo.DeviceDataRepository;
import com.springboot.mongo.model.DeviceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

@Service
public class DeviceDataServiceImpl implements DeviceDataService{
    @Autowired
    private DeviceDataRepository deviceDataRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void AddDeviceData() {
        DeviceData deviceData1 = new DeviceData();
        //device objesi 1:
        deviceData1.setDeviceId("D0412E242113");
        deviceData1.setByteData("\"CfD//w8mCPD//w8oCPD//w8qCfD//w8sCvD//w8uC/D//w8wDvD//w8xDvD//w8zDvD//w81DfD//w83DPD//w85DPD//w86DPD//w88C/D//w89CvD//w8/CfD//w9ACvD//w9BCvD//w9CCfD//w9DB/D//w9EBfD//w9FBPD//w9FAvD//w9G+v///w9G4////w9GxP///w9Gp////w9Gj////w9Gdf///w9GXP///w9FVf///w9EcP///w9Eu////w9DOPD//w9Bz/D//w9ATPH//w8/gfH//w89ZPH//w87DvH//w86pfD//w84TPD//w82EvD//w809////w8x7v/// \"");
        deviceData1.setDataDuration(10);
        deviceData1.setBaseDataLength(3);
        deviceData1.setChannelCount(2);
        deviceData1.setSource("iQardi");
        deviceData1.setId("id1");
        deviceData1.setPatientCode("hasta");
        deviceData1.setIdHlsDiagnostic("323953");
        deviceData1.setLiveModeKey(null);
        deviceData1.setRegisterDate("2023-08-22T05:33:43");
        deviceData1.setSampleRate(250);
        deviceData1.setPatientCode("2f555e62-0e91-4c4d-8d21-5a2ef1246c85");

        DeviceData.EcgData ecgData = new DeviceData.EcgData();
        ecgData.setPulse(60);
        ecgData.setBodyTemp("38.59");
        ecgData.setSaturation(100);
        ecgData.setSystolic(115);
        ecgData.setDiastolic(66);

        DeviceData.ChannelData channelData = new DeviceData.ChannelData();
        channelData.setCh2(List.of( -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1
        ));

        channelData.setCh1(List.of(9,
                8,
                8,
                9,
                10,
                11,
                14,
                14,
                14,
                12,
                12,
                12,
                11,
                10,
                9,
                10,
                10,
                9,
                5,
                4,
                2,
                -6,
                -29,
                -60,
                -89,
                -113,
                -139,
                -171,
                -144,
                -69,
                56,
                207,
                332,
                385,
                356,
                270,
                76,
                18,
                -9,
                -18,
                -18,
                -14,
                -11,
                -10,
                -11,
                -14,
                -14,
                -12,
                -11,
                -12,
                -12,
                -11,
                -9,
                -8,
                -11,
                -11,
                -9,
                -7,
                -7,
                -7,
                -7,
                -6,
                -4,
                -2,
                -2,
                -2,
                -1,
                -2,
                -3,
                -3,
                -3,
                -3,
                -2,
                -2,
                -2,
                -1,
                0,
                1,
                2,
                4,
                6,
                9,
                10,
                11,
                12,
                11,
                10,
                8,
                6,
                3,
                -6,
                -13,
                -21,
                -27,
                -32,
                -36,
                -40,
                -43,
                -45,
                -44,
                -43,
                -41,
                -39,
                -36,
                -33,
                -32,
                -31,
                -31,
                -31,
                -30,
                -30,
                -30,
                -31,
                -32,
                -32,
                -32,
                -31,
                -30,
                -30,
                -31,
                -31,
                -31,
                -31,
                -30,
                -28,
                -27,
                -25,
                -24,
                -22,
                -20,
                -17,
                -15,
                -14,
                -13,
                -12,
                -11,
                -10,
                -8,
                -5,
                -4,
                -4,
                -4,
                -4,
                -3,
                -1,
                -1,
                -1,
                -2,
                -3,
                -2,
                -2,
                -2,
                -2,
                0,
                0,
                -2,
                -4,
                -6,
                -9,
                -11,
                -12,
                -12,
                -8,
                -5,
                0,
                1,
                2,
                3,
                2,
                2,
                3,
                2,
                0,
                -1,
                -3,
                -4,
                -4,
                -1,
                0,
                1,
                -1,
                -2,
                -2,
                -3,
                -5,
                -5,
                -4,
                -2,
                -2,
                -5,
                -5,
                -6,
                -14,
                -32,
                -60,
                -87,
                -108,
                -131,
                -177,
                -176,
                -136,
                -42,
                93,
                231,
                315,
                321,
                266,
                92,
                29,
                -6,
                -22,
                -27,
                -28,
                -27,
                -24,
                -21,
                -25,
                -26,
                -24,
                -22,
                -22,
                -22,
                -20,
                -18,
                -18,
                -20,
                -22,
                -23,
                -24,
                -24,
                -23,
                -21,
                -20,
                -19,
                -20,
                -20,
                -20,
                -20,
                -20,
                -20,
                -20,
                -19,
                -18,
                -16,
                -14,
                -11,
                -8,
                -8,
                -9,
                -8
        ));

        deviceData1.setChannelData(channelData);


        DeviceData deviceData2 = new DeviceData();
        //device objesi 2:
        deviceData2.setDeviceId("dailyid");
        deviceData2.setByteData("\"CfD//w8mCPD//w8oCPD//w8qCfD//w8sCvD//w8uC/D//w8wDvD//w8xDvD//w8zDvD//w81DfD//w83DPD//w85DPD//w86DPD//w88C/D//w89CvD//w8/CfD//w9ACvD//w9BCvD//w9CCfD//w9DB/D//w9EBfD//w9FBPD//w9FAvD//w9G+v///w9G4////w9GxP///w9Gp////w9Gj////w9Gdf///w9GXP///w9FVf///w9EcP///w9Eu////w9DOPD//w9Bz/D//w9ATPH//w8/gfH//w89ZPH//w87DvH//w86pfD//w84TPD//w82EvD//w809////w8x7v/// \"");
        deviceData2.setDataDuration(10);
        deviceData2.setBaseDataLength(3);
        deviceData2.setChannelCount(2);
        deviceData2.setSource("iQardi");
        deviceData2.setId("id2");
        deviceData2.setPatientCode("hasta");
        deviceData2.setIdHlsDiagnostic("323953");
        deviceData2.setLiveModeKey(null);
        deviceData2.setRegisterDate("2023-09-25T05:33:43");
        deviceData2.setSampleRate(250);
        deviceData2.setPatientCode("2f555e62-0e91-4c4d-8d21-5a2ef1246c85");

        DeviceData.EcgData ecgData2 = new DeviceData.EcgData();
        ecgData2.setPulse(62);
        ecgData2.setBodyTemp("39.59");
        ecgData2.setSaturation(109);
        ecgData2.setSystolic(111);
        ecgData2.setDiastolic(67);

        DeviceData.ChannelData channelData2 = new DeviceData.ChannelData();
        channelData2.setCh2(List.of( -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1
        ));

        channelData2.setCh1(List.of(9,
                8,
                8,
                9,
                10,
                11,
                14,
                14,
                14,
                12,
                12,
                12,
                11,
                10,
                9,
                10,
                10,
                9,
                5,
                4,
                2,
                -6,
                -29,
                -60,
                -89,
                -113,
                -139,
                -171,
                -144,
                -69,
                56,
                207,
                332,
                385,
                356,
                270,
                76,
                18,
                -9,
                -18,
                -18,
                -14,
                -11,
                -10,
                -11,
                -14,
                -14,
                -12,
                -11,
                -12,
                -12,
                -11,
                -9,
                -8,
                -11,
                -11,
                -9,
                -7,
                -7,
                -7,
                -7,
                -6,
                -4,
                -2,
                -2,
                -2,
                -1,
                -2,
                -3,
                -3,
                -3,
                -3,
                -2,
                -2,
                -2,
                -1,
                0,
                1,
                2,
                4,
                6,
                9,
                10,
                11,
                12,
                11,
                10,
                8,
                6,
                3,
                -6,
                -13,
                -21,
                -27,
                -32,
                -36,
                -40,
                -43,
                -45,
                -44,
                -43,
                -41,
                -39,
                -36,
                -33,
                -32,
                -31,
                -31,
                -31,
                -30,
                -30,
                -30,
                -31,
                -32,
                -32,
                -32,
                -31,
                -30,
                -30,
                -31,
                -31,
                -31,
                -31,
                -30,
                -28,
                -27,
                -25,
                -24,
                -22,
                -20,
                -17,
                -15,
                -14,
                -13,
                -12,
                -11,
                -10,
                -8,
                -5,
                -4,
                -4,
                -4,
                -4,
                -3,
                -1,
                -1,
                -1,
                -2,
                -3,
                -2,
                -2,
                -2,
                -2,
                0,
                0,
                -2,
                -4,
                -6,
                -9,
                -11,
                -12,
                -12,
                -8,
                -5,
                0,
                1,
                2,
                3,
                2,
                2,
                3,
                2,
                0,
                -1,
                -3,
                -4,
                -4,
                -1,
                0,
                1,
                -1,
                -2,
                -2,
                -3,
                -5,
                -5,
                -4,
                -2,
                -2,
                -5,
                -5,
                -6,
                -14,
                -32,
                -60,
                -87,
                -108,
                -131,
                -177,
                -176,
                -136,
                -42,
                93,
                231,
                315,
                321,
                266,
                92,
                29,
                -6,
                -22,
                -27,
                -28,
                -27,
                -24,
                -21,
                -25,
                -26,
                -24,
                -22,
                -22,
                -22,
                -20,
                -18,
                -18,
                -20,
                -22,
                -23,
                -24,
                -24,
                -23,
                -21,
                -20,
                -19,
                -20,
                -20,
                -20,
                -20,
                -20,
                -20,
                -20,
                -19,
                -18,
                -16,
                -14,
                -11,
                -8,
                -8,
                -9,
                -8
        ));

        deviceData2.setChannelData(channelData2);
deviceData2.setEcgData(ecgData2);
deviceData1.setEcgData(ecgData);


        DeviceData deviceData3 = new DeviceData();
        //device objesi 3:
        deviceData3.setDeviceId("dailyid");
        deviceData3.setByteData("\"CfD//w8mCPD//w8oCPD//w8qCfD//w8sCvD//w8uC/D//w8wDvD//w8xDvD//w8zDvD//w81DfD//w83DPD//w85DPD//w86DPD//w88C/D//w89CvD//w8/CfD//w9ACvD//w9BCvD//w9CCfD//w9DB/D//w9EBfD//w9FBPD//w9FAvD//w9G+v///w9G4////w9GxP///w9Gp////w9Gj////w9Gdf///w9GXP///w9FVf///w9EcP///w9Eu////w9DOPD//w9Bz/D//w9ATPH//w8/gfH//w89ZPH//w87DvH//w86pfD//w84TPD//w82EvD//w809////w8x7v/// \"");
        deviceData3.setDataDuration(10);
        deviceData3.setBaseDataLength(3);
        deviceData3.setChannelCount(2);
        deviceData3.setSource("iQardi");
        deviceData3.setId("id3");
        deviceData3.setPatientCode("hasta");
        deviceData3.setIdHlsDiagnostic("323953");
        deviceData3.setLiveModeKey(null);
        deviceData3.setRegisterDate("2023-09-25T12:33:43");
        deviceData3.setSampleRate(250);
        deviceData3.setPatientCode("2f555e62-0e91-4c4d-8d21-5a2ef1246c85");

        DeviceData.EcgData ecgData3 = new DeviceData.EcgData();
        ecgData3.setPulse(62);
        ecgData3.setBodyTemp("39.59");
        ecgData3.setSaturation(109);
        ecgData3.setSystolic(111);
        ecgData3.setDiastolic(67);

        DeviceData.ChannelData channelData3 = new DeviceData.ChannelData();
        channelData3.setCh2(List.of( -1,
                -1,
                -1,
                -
                -1,
                -1
        ));

        channelData3.setCh1(List.of(9,
                -4,
                -8
        ));

        deviceData3.setChannelData(channelData3);

        DeviceData deviceData4 = new DeviceData();
        //device objesi 4:
        deviceData4.setDeviceId("dailyid");
        deviceData4.setByteData("\"CfD//w8mCPD//w8oCPD//w8qCfD//w8sCvD//w8uC/D//w8wDvD//w8xDvD//w8zDvD//w81DfD//w83DPD//w85DPD//w86DPD//w88C/D//w89CvD//w8/CfD//w9ACvD//w9BCvD//w9CCfD//w9DB/D//w9EBfD//w9FBPD//w9FAvD//w9G+v///w9G4////w9GxP///w9Gp////w9Gj////w9Gdf///w9GXP///w9FVf///w9EcP///w9Eu////w9DOPD//w9Bz/D//w9ATPH//w8/gfH//w89ZPH//w87DvH//w86pfD//w84TPD//w82EvD//w809////w8x7v/// \"");
        deviceData4.setDataDuration(10);
        deviceData4.setBaseDataLength(3);
        deviceData4.setChannelCount(2);
        deviceData4.setSource("iQardi");
        deviceData4.setId("id4");
        deviceData4.setPatientCode("hasta");
        deviceData4.setIdHlsDiagnostic("323953");
        deviceData4.setLiveModeKey(null);
        deviceData4.setRegisterDate("2023-09-25T15:33:43");
        deviceData4.setSampleRate(250);
        deviceData4.setPatientCode("2f555e62-0e91-4c4d-8d21-5a2ef1246c85");

        DeviceData.EcgData ecgData4 = new DeviceData.EcgData();
        ecgData4.setPulse(62);
        ecgData4.setBodyTemp("39.59");
        ecgData4.setSaturation(109);
        ecgData4.setSystolic(111);
        ecgData4.setDiastolic(67);

        DeviceData.ChannelData channelData4 = new DeviceData.ChannelData();
        channelData4.setCh2(List.of( -1,
                -1,
                -1,
                -
                        -1,
                -1
        ));

        channelData4.setCh1(List.of(9,
                -4,
                -8
        ));

        deviceData4.setChannelData(channelData3);
        DeviceData deviceData5 = new DeviceData();
        //device objesi 5:
        deviceData5.setDeviceId("dailyid");
        deviceData5.setByteData("\"CfD//w8mCPD//w8oCPD//w8qCfD//w8sCvD//w8uC/D//w8wDvD//w8xDvD//w8zDvD//w81DfD//w83DPD//w85DPD//w86DPD//w88C/D//w89CvD//w8/CfD//w9ACvD//w9BCvD//w9CCfD//w9DB/D//w9EBfD//w9FBPD//w9FAvD//w9G+v///w9G4////w9GxP///w9Gp////w9Gj////w9Gdf///w9GXP///w9FVf///w9EcP///w9Eu////w9DOPD//w9Bz/D//w9ATPH//w8/gfH//w89ZPH//w87DvH//w86pfD//w84TPD//w82EvD//w809////w8x7v/// \"");
        deviceData5.setDataDuration(10);
        deviceData5.setBaseDataLength(3);
        deviceData5.setChannelCount(2);
        deviceData5.setSource("iQardi");
        deviceData5.setId("id5");
        deviceData5.setPatientCode("hasta");
        deviceData5.setIdHlsDiagnostic("323953");
        deviceData5.setLiveModeKey(null);
        deviceData5.setRegisterDate("2023-09-20T15:33:43");
        deviceData5.setSampleRate(250);
        deviceData5.setPatientCode("2f555e62-0e91-4c4d-8d21-5a2ef1246c85");

        DeviceData.EcgData ecgData5 = new DeviceData.EcgData();
        ecgData5.setPulse(62);
        ecgData5.setBodyTemp("39.59");
        ecgData5.setSaturation(109);
        ecgData5.setSystolic(111);
        ecgData5.setDiastolic(67);

        DeviceData.ChannelData channelData5= new DeviceData.ChannelData();
        channelData5.setCh2(List.of( -1,
                -1,
                -1,
                -1,
                -1
        ));

        channelData5.setCh1(List.of(9,
                -4,
                -8
        ));

        deviceData5.setChannelData(channelData3);

        DeviceData deviceData6 = new DeviceData();
        //device objesi 6:
        deviceData6.setDeviceId("dailyid");
        deviceData6.setByteData("\"CfD//w8mCPD//w8oCPD//w8qCfD//w8sCvD//w8uC/D//w8wDvD//w8xDvD//w8zDvD//w81DfD//w83DPD//w85DPD//w86DPD//w88C/D//w89CvD//w8/CfD//w9ACvD//w9BCvD//w9CCfD//w9DB/D//w9EBfD//w9FBPD//w9FAvD//w9G+v///w9G4////w9GxP///w9Gp////w9Gj////w9Gdf///w9GXP///w9FVf///w9EcP///w9Eu////w9DOPD//w9Bz/D//w9ATPH//w8/gfH//w89ZPH//w87DvH//w86pfD//w84TPD//w82EvD//w809////w8x7v/// \"");
        deviceData6.setDataDuration(10);
        deviceData6.setBaseDataLength(3);
        deviceData6.setChannelCount(2);
        deviceData6.setSource("iQardi");
        deviceData6.setId("id6");
        deviceData6.setPatientCode("hasta");
        deviceData6.setIdHlsDiagnostic("323953");
        deviceData6.setLiveModeKey(null);
        deviceData6.setRegisterDate("2023-08-30T15:33:43");
        deviceData6.setSampleRate(250);
        deviceData6.setPatientCode("2f555e62-0e91-4c4d-8d21-5a2ef1246c85");

        DeviceData.EcgData ecgData6 = new DeviceData.EcgData();
        ecgData6.setPulse(62);
        ecgData6.setBodyTemp("39.59");
        ecgData6.setSaturation(109);
        ecgData6.setSystolic(111);
        ecgData6.setDiastolic(67);

        DeviceData.ChannelData channelData6= new DeviceData.ChannelData();
        channelData6.setCh2(List.of( -1,
                -1,
                -1,
                -1,
                -1
        ));

        channelData6.setCh1(List.of(9,
                -4,
                -8
        ));

        deviceData6.setChannelData(channelData6);
        deviceDataRepository.save(deviceData1);
        deviceDataRepository.save(deviceData2);
        deviceDataRepository.save(deviceData3);
        deviceDataRepository.save(deviceData4);
        deviceDataRepository.save(deviceData5);
        deviceDataRepository.save(deviceData6);
    }

    @Override
    public List<DeviceData> getDailyData(String deviceId) {

            LocalDate today = LocalDate.now();
            String todayDateString = today.toString();

            Query query = new Query(Criteria.where("deviceId").is(deviceId).and("registerDate").regex("^" + todayDateString));

            List<DeviceData> todayData = mongoTemplate.find(query, DeviceData.class);

            return todayData;
        }

    @Override
    public List<DeviceData> getWeeklyData(String deviceId) {
        LocalDate oneWeekAgo = LocalDate.now().minusWeeks(1);
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;

        String startDate = oneWeekAgo.format(formatter);
        String endDate = LocalDate.now().format(formatter);

        Query query = new Query(Criteria.where("deviceId").is(deviceId)
                .and("registerDate").gte(startDate)
                .lte(endDate));

        List<DeviceData> lastWeekData = mongoTemplate.find(query, DeviceData.class);

        return lastWeekData;
    }

    @Override
    public List<DeviceData> getMonthlydata(String deviceId) {
        LocalDate oneMonthAgo = LocalDate.now().minusMonths(1);
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;

        String startDate = oneMonthAgo.format(formatter);
        String endDate = LocalDate.now().format(formatter);

        Query query = new Query(Criteria.where("deviceId").is(deviceId)
                .and("registerDate").gte(startDate)
                .lte(endDate));

        List<DeviceData> lastMonthData = mongoTemplate.find(query, DeviceData.class);

        return lastMonthData;
    }

    @Override
    public List<DeviceData> getYearlyData(String deviceId) {
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;

        String startDate = oneYearAgo.format(formatter);
        String endDate = LocalDate.now().format(formatter);

        Query query = new Query(Criteria.where("deviceId").is(deviceId)
                .and("registerDate").gte(startDate)
                .lte(endDate));

        List<DeviceData> lastYearData = mongoTemplate.find(query, DeviceData.class);

        return lastYearData;
    }
    }



