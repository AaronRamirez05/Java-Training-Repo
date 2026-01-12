package com.aaronorg.asset_service.exception;

import com.aaronorg.asset_service.dto.ErrorResponse;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import java.lang.IllegalAccessException;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleValidation(MethodArgumentNotValidException ex) {
        List<String> messages = ex.getBindingResult()
                                .getFieldErrors()
                                .stream()
                                .map(err -> err.getField() + ":"+ err.getDefaultMessage())
                                .collect(Collectors.toList());
        
        return new ErrorResponse(
            Instant.now(),
            400,
            "Bad Request",
            messages
        );
    }

    @ExceptionHandler(IllegalAccessException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleIllegalArgument(IllegalAccessException ex){
        return new ErrorResponse(
            Instant.now(),
            400,
            "Bad Request",
            List.of(ex.getMessage())
        );
    }
}
