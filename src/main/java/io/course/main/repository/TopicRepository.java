/**
 * 
 */
package io.course.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.course.model.Topic;

/**
 * @author Sandeep Sundaram
 *
 */
@Repository
public interface TopicRepository extends CrudRepository<Topic, Long> {

}
