package com.eazybytes.accounts.dto;
import lombok.*;
@Data

public class ResponseDto {

    private String statusCode;

    private String statusMsg;

    public ResponseDto(String statusCode, String statusMsg) {
        this.statusCode = statusCode;
        this.statusMsg = statusMsg;
    }
}
