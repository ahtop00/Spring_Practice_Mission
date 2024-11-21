package javalab.umc7th_mission.apiPayload.exception;

import javalab.umc7th_mission.apiPayload.code.status.ErrorStatus;
import org.springframework.http.HttpStatus;

public class FoodCategoryNotFoundException extends RuntimeException {
    private final HttpStatus status = HttpStatus.NOT_FOUND;

    public FoodCategoryNotFoundException(ErrorStatus errorStatus) {
        super(errorStatus.getMessage());
    }

    public HttpStatus getStatus() {
        return status;
    }
}