package com.pjm.alarmdemo1.data.entity;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Alarm { // 유효성 검사
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int num;

    @NotBlank
    @Size(max=23)
    private int hour;

    @NotBlank
    @Size(max=59)
    private int min;

//    @Column(nullable = false)
    @NotBlank
    private String meridiem;

    @Size(min=1, max=12)
    @Nullable
    private int month;

    @Size(min=1, max=31)
    @Nullable
    private int day;

    @Nullable
    private long memo;


}
