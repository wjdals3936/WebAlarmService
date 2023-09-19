package com.pjm.alarmdemo1.service;

import com.pjm.alarmdemo1.data.dto.AlarmDto;
import com.pjm.alarmdemo1.data.repository.AlarmRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlarmServiceImpl implements AlarmService{
    private final Logger LOGGER = LoggerFactory.getLogger(AlarmServiceImpl.class);
    private final AlarmRepository alarmRepository;

    @Autowired
    public AlarmServiceImpl (AlarmRepository alarmRepository){
        this.alarmRepository = alarmRepository;
    }

    @Override
    public void insertAlarm(int hour, int min, int month, int day, long memo) {

    }

    @Override
    public AlarmDto getAlarmList(int hour, int min, String meridiem) {
        return null;
    }

    @Override
    public AlarmDto getDetailByAlarm(int hour, int min, String meridiem, int month, int day, long memo) {
        return null;
    }

    @Override
    public AlarmDto updateAlarm(int hour, int min, String meridiem, int month, int day, long memo) {
        return null;
    }

    @Override
    public void deleteAlarmByNum(int num) {

    }
}
