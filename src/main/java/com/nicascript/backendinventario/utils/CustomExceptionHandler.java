package com.nicascript.backendinventario.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.sql.SQLIntegrityConstraintViolationException;

import static com.nicascript.backendinventario.utils.StandardResponse.GenerateHttpResponse;

@ControllerAdvice
public class CustomExceptionHandler {
  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<StandardResponse> handleConflict(
      MethodArgumentNotValidException ex, WebRequest webRequest) {
    return GenerateHttpResponse(new StandardResponse(HttpStatus.BAD_REQUEST));
  }

  @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
  public ResponseEntity<StandardResponse> handleConflict(
      SQLIntegrityConstraintViolationException ex, WebRequest webRequest) {
    return GenerateHttpResponse(new StandardResponse(HttpStatus.CONFLICT));
  }
}
