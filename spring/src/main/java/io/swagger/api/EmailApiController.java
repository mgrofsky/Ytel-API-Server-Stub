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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T20:13:28.172Z")

@Controller
public class EmailApiController implements EmailApi {

    private static final Logger log = LoggerFactory.getLogger(EmailApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EmailApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> emailAddunsubscribesemail(@ApiParam(value = "A valid email address that is to be added to the unsubscribe list", required=true) @RequestPart(value="email", required=true)  String email) {
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

    public ResponseEntity<String> emailDeleteblocksemail(@ApiParam(value = "The email address to be remove from the blocked list.", required=true) @RequestPart(value="Email", required=true)  String email) {
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

    public ResponseEntity<String> emailDeletebouncesemail(@ApiParam(value = "The email address to be remove from the bounced email list.", required=true) @RequestPart(value="Email", required=true)  String email) {
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

    public ResponseEntity<String> emailDeleteinvalidemail(@ApiParam(value = "A valid email address that is to be remove from the invalid email list.", required=true) @RequestPart(value="Email", required=true)  String email) {
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

    public ResponseEntity<String> emailDeletespamemail(@ApiParam(value = "A valid email address that is to be remove from the spam list.", required=true) @RequestPart(value="Email", required=true)  String email) {
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

    public ResponseEntity<String> emailDeleteunsubscribedemail(@ApiParam(value = "A valid email address that is to be remove from the unsubscribe list.", required=true) @RequestPart(value="email", required=true)  String email) {
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

    public ResponseEntity<String> emailListblockemail(@ApiParam(value = "The starting point of the list of blocked emails that should be returned.") @RequestPart(value="Offset", required=false)  String offset,@ApiParam(value = "The count of results that should be returned.") @RequestPart(value="Limit", required=false)  String limit) {
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

    public ResponseEntity<String> emailListbounceemail(@ApiParam(value = "The starting point of the list of bounced emails that should be returned.") @RequestPart(value="Offset", required=false)  String offset,@ApiParam(value = "The count of results that should be returned.") @RequestPart(value="Limit", required=false)  String limit) {
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

    public ResponseEntity<String> emailListinvalidemail(@ApiParam(value = "The starting point of the list of invalid emails that should be returned.") @RequestPart(value="Offset", required=false)  String offset,@ApiParam(value = "The count of results that should be returned.") @RequestPart(value="Limit", required=false)  String limit) {
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

    public ResponseEntity<String> emailListspamemail(@ApiParam(value = "The starting point of the list of spam emails that should be returned.") @RequestPart(value="Offset", required=false)  String offset,@ApiParam(value = "The count of results that should be returned.") @RequestPart(value="Limit", required=false)  String limit) {
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

    public ResponseEntity<String> emailListunsubscribedemail(@ApiParam(value = "The starting point of the list of unsubscribed emails that should be returned.") @RequestPart(value="Offset", required=false)  String offset,@ApiParam(value = "The count of results that should be returned.") @RequestPart(value="Limit", required=false)  String limit) {
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

    public ResponseEntity<String> emailSendemails(@ApiParam(value = "A valid address that will receive the email. Multiple addresses can be separated by using commas.", required=true) @RequestPart(value="To", required=true)  String to,@ApiParam(value = "Specifies the type of email to be sent", required=true, allowableValues="text, html") @RequestPart(value="Type", required=true)  String type,@ApiParam(value = "The subject of the mail. Must be a valid string.", required=true) @RequestPart(value="Subject", required=true)  String subject,@ApiParam(value = "The email message that is to be sent in the text.", required=true) @RequestPart(value="Message", required=true)  String message,@ApiParam(value = "A valid address that will send the email.") @RequestPart(value="From", required=false)  String from,@ApiParam(value = "Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas.") @RequestPart(value="Cc", required=false)  String cc,@ApiParam(value = "Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas.") @RequestPart(value="Bcc", required=false)  String bcc,@ApiParam(value = "A file that is attached to the email. Must be less than 7 MB in size.") @RequestPart(value="Attachment", required=false)  String attachment) {
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
