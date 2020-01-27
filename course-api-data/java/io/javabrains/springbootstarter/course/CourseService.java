package io.javabrains.springbootstarter.course;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository CourseRepository;
	

public List<Course> getAllCourses(String topicId){
	
	List<Course> courses = new ArrayList<>();
	CourseRepository.findByTopicId(topicId).forEach(courses::add);
	
	return courses;
}

public Course getCourse(String id) {
	
	
	return CourseRepository.findById(id).orElse(null);
	
}

public void addCourse(Course course) {
	CourseRepository.save(course);
	
	
}

public void updateCourse(Course course) {
	CourseRepository.save(course);
		}
		
	
	


public void deleteTopic(String id) {
//	topics.removeIf(t -> t.getId().equals(id));
	CourseRepository.deleteById(id);
}

}

