package com.lumi.backend.javaassessment.api;

public interface EmailClient {

  boolean sendEmail(String to, String subject, String content);
}
