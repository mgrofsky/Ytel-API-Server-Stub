/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-11T03:48:43.806Z")

@Api(value = "letter", description = "the letter API")
public interface LetterApi {

    @ApiOperation(value = "Create Letter", nickname = "letterCreate", notes = "Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Letter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/letter/create.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> letterCreate(@ApiParam(value = "The AddressId or an object structured when creating an address by addresses/Create.", required=true) @RequestParam(value="to", required=true)  String to,@ApiParam(value = "The AddressId or an object structured when creating an address by addresses/Create.", required=true) @RequestParam(value="from", required=true)  String from,@ApiParam(value = "Set an existing letter by attaching its LetterId.", required=true) @RequestParam(value="attachbyid", required=true)  String attachbyid,@ApiParam(value = "File can be a 8.5\"x11\" PDF uploaded file or URL that links to a file.", required=true) @RequestParam(value="file", required=true)  String file,@ApiParam(value = "Specify if letter should be printed in color.", required=true) @RequestParam(value="color", required=true)  String color,@ApiParam(value = "A description for the letter.") @RequestParam(value="description", required=false)  String description,@ApiParam(value = "Add an extra service to your letter. Options are \"certified\" or \"registered\". Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50.") @RequestParam(value="extraservice", required=false)  String extraservice,@ApiParam(value = "Specify if letter should be printed on both sides.") @RequestParam(value="doublesided", required=false)  String doublesided,@ApiParam(value = "Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page.") @RequestParam(value="template", required=false)  String template,@ApiParam(value = "A string value that contains HTML markup.") @RequestParam(value="htmldata", required=false)  String htmldata);


    @ApiOperation(value = "Delete Letter", nickname = "letterDelete", notes = "Remove a letter object by its LetterId.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Letter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/letter/delete.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> letterDelete(@ApiParam(value = "The unique identifier for a letter object.", required=true) @RequestParam(value="lettersid", required=true)  String lettersid);


    @ApiOperation(value = "List Letters", nickname = "letterListsletter", notes = "Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Letter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/letter/listsletter.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> letterListsletter(@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestParam(value="page", required=false)  Integer page,@ApiParam(value = "The count of objects to return per page.", defaultValue="10") @RequestParam(value="pagesize", required=false)  Integer pagesize,@ApiParam(value = "The unique identifier for a letter object.") @RequestParam(value="lettersid", required=false)  String lettersid,@ApiParam(value = "The date the letter was created.") @RequestParam(value="dateCreated", required=false)  String dateCreated);


    @ApiOperation(value = "View Letter", nickname = "letterViewletter", notes = "Retrieve a letter object by its LetterSid.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Letter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/letter/viewletter.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> letterViewletter(@ApiParam(value = "The unique identifier for a letter object.", required=true) @RequestParam(value="lettersid", required=true)  String lettersid);

}
