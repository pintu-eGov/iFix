package org.egov.web.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.egov.web.models.EatRequest;
import org.egov.web.models.EatResponse;
import org.egov.web.models.EatSearchRequest;
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
public class EatApiController {

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public EatApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @RequestMapping(value = "/eat/v1/_create", method = RequestMethod.POST)
    public ResponseEntity<EatResponse> eatV1CreatePost(@ApiParam(value = "Details for the new department + RequestHeader (meta data of the API).", required = true) @Valid @RequestBody EatRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<EatResponse>(objectMapper.readValue("", EatResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                return new ResponseEntity<EatResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EatResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/eat/v1/_search", method = RequestMethod.POST)
    public ResponseEntity<EatResponse> eatV1SearchPost(@ApiParam(value = "Details for the EAT search criteria + RequestHeader (meta data of the API).", required = true) @Valid @RequestBody EatSearchRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<EatResponse>(objectMapper.readValue("", EatResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                return new ResponseEntity<EatResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EatResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
