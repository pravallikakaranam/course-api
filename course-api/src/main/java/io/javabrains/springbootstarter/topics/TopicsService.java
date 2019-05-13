package io.javabrains.springbootstarter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {

	private List<Topic> topics=Arrays.asList(
			new Topic(1,"Java","we are using java 1.8 version."),
			new Topic(2,"Spring Boot","we are using spring boot 1.4.2 version.")
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
}
