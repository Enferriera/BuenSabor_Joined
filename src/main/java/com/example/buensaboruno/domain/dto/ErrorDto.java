package com.example.buensaboruno.domain.dto;


import lombok.Builder;


@Builder
public class ErrorDto {
    private String errorMsg;
    private String errorClass;
}
