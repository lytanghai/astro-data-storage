package com.astro_data_storage.dto.response.common;

import com.astro_data_storage.enumz.MessageResponseType;
import com.astro_data_storage.enumz.OperationType;

public class SuccessResponse {
    private String message;
    private MessageResponseType responseType;
    private OperationType  operationType;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageResponseType getResponseType() {
        return responseType;
    }

    public void setResponseType(MessageResponseType responseType) {
        this.responseType = responseType;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }
}
