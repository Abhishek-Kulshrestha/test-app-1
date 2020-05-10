package io.course.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import io.course.main.repository.TopicRepository;
import io.course.model.Topic;

@Transactional
@Component
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> findAllTopics() {
		List<Topic> topics = new ArrayList<>();
		Iterable<Topic> findAll = topicRepository.findAll();
		findAll.forEach(topics::add);
		return topics;
	}

	public Topic getByTopicId(Long id) {
		return topicRepository.findById(id).orElse(null);
	}

	public Topic saveTopic(Topic topic) {
		return topicRepository.save(topic);
	}

	public void updateTopic(Long id) {
		topicRepository.deleteById(id);
	}

}
