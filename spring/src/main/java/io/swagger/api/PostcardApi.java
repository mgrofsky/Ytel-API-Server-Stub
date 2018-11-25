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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-25T18:06:23.685Z")

@Api(value = "Postcard", description = "the Postcard API")
public interface PostcardApi {

    @ApiOperation(value = "Create Postcard", nickname = "postcardCreatepostcard", notes = "Create, print, and mail a postcard to an address. The postcard front must be supplied as a PDF, image, or an HTML string. The back can be a PDF, image, HTML string, or it can be automatically generated by supplying a custom message.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "PostCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/Postcard/createpostcard.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> postcardCreatepostcard(@ApiParam(value = "The AddressId or an object structured when creating an address by addresses/Create.", required=true) @RequestParam(value="to", required=true)  String to,@ApiParam(value = "The AddressId or an object structured when creating an address by addresses/Create.", required=true) @RequestParam(value="from", required=true)  String from,@ApiParam(value = "Set an existing postcard by attaching its PostcardId.", required=true) @RequestParam(value="attachbyid", required=true)  String attachbyid,@ApiParam(value = "A 4.25\"x6.25\" or 6.25\"x11.25\" image to use as the front of the postcard.  This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.", required=true) @RequestParam(value="front", required=true)  String front,@ApiParam(value = "A 4.25\"x6.25\" or 6.25\"x11.25\" image to use as the back of the postcard, supplied as a URL, local file, or HTML string.  This allows you to customize your back design, but we will still insert the recipient address for you.", required=true) @RequestParam(value="back", required=true)  String back,@ApiParam(value = "The message for the back of the postcard with a maximum of 350 characters.", required=true) @RequestParam(value="message", required=true)  String message,@ApiParam(value = "Code for the dimensions of the media to be printed.", required=true) @RequestParam(value="setting", required=true)  String setting,@ApiParam(value = "A description for the postcard.") @RequestParam(value="description", required=false)  String description,@ApiParam(value = "A string value that contains HTML markup.") @RequestParam(value="htmldata", required=false)  String htmldata);


    @ApiOperation(value = "Delete Postcard", nickname = "postcardDeletepostcard", notes = "Remove a postcard object.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "PostCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/Postcard/deletepostcard.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> postcardDeletepostcard(@ApiParam(value = "The unique identifier of a postcard object.", required=true) @RequestParam(value="postcardid", required=true)  String postcardid);


    @ApiOperation(value = "List Postcards", nickname = "postcardListpostcard", notes = "Retrieve a list of postcard objects. The postcards objects are sorted by creation date, with the most recently created postcards appearing first.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "PostCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/Postcard/listpostcard.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> postcardListpostcard(@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestParam(value="page", required=false)  Integer page,@ApiParam(value = "The count of objects to return per page.", defaultValue="10") @RequestParam(value="pagesize", required=false)  Integer pagesize,@ApiParam(value = "The unique identifier for a postcard object.") @RequestParam(value="postcardid", required=false)  String postcardid,@ApiParam(value = "The date the postcard was created.") @RequestParam(value="dateCreated", required=false)  String dateCreated);


    @ApiOperation(value = "View Postcard", nickname = "postcardViewpostcard", notes = "Retrieve a postcard object by its PostcardId.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "PostCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/Postcard/viewpostcard.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> postcardViewpostcard(@ApiParam(value = "The unique identifier for a postcard object.", required=true) @RequestParam(value="postcardid", required=true)  String postcardid);

}
