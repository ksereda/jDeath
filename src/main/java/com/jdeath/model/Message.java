package com.jdeath.model;

import org.springframework.stereotype.Component;

@Component
public class Message {
    private String infoMessage;

    public Message(String infoMessage) {
        this.infoMessage = infoMessage;
    }

    public Message() {
    }

    public String getInfoMessage() {
        return infoMessage;
    }

    public void setInfoMessage(String infoMessage) {
        this.infoMessage = infoMessage;
    }

    public void sqltask() {

    }
}
