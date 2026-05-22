package com.idce.user.Exception;

import jakarta.persistence.GeneratedValue;
import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiMessage {
    private String message;
    private boolean status;
    private HttpStatus httpStatus;
}
