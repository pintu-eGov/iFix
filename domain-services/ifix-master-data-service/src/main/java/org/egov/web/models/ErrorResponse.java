package org.egov.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * All APIs will return ErrorRes in case of failure which will carry ResponseHeader as metadata and Error object as actual representation of error.
 */
@ApiModel(description = "All APIs will return ErrorRes in case of failure which will carry ResponseHeader as metadata and Error object as actual representation of error.")
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2021-08-02T16:24:12.742+05:30")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponse {
    @JsonProperty("ResponseHeader")
    private ResponseHeader responseHeader = null;

    @JsonProperty("Errors")
    @Valid
    private List<Error> errors = null;


    public ErrorResponse addErrorsItem(Error errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

}

