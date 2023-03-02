package com.lumi.backend.javaassessment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/notifications")
@RestController
public class NotificationController {


  /*
  *   Implement the following APIs:
  *
  *   1. Send email
  *     - Inputs
  *       to:           string
  *       subject:      string
  *       content:      string
  *     - output
  *       referenceId:  UUID
  *       status:       string
  *
  *
  *   2. Send sms
  *     - Input
  *       mobileNumber:   string
  *       content:        string
  *     - Output
  *       referenceId:    UUID
  *       status:         string
  *
  *
  * */

  @GetMapping("/health")
  public ResponseEntity<String> health() {
    return ResponseEntity.ok("OK");
  }

}
