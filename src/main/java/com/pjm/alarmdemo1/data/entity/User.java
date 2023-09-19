package com.pjm.alarmdemo1.data.entity;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    @Id
    private String id;

    @NotBlank
    private String nickname;

    @NotBlank
    private String password;

    // 영속성 전이 적용
    @OneToMany(mappedBy = "User", cascade = CascadeType.PERSIST)
    @ToString.Exclude
    private List<Alarm> alarmList = new ArrayList<>();
    // Map 타입
}
