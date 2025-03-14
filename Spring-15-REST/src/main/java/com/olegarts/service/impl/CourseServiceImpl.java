package com.olegarts.service.impl;

import com.olegarts.dto.CourseDTO;
import com.olegarts.entity.Course;
import com.olegarts.repository.CourseRepository;
import com.olegarts.service.CourseService;
import com.olegarts.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;
    private final MapperUtil mapperUtil;

    public CourseServiceImpl(CourseRepository courseRepository, MapperUtil mapperUtil) {
        this.courseRepository = courseRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public CourseDTO createCourse(CourseDTO course) {

        courseRepository.save(mapperUtil.convert(course, new Course()));

        return course;
    }

    @Override
    public CourseDTO getCourseById(long courseId) {

        Course course = courseRepository.findById(courseId).get();

        return mapperUtil.convert(course, new CourseDTO());
    }

    @Override
    public List<CourseDTO> getCoursesByCategory(String category) {

        List<Course> list = courseRepository.findAllByCategory(category);
        return list.stream().map(obj -> mapperUtil.convert(obj, new CourseDTO())).collect(Collectors.toList());
    }

    @Override
    public List<CourseDTO> getCourses() {
        List<Course> list = courseRepository.findAll();

        return list.stream().map(obj -> mapperUtil.convert(obj, new CourseDTO())).collect(Collectors.toList());
    }

    @Override
    public void updateCourse(Long courseId, CourseDTO courseDTO) {

        Course course = mapperUtil.convert(courseDTO, new Course());

        courseRepository.findById(courseId).ifPresent(dbCourse -> {
            dbCourse.setName(course.getName());
            dbCourse.setCategory(course.getCategory());
            dbCourse.setDescription(course.getDescription());
            dbCourse.setRating(course.getRating());

            courseRepository.save(dbCourse);
        });
    }

    @Override
    public void deleteCourses() {
        courseRepository.deleteAll();
    }

    @Override
    public void deleteCourseById(long courseId) {
        courseRepository.deleteById(courseId);
    }

}
