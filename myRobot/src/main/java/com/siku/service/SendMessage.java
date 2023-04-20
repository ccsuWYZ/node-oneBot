package com.siku.service;

public interface SendMessage {
    public void sendAllDayCourse(String sno, Object qqNumber) throws InterruptedException;

    public void sendStatusMessage();

    public void sendSelf_message(String message) throws InterruptedException;
}
