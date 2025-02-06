package com.example.board.user.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignupReqDto {
    private String userId;
    private String password;
    private String nickName;
    private String email;
}
