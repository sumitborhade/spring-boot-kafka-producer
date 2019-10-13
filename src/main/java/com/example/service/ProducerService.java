package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.model.User;

@Service
public class ProducerService {

	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;
	
	@Value("${topic.name}")
	private String topicName;
	
	public boolean publishMessage(User user) {
		kafkaTemplate.send(topicName, user);
		return true;
	}
}
