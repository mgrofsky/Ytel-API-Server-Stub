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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-25T17:53:17.796Z")

@Controller
public class DedicatedshortcodeApiController implements DedicatedshortcodeApi {

    private static final Logger log = LoggerFactory.getLogger(DedicatedshortcodeApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DedicatedshortcodeApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> dedicatedshortcodeGetinboundsms(@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestParam(value="page", required=false)  Integer page,@ApiParam(value = "Number of individual resources listed in the response per page", defaultValue="10") @RequestParam(value="pagesize", required=false)  Integer pagesize,@ApiParam(value = "Only list SMS messages sent from this number") @RequestParam(value="From", required=false)  String from,@ApiParam(value = "Only list SMS messages sent to Shortcode") @RequestParam(value="Shortcode", required=false)  String shortcode,@ApiParam(value = "Only list SMS messages sent in the specified date MAKE REQUEST") @RequestParam(value="Datecreated", required=false)  String datecreated) {
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

    public ResponseEntity<String> dedicatedshortcodeListshortcode(@ApiParam(value = "Only list Short Code Assignment sent from this Short Code") @RequestParam(value="Shortcode", required=false)  String shortcode,@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.") @RequestParam(value="page", required=false)  String page,@ApiParam(value = "The count of objects to return per page.") @RequestParam(value="pagesize", required=false)  String pagesize) {
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

    public ResponseEntity<String> dedicatedshortcodeSendsms(@ApiParam(value = "Your dedicated shortcode", required=true) @RequestParam(value="shortcode", required=true)  Integer shortcode,@ApiParam(value = "The number to send your SMS to", required=true) @RequestParam(value="to", required=true)  Double to,@ApiParam(value = "The body of your message", required=true) @RequestParam(value="body", required=true)  String body,@ApiParam(value = "Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST") @RequestParam(value="method", required=false)  String method,@ApiParam(value = "URL that can be requested to receive notification when Short Code message was sent.") @RequestParam(value="messagestatuscallback", required=false)  String messagestatuscallback) {
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

    public ResponseEntity<String> dedicatedshortcodeUpdateshortcode(@ApiParam(value = "List of valid dedicated shortcode to your Ytel account.", required=true) @RequestParam(value="Shortcode", required=true)  String shortcode,@ApiParam(value = "User generated name of the dedicated shortcode.") @RequestParam(value="FriendlyName", required=false)  String friendlyName,@ApiParam(value = "Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.") @RequestParam(value="CallbackMethod", required=false)  String callbackMethod,@ApiParam(value = "URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.") @RequestParam(value="CallbackUrl", required=false)  String callbackUrl,@ApiParam(value = "Specifies the HTTP method used to request the required FallbackUrl once call connects.") @RequestParam(value="FallbackMethod", required=false)  String fallbackMethod,@ApiParam(value = "URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.") @RequestParam(value="FallbackUrl", required=false)  String fallbackUrl) {
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

    public ResponseEntity<String> dedicatedshortcodeViewshortcode(@ApiParam(value = "List of valid Dedicated Short Code to your Ytel account", required=true) @RequestParam(value="Shortcode", required=true)  String shortcode) {
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
