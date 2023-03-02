package com.lumi.backend.javaassessment.api.impl;

import com.lumi.backend.javaassessment.api.EmailClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
class EmailClientImpl implements EmailClient {
  private static final Logger log = LoggerFactory.getLogger(EmailClientImpl.class);

  @Override
  public boolean sendEmail(String to, String subject, String content) {
    log.info("Email sent to: [{}] with Subject: [{}] and content: [{}]", to, subject, content);
    return true;
  }
}
