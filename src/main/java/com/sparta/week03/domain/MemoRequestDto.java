package com.sparta.week03.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MemoRequestDto {
    private String username;
    private String contents;
    private String password;
    private String title;
    private String editpassword;
}
