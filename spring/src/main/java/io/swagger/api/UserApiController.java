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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-21T18:17:51.171Z")

@Controller
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> userCreatesubaccount(@ApiParam(value = "Sub account user first name", required=true) @RequestParam(value="FirstName", required=true)  String firstName,@ApiParam(value = "sub account user last name", required=true) @RequestParam(value="LastName", required=true)  String lastName,@ApiParam(value = "Sub account email address", required=true) @RequestParam(value="Email", required=true)  String email,@ApiParam(value = "Descriptive name of the sub account", required=true) @RequestParam(value="FriendlyName", required=true)  String friendlyName,@ApiParam(value = "The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.", required=true) @RequestParam(value="Password", required=true)  String password) {
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

    public ResponseEntity<String> userDeletesubaccount(@ApiParam(value = "The SubaccountSid to be deleted", required=true) @RequestParam(value="SubAccountSID", required=true)  String subAccountSID,@ApiParam(value = "0 to delete or 1 to merge numbers to parent account.", required=true, allowableValues="0, 1") @RequestParam(value="MergeNumber", required=true)  String mergeNumber) {
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

    public ResponseEntity<String> userSubaccountactivation(@ApiParam(value = "The SubaccountSid to be activated or suspended", required=true) @RequestParam(value="SubAccountSID", required=true)  String subAccountSID,@ApiParam(value = "0 to suspend or 1 to activate", required=true, allowableValues="1, 0") @RequestParam(value="Activate", required=true)  String activate) {
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
