package com.pjm.alarmdemo1.data.dto;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserDto {
    private String id;
    private String nickname;
    private String password;
}
