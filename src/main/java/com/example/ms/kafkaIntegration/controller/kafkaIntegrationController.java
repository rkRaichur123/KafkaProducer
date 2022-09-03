package com.example.ms.kafkaIntegration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms.kafkaIntegration.service.KafkaintegrationServiceImpl;
@RestController
@RequestMapping(value = "/api/kafkaIntegration")
public class kafkaIntegrationController {
	
	@Autowired
	KafkaintegrationServiceImpl kafkaService;
	
	@GetMapping(value = "/healthCheck")
	public String healthCheck() {
		return "kafkaIntegration is up and runing";
	}
	
	@GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) {
		kafkaService.send(message);

		return "Message sent to the Kafka Topic java_in_use_topic Successfully";
	}
}
