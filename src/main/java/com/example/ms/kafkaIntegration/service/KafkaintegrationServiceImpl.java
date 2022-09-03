package com.example.ms.kafkaIntegration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaintegrationServiceImpl implements KafkaintegrationService{
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	String kafkaTopic = "java_in_use_topic";
	
	@Override
	public void send(String message) {
	    
	    kafkaTemplate.send(kafkaTopic, message);
	}
}
