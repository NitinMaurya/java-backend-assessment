package com.lumi.backend.javaassessment.api.impl;

import com.lumi.backend.javaassessment.api.SMSClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
class SMSClientImpl implements SMSClient {
  private static final Logger log = LoggerFactory.getLogger(SMSClientImpl.class);

  static class SMSClientConnectionException extends RuntimeException {
    public SMSClientConnectionException(String message, Throwable cause) {
      super(message, cause);
    }

    public SMSClientConnectionException(String message) {
      super(message);
    }
  }


  @Override
  public boolean sendSMS(String mobileNumber, String content) {

    try {
      Thread.sleep(10_000);
      log.info("SMS sent to: [{}] with content: [{}]", mobileNumber, content);
    } catch (InterruptedException e) {
      throw new SMSClientConnectionException(e.getMessage(), e);
    }
    return true;
  }
}
