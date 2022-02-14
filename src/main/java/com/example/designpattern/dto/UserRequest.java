package com.example.designpattern.dto;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRequest {

    private String operation;
    private int num1;
    private int num2;
}
