package com.cineradar.backend.global.response;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ErrorResponse {
    String code;
    String message;
    String errorCode;
}
