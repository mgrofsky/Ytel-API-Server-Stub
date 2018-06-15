package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-15T17:00:45.154Z")

@Controller
public class UsageApiController implements UsageApi {

    private static final Logger log = LoggerFactory.getLogger(UsageApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UsageApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> usageListusage(@ApiParam(value = "Filter usage results by product type.", allowableValues="0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13", defaultValue="0") @RequestPart(value="ProductCode", required=false)  String productCode,@ApiParam(value = "Filter usage objects by start date.", defaultValue="2016-09-06") @RequestPart(value="startDate", required=false)  String startDate,@ApiParam(value = "Filter usage objects by end date.", defaultValue="2016-09-06") @RequestPart(value="endDate", required=false)  String endDate,@ApiParam(value = "Will include all subaccount usage data") @RequestPart(value="IncludeSubAccounts", required=false)  String includeSubAccounts) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type ", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

}
