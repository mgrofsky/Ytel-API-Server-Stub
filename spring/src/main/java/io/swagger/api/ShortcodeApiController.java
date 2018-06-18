package io.swagger.api;

import java.util.UUID;
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
public class ShortcodeApiController implements ShortcodeApi {

    private static final Logger log = LoggerFactory.getLogger(ShortcodeApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ShortcodeApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> shortcodeGetinboundsms(@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestPart(value="page", required=false)  Integer page,@ApiParam(value = "Number of individual resources listed in the response per page", defaultValue="10") @RequestPart(value="pagesize", required=false)  Integer pagesize,@ApiParam(value = "From Number to Inbound ShortCode") @RequestPart(value="from", required=false)  String from,@ApiParam(value = "Only list messages sent to this Short Code") @RequestPart(value="Shortcode", required=false)  String shortcode,@ApiParam(value = "Only list messages sent with the specified date") @Valid @RequestParam(value = "Datecreated", required = false) String datecreated) {
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

    public ResponseEntity<String> shortcodeListshortcode(@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestPart(value="page", required=false)  Integer page,@ApiParam(value = "Number of individual resources listed in the response per page", defaultValue="10") @RequestPart(value="pagesize", required=false)  Integer pagesize,@ApiParam(value = "Only list keywords of shortcode") @Valid @RequestParam(value = "Shortcode", required = false) String shortcode) {
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

    public ResponseEntity<String> shortcodeListsms(@ApiParam(value = "Only list messages sent from this Short Code") @RequestPart(value="Shortcode", required=false)  String shortcode,@ApiParam(value = "Only list messages sent to this number") @RequestPart(value="To", required=false)  String to,@ApiParam(value = "Only list messages sent with the specified date") @RequestPart(value="DateSent", required=false)  String dateSent,@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestPart(value="Page", required=false)  Integer page,@ApiParam(value = "The count of objects to return per page.", defaultValue="10") @RequestPart(value="PageSize", required=false)  Integer pageSize) {
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

    public ResponseEntity<String> shortcodeSendsms(@ApiParam(value = "The Short Code number that is the sender of this message", required=true) @RequestPart(value="shortcode", required=true)  String shortcode,@ApiParam(value = "A valid 10-digit number that should receive the message", required=true) @RequestPart(value="to", required=true)  String to,@ApiParam(value = "The unique identifier for the template used for the message", required=true) @RequestPart(value="templateid", required=true)  UUID templateid,@ApiParam(value = "format of your data, example: {companyname}:test,{otpcode}:1234", required=true) @RequestPart(value="data", required=true)  String data,@ApiParam(value = "Specifies the HTTP method used to request the required URL once the Short Code message is sent.", defaultValue="GET") @RequestPart(value="Method", required=false)  String method,@ApiParam(value = "URL that can be requested to receive notification when Short Code message was sent.") @RequestPart(value="MessageStatusCallback", required=false)  String messageStatusCallback) {
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

    public ResponseEntity<String> shortcodeUpdateshortcode(@ApiParam(value = "List of valid shortcode to your Ytel account", required=true) @RequestPart(value="Shortcode", required=true)  String shortcode,@ApiParam(value = "User generated name of the shortcode") @RequestPart(value="FriendlyName", required=false)  String friendlyName,@ApiParam(value = "URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.") @RequestPart(value="CallbackUrl", required=false)  String callbackUrl,@ApiParam(value = "Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.") @RequestPart(value="CallbackMethod", required=false)  String callbackMethod,@ApiParam(value = "URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.") @RequestPart(value="FallbackUrl", required=false)  String fallbackUrl,@ApiParam(value = "Specifies the HTTP method used to request the required FallbackUrl once call connects.") @RequestPart(value="FallbackUrlMethod", required=false)  String fallbackUrlMethod) {
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

    public ResponseEntity<String> shortcodeViewshortcode(@ApiParam(value = "List of valid Shortcode to your Ytel account", required=true) @RequestPart(value="Shortcode", required=true)  String shortcode) {
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

    public ResponseEntity<String> shortcodeViewsms(@ApiParam(value = "The unique identifier for the sms resource", required=true) @RequestPart(value="MessageSid", required=true)  String messageSid) {
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
