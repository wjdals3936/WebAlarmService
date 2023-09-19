package com.pjm.alarmdemo1.data.dto;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class AlarmDto {
    private int num;
    private int hour;
    private int min;
    private String meridiem;
    private int month;
    private int day;
    private long memo;
}
