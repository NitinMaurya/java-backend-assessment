package com.lumi.backend.javaassessment.api;

public interface SMSClient {

  boolean sendSMS(String mobileNumber, String content);
}
