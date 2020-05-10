package io.course.main.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.course.main.service.TopicService;
import io.course.model.Topic;

@RestController
public class TopicAPI {

	@Autowired
	private TopicService topicService;

	@PostMapping(path = "/rest/v1/topic", produces = "application/json")
	public Topic createTopic(@RequestBody Topic topic) {
		return topicService.saveTopic(topic);
	}

	@GetMapping(path = "/rest/v1/topic/id/{id}", produces = "application/json")
	public Topic getTopic(@PathVariable(name = "id", required = true) Long id) {
		return topicService.getByTopicId(id);
	}

	@GetMapping(path = "/rest/v1/topic", produces = "application/json")
	public List<Topic> getAllTopic() {
		return topicService.findAllTopics();
	}

	@DeleteMapping(value = "/rest/v1/topic/id/{id}")
	public void deleteTopic(@PathVariable(name = "id", required = true) Long id) {
		topicService.getByTopicId(id);
	}

	@PutMapping(value = "/rest/v1/topic", produces = "application/json")
	public Topic updateTopic(@RequestBody Topic topic) {
		return topicService.saveTopic(topic);
	}

}
