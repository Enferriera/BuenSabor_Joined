package com.example.buensaboruno.domain.error;


import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorDto {
    private String errorMsg;
    private String errorClass;
}
