package com.pjm.alarmdemo1.service;

import com.pjm.alarmdemo1.data.dto.UserDto;

public interface UserService {
    /* 회원가입 DB insert : 닉네임, 아이디, 비밀번호 */
    UserDto signUp(String nickname, String id, String password);

    /* 로그인 DB insert : 아이디, 비밀번호 */
    UserDto signIn(String id, String password);
}
