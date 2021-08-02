package org.egov.web.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.egov.web.models.DepartmentRequest;
import org.egov.web.models.DepartmentResponse;
import org.egov.web.models.DepartmentSearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;

@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2021-08-02T16:24:12.742+05:30")

@Controller
@RequestMapping("/eGovTrial/iFIX-Master-Data/1.0.0")
public class DepartmentApiController {

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public DepartmentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @RequestMapping(value = "/department/v1/_create", method = RequestMethod.POST)
    public ResponseEntity<DepartmentResponse> departmentV1CreatePost(@ApiParam(value = "Details for the new department + RequestHeader (meta data of the API).", required = true) @Valid @RequestBody DepartmentRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<DepartmentResponse>(objectMapper.readValue("", DepartmentResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                return new ResponseEntity<DepartmentResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DepartmentResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/department/v1/_search", method = RequestMethod.POST)
    public ResponseEntity<DepartmentResponse> departmentV1SearchPost(@ApiParam(value = "Details for the department search criteria + RequestHeader (meta data of the API).", required = true) @Valid @RequestBody DepartmentSearchRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<DepartmentResponse>(objectMapper.readValue("", DepartmentResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                return new ResponseEntity<DepartmentResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DepartmentResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
