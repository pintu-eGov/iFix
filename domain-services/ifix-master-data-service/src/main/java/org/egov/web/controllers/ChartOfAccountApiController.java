package org.egov.web.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.egov.web.models.COARequest;
import org.egov.web.models.COAResponse;
import org.egov.web.models.COASearchRequest;
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
@RequestMapping("/chartOfAccount/v1")
public class ChartOfAccountApiController {

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public ChartOfAccountApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @RequestMapping(value = "/chartOfAccount/v1/_create", method = RequestMethod.POST)
    public ResponseEntity<COAResponse> chartOfAccountV1CreatePost(@ApiParam(value = "Details for the new COA + RequestHeader (meta data of the API).", required = true) @Valid @RequestBody COARequest body) {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("")) {
//            try {
//                return new ResponseEntity<COAResponse>(objectMapper.readValue("", COAResponse.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                return new ResponseEntity<COAResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }

        return new ResponseEntity<COAResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/chartOfAccount/v1/_search", method = RequestMethod.POST)
    public ResponseEntity<COAResponse> chartOfAccountV1SearchPost(@ApiParam(value = "RequestHeader meta data.", required = true) @Valid @RequestBody COASearchRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<COAResponse>(objectMapper.readValue("", COAResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                return new ResponseEntity<COAResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<COAResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
