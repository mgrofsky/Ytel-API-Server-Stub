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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-11T03:48:43.806Z")

@Controller
public class SmsApiController implements SmsApi {

    private static final Logger log = LoggerFactory.getLogger(SmsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SmsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> smsGetinboundsms(@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestParam(value="Page", required=false)  Integer page,@ApiParam(value = "The count of objects to return per page.", defaultValue="10") @RequestParam(value="PageSize", required=false)  Integer pageSize,@ApiParam(value = "Filter SMS message objects from this valid 10-digit phone number (E.164 format).") @RequestParam(value="From", required=false)  String from,@ApiParam(value = "Filter SMS message objects to this valid 10-digit phone number (E.164 format).") @RequestParam(value="To", required=false)  String to,@ApiParam(value = "Filter sms message objects by this date.") @RequestParam(value="DateSent", required=false)  String dateSent) {
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

    public ResponseEntity<String> smsListsms(@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestParam(value="Page", required=false)  Integer page,@ApiParam(value = "Number of individual resources listed in the response per page", defaultValue="10") @RequestParam(value="PageSize", required=false)  Integer pageSize,@ApiParam(value = "Filter SMS message objects from this valid 10-digit phone number (E.164 format).") @RequestParam(value="From", required=false)  String from,@ApiParam(value = "Filter SMS message objects to this valid 10-digit phone number (E.164 format).") @RequestParam(value="To", required=false)  String to,@ApiParam(value = "Only list SMS messages sent in the specified date range") @RequestParam(value="DateSent", required=false)  String dateSent) {
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

    public ResponseEntity<String> smsSendsms(@ApiParam(value = "The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent.", required=true) @RequestParam(value="From", required=true)  String from,@ApiParam(value = "The 10-digit phone number (E.164 format) that will receive the message.", required=true) @RequestParam(value="To", required=true)  String to,@ApiParam(value = "The body message that is to be sent in the text.", required=true) @RequestParam(value="Body", required=true)  String body,@ApiParam(value = "Specifies the HTTP method used to request the required URL once SMS sent.") @RequestParam(value="Method", required=false)  String method,@ApiParam(value = "URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.") @RequestParam(value="MessageStatusCallback", required=false)  String messageStatusCallback,@ApiParam(value = "Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message.", defaultValue="false") @RequestParam(value="Smartsms", required=false)  Boolean smartsms,@ApiParam(value = "Delivery reports are a method to tell your system if the message has arrived on the destination phone.", defaultValue="false") @RequestParam(value="DeliveryStatus", required=false)  Boolean deliveryStatus) {
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

    public ResponseEntity<String> smsViewdetailsms(@ApiParam(value = "The unique identifier for a sms message.", required=true) @RequestParam(value="MessageSid", required=true)  String messageSid) {
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

    public ResponseEntity<String> smsViewsms(@ApiParam(value = "The unique identifier for a sms message.", required=true) @RequestParam(value="MessageSid", required=true)  String messageSid) {
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
