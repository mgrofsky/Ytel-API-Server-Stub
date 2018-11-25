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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-25T18:04:42.332Z")

@Controller
public class LetterApiController implements LetterApi {

    private static final Logger log = LoggerFactory.getLogger(LetterApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LetterApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> letterCreate(@ApiParam(value = "The AddressId or an object structured when creating an address by addresses/Create.", required=true) @RequestParam(value="to", required=true)  String to,@ApiParam(value = "The AddressId or an object structured when creating an address by addresses/Create.", required=true) @RequestParam(value="from", required=true)  String from,@ApiParam(value = "Set an existing letter by attaching its LetterId.", required=true) @RequestParam(value="attachbyid", required=true)  String attachbyid,@ApiParam(value = "File can be a 8.5\"x11\" PDF uploaded file or URL that links to a file.", required=true) @RequestParam(value="file", required=true)  String file,@ApiParam(value = "Specify if letter should be printed in color.", required=true) @RequestParam(value="color", required=true)  String color,@ApiParam(value = "A description for the letter.") @RequestParam(value="description", required=false)  String description,@ApiParam(value = "Add an extra service to your letter. Options are \"certified\" or \"registered\". Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50.") @RequestParam(value="extraservice", required=false)  String extraservice,@ApiParam(value = "Specify if letter should be printed on both sides.") @RequestParam(value="doublesided", required=false)  String doublesided,@ApiParam(value = "Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page.") @RequestParam(value="template", required=false)  String template,@ApiParam(value = "A string value that contains HTML markup.") @RequestParam(value="htmldata", required=false)  String htmldata) {
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

    public ResponseEntity<String> letterDelete(@ApiParam(value = "The unique identifier for a letter object.", required=true) @RequestParam(value="lettersid", required=true)  String lettersid) {
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

    public ResponseEntity<String> letterListsletter(@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestParam(value="page", required=false)  Integer page,@ApiParam(value = "The count of objects to return per page.", defaultValue="10") @RequestParam(value="pagesize", required=false)  Integer pagesize,@ApiParam(value = "The unique identifier for a letter object.") @RequestParam(value="lettersid", required=false)  String lettersid,@ApiParam(value = "The date the letter was created.") @RequestParam(value="dateCreated", required=false)  String dateCreated) {
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

    public ResponseEntity<String> letterViewletter(@ApiParam(value = "The unique identifier for a letter object.", required=true) @RequestParam(value="lettersid", required=true)  String lettersid) {
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
