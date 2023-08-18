package com.sl.student.primary.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sl.student.primary.model.Request;
import com.sl.student.primary.model.StudentResponse;
import com.sl.student.secondary.dao.CommonDaoImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    private final CommonDaoImpl studentService;

    public StudentController(CommonDaoImpl studentService) {
        this.studentService = studentService;
    }

    @PostMapping(value = "/getStudents")
    public String getStudent(@RequestBody Request request) throws JsonProcessingException {

        return  studentService.getProcData(request);
    }
}
