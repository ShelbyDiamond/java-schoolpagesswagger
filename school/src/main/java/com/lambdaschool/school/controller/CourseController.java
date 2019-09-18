package com.lambdaschool.school.controller;

import com.lambdaschool.school.model.Course;
import com.lambdaschool.school.model.ErrorDetail;
import com.lambdaschool.school.service.CourseService;
import com.lambdaschool.school.view.CountStudentsInCourses;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/courses")
public class CourseController
{
    private static final Logger logger = LoggerFactory.getLogger(CourseController.class);

    @Autowired
    private CourseService courseService;

    @ApiOperation(value = "returns all Courses with Paging Ability",
            responseContainer = "List")
    @ApiImplicitParams({@ApiImplicitParam(name = "page",
            dataType = "integer",
            paramType = "query",
            value = "Results page you want to retrieve (0..N)"), @ApiImplicitParam(name = "size",
            dataType = "integer",
            paramType = "query",
            value = "Number of records per page."), @ApiImplicitParam(name = "sort",
            allowMultiple = true,
            dataType = "string",
            paramType = "query",
            value = "Sorting criteria in the format: property(,asc|desc). " + "Default sort order is ascending. " + "Multiple sort criteria are supported.")})

    @GetMapping(value = "/courses", produces = {"application/json"})
    public ResponseEntity<?> listAllCourses(HttpServletRequest request, @PageableDefault(page = 0, size = 3) Pageable pageable)
    {
        logger.info(request.getMethod() + " " + request.getRequestURI() + " accessed");

        ArrayList<Course> myCourses = courseService.findAll(pageable);
        return new ResponseEntity<>(myCourses, HttpStatus.OK);
    }

    @ApiOperation(value = "Retrieves all of the courses without Paging ")
    @GetMapping(value = "/allcourses",
            produces = {"application/json"})
    public ResponseEntity<?> reallyListAllCourses() {
        ArrayList<Course> myCourses = courseService.findAll();
        return new ResponseEntity<>(myCourses, HttpStatus.OK);
    }

    @ApiOperation(value = "Retrieves the total students in each course",
            response = CountStudentsInCourses.class)
    @ApiResponses(value = {@ApiResponse(code = 201,
            message = "Student Found",
            responseContainer = "List",
            response = CountStudentsInCourses.class), @ApiResponse(code = 404,
            message = "Could Not Calculate Count",
            response = ErrorDetail.class)})

    @GetMapping(value = "/studcount", produces = {"application/json"})
    public ResponseEntity<?> getCountStudentsInCourses(HttpServletRequest request)
    {
        logger.info(request.getMethod() + " " + request.getRequestURI() + " accessed");

        ArrayList<CountStudentsInCourses> list = courseService.getCountStudentsInCourse();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @ApiOperation(value = "Deletes a course by ID",
            response = void.class)
    @ApiResponses(value = {@ApiResponse(code = 201,
            message = "Course Deleted",
            response = void.class), @ApiResponse(code = 500,
            message = "Error Deleting the Course",
            response = ErrorDetail.class)})
    @DeleteMapping("/courses/{courseid}")
    public ResponseEntity<?> deleteCourseById(
            @ApiParam(value = "The Course ID",
                    required = true,
                    example = "42")
            @PathVariable long courseid,
            HttpServletRequest request)
    {
        logger.info(request.getMethod() + " " + request.getRequestURI() + " accessed");

        courseService.delete(courseid);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}