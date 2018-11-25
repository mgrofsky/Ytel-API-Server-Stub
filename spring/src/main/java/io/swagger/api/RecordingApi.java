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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-25T17:42:47.375Z")

@Api(value = "recording", description = "the recording API")
public interface RecordingApi {

    @ApiOperation(value = "Delete Recording", nickname = "recordingDeleterecording", notes = "Remove a recording from your Ytel account.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Recording", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/recording/deleterecording.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> recordingDeleterecording(@ApiParam(value = "The unique identifier for a recording.", required=true) @RequestParam(value="recordingsid", required=true)  String recordingsid);


    @ApiOperation(value = "List Recordings", nickname = "recordingListrecording", notes = "Retrieve a list of recording objects.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Recording", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/recording/listrecording.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> recordingListrecording(@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestParam(value="page", required=false)  Integer page,@ApiParam(value = "The count of objects to return per page.", defaultValue="10") @RequestParam(value="pagesize", required=false)  Integer pagesize,@ApiParam(value = "Filter results by creation date") @RequestParam(value="Datecreated", required=false)  String datecreated,@ApiParam(value = "The unique identifier for a call.") @RequestParam(value="callsid", required=false)  String callsid);


    @ApiOperation(value = "View Recording", nickname = "recordingViewrecording", notes = "Retrieve the recording of a call by its RecordingSid. This resource will return information regarding the call such as start time, end time, duration, and so forth.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Recording", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/recording/viewrecording.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> recordingViewrecording(@ApiParam(value = "The unique identifier for the recording.", required=true) @RequestParam(value="recordingsid", required=true)  String recordingsid);

}
