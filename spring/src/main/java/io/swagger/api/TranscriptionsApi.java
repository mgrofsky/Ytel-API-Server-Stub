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

@Api(value = "transcriptions", description = "the transcriptions API")
public interface TranscriptionsApi {

    @ApiOperation(value = "Transcribe Audio URL", nickname = "transcriptionsAudiourltranscription", notes = "Transcribe an audio recording from a file.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Transcription", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/transcriptions/audiourltranscription.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> transcriptionsAudiourltranscription(@ApiParam(value = "URL pointing to the location of the audio file that is to be transcribed.", required=true) @RequestParam(value="audiourl", required=true)  String audiourl);


    @ApiOperation(value = "List Transcriptions", nickname = "transcriptionsListtranscription", notes = "Retrieve a list of transcription objects for your Ytel account.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Transcription", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/transcriptions/listtranscription.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> transcriptionsListtranscription(@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestParam(value="page", required=false)  Integer page,@ApiParam(value = "The count of objects to return per page.", defaultValue="10") @RequestParam(value="pagesize", required=false)  Integer pagesize,@ApiParam(value = "The state of the transcription.", allowableValues="inprogress, success, failure") @RequestParam(value="status", required=false)  String status,@ApiParam(value = "The date the transcription took place.") @RequestParam(value="dateTranscribed", required=false)  String dateTranscribed);


    @ApiOperation(value = "Transcribe Recording", nickname = "transcriptionsRecordingtranscription", notes = "Transcribe a recording by its RecordingSid.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Transcription", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/transcriptions/recordingtranscription.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> transcriptionsRecordingtranscription(@ApiParam(value = "The unique identifier for a recording object.", required=true) @RequestParam(value="recordingSid", required=true)  String recordingSid);


    @ApiOperation(value = "View Transcription", nickname = "transcriptionsViewtranscription", notes = "Retrieve information about a transaction by its TranscriptionSid.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Transcription", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/transcriptions/viewtranscription.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> transcriptionsViewtranscription(@ApiParam(value = "The unique identifier for a transcription object.", required=true) @RequestParam(value="transcriptionsid", required=true)  String transcriptionsid);

}
