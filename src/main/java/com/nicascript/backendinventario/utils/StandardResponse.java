package com.nicascript.backendinventario.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StandardResponse {
    @JsonIgnore
    private HttpStatus status;
    private int code;
    private String message;
    private Object data;

    public static ResponseEntity<StandardResponse> GenerateHttpResponse(
            StandardResponse standardResponse) {
        return ResponseEntity.status(standardResponse.getStatus()).body(standardResponse);
    }

    public StandardResponse(HttpStatus httpStatus) {
        this.status = httpStatus;
        this.code = httpStatus.value();
        this.message = httpStatus.getReasonPhrase();
    }

    public StandardResponse(HttpStatus httpStatus, String message) {
        this.status = httpStatus;
        this.message = message;
        this.code = httpStatus.value();
    }

    public StandardResponse(HttpStatus httpStatus, Object data) {
        this.status = httpStatus;
        this.code = httpStatus.value();
        this.message = httpStatus.getReasonPhrase();
        this.data = data;
    }

    public StandardResponse(HttpStatus httpStatus, String message, Object data) {
        this.status = httpStatus;
        this.message = message;
        this.data = data;
    }


}
