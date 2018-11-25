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
public class PostcardApiController implements PostcardApi {

    private static final Logger log = LoggerFactory.getLogger(PostcardApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PostcardApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> postcardCreatepostcard(@ApiParam(value = "The AddressId or an object structured when creating an address by addresses/Create.", required=true) @RequestParam(value="to", required=true)  String to,@ApiParam(value = "The AddressId or an object structured when creating an address by addresses/Create.", required=true) @RequestParam(value="from", required=true)  String from,@ApiParam(value = "Set an existing postcard by attaching its PostcardId.", required=true) @RequestParam(value="attachbyid", required=true)  String attachbyid,@ApiParam(value = "A 4.25\"x6.25\" or 6.25\"x11.25\" image to use as the front of the postcard.  This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.", required=true) @RequestParam(value="front", required=true)  String front,@ApiParam(value = "A 4.25\"x6.25\" or 6.25\"x11.25\" image to use as the back of the postcard, supplied as a URL, local file, or HTML string.  This allows you to customize your back design, but we will still insert the recipient address for you.", required=true) @RequestParam(value="back", required=true)  String back,@ApiParam(value = "The message for the back of the postcard with a maximum of 350 characters.", required=true) @RequestParam(value="message", required=true)  String message,@ApiParam(value = "Code for the dimensions of the media to be printed.", required=true) @RequestParam(value="setting", required=true)  String setting,@ApiParam(value = "A description for the postcard.") @RequestParam(value="description", required=false)  String description,@ApiParam(value = "A string value that contains HTML markup.") @RequestParam(value="htmldata", required=false)  String htmldata) {
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

    public ResponseEntity<String> postcardDeletepostcard(@ApiParam(value = "The unique identifier of a postcard object.", required=true) @RequestParam(value="postcardid", required=true)  String postcardid) {
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

    public ResponseEntity<String> postcardListpostcard(@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestParam(value="page", required=false)  Integer page,@ApiParam(value = "The count of objects to return per page.", defaultValue="10") @RequestParam(value="pagesize", required=false)  Integer pagesize,@ApiParam(value = "The unique identifier for a postcard object.") @RequestParam(value="postcardid", required=false)  String postcardid,@ApiParam(value = "The date the postcard was created.") @RequestParam(value="dateCreated", required=false)  String dateCreated) {
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

    public ResponseEntity<String> postcardViewpostcard(@ApiParam(value = "The unique identifier for a postcard object.", required=true) @RequestParam(value="postcardid", required=true)  String postcardid) {
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
