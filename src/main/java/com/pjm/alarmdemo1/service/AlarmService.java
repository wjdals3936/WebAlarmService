package com.pjm.alarmdemo1.service;

import com.pjm.alarmdemo1.data.dto.AlarmDto;

public interface AlarmService {
    /* 알람 등록 DB insert */
    void insertAlarm(int hour, int min, int month, int day, long memo);

    /* 알람 목록 DB select : hour, min, meridiem */
    AlarmDto getAlarmList(int hour, int min, String meridiem);

    /* 알람 상세 목록 DB select : hour, min, meridiem, month, day, memo */
    AlarmDto getDetailByAlarm(int hour, int min, String meridiem, int month, int day, long memo);

    /* 알람 수정 DB select & insert : hour, min, meridiem, month, day, memo */
    AlarmDto updateAlarm(int hour, int min, String meridiem, int month, int day, long memo);

    /* 알람 삭제 */
    void deleteAlarmByNum(int num);

}










