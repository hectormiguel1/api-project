package com.grubhub.lite.demo.exceptions.payment;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Controller
public class PaymentExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(PaymentDeclinedException.class)
    public ResponseEntity<String> handlePaymentDeclined(PaymentDeclinedException ex) {
        return new ResponseEntity<>(
                ex.getMessage(),
                HttpStatus.EXPECTATION_FAILED
        );
    }
}
