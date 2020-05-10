/**
 * 
 */
package io.course.main.repository;

import org.springframework.data.repository.CrudRepository;

import io.course.model.Topic;

/**
 * @author Sandeep Sundaram
 *
 */
public interface CopyRepository extends CrudRepository<Topic, Long> {

}
