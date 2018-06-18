/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.12-1).
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T20:13:28.172Z")

@Api(value = "conferences", description = "the conferences API")
public interface ConferencesApi {

    @ApiOperation(value = "Add Participant", nickname = "conferencesAddParticipant", notes = "Add Participant in conference ", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Conference", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/conferences/addParticipant.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> conferencesAddParticipant(@ApiParam(value = "The unique identifier for a conference object.", required=true) @RequestPart(value="ConferenceSid", required=true)  String conferenceSid,@ApiParam(value = "The phone number of the participant to be added.", required=true) @RequestPart(value="ParticipantNumber", required=true)  String participantNumber,@ApiParam(value = "Specifies if participant should be muted.") @RequestPart(value="Muted", required=false)  Boolean muted,@ApiParam(value = "Specifies if the participant should hear audio in the conference.") @RequestPart(value="Deaf", required=false)  Boolean deaf);


    @ApiOperation(value = "Create Conference", nickname = "conferencesCreateConference", notes = "Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Conference", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/conferences/createConference.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> conferencesCreateConference(@ApiParam(value = "A valid 10-digit number (E.164 format) that will be initiating the conference call.", required=true) @RequestPart(value="From", required=true)  String from,@ApiParam(value = "A valid 10-digit number (E.164 format) that is to receive the conference call.", required=true) @RequestPart(value="To", required=true)  String to,@NotNull @ApiParam(value = "URL requested once the conference connects", required = true) @Valid @RequestParam(value = "Url", required = true) String url,@ApiParam(value = "Specifies the HTTP method used to request the required URL once call connects.", defaultValue="POST") @RequestPart(value="Method", required=false)  String method,@ApiParam(value = "URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished.") @RequestPart(value="StatusCallBackUrl", required=false)  String statusCallBackUrl,@ApiParam(value = "Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.") @RequestPart(value="StatusCallBackMethod", required=false)  String statusCallBackMethod,@ApiParam(value = "URL requested if the initial Url parameter fails or encounters an error") @RequestPart(value="FallbackUrl", required=false)  String fallbackUrl,@ApiParam(value = "Specifies the HTTP method used to request the required FallbackUrl once call connects.") @RequestPart(value="FallbackMethod", required=false)  String fallbackMethod,@ApiParam(value = "Specifies if the conference should be recorded.") @RequestPart(value="Record", required=false)  Boolean record,@ApiParam(value = "Recording parameters will be sent here upon completion.") @RequestPart(value="RecordCallBackUrl", required=false)  String recordCallBackUrl,@ApiParam(value = "Specifies the HTTP method used to request the required URL once conference connects.") @RequestPart(value="RecordCallBackMethod", required=false)  String recordCallBackMethod,@ApiParam(value = "Schedule conference in future. Schedule time must be greater than current time") @RequestPart(value="ScheduleTime", required=false)  String scheduleTime,@ApiParam(value = "The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set.") @RequestPart(value="Timeout", required=false)  Integer timeout);


    @ApiOperation(value = "Silence Participant", nickname = "conferencesDeafMuteParticipant", notes = "Deaf Mute Participant", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Conference", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/conferences/deafMuteParticipant.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> conferencesDeafMuteParticipant(@ApiParam(value = "ID of the active conference", required=true) @RequestPart(value="conferenceSid", required=true)  String conferenceSid,@ApiParam(value = "ID of an active participant", required=true) @RequestPart(value="ParticipantSid", required=true)  String participantSid,@ApiParam(value = "Mute a participant") @RequestPart(value="Muted", required=false)  Boolean muted,@ApiParam(value = "Make it so a participant cant hear") @RequestPart(value="Deaf", required=false)  Boolean deaf);


    @ApiOperation(value = "Hangup Participant", nickname = "conferencesHangupParticipant", notes = "Remove a participant from a conference.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Conference", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/conferences/hangupParticipant.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> conferencesHangupParticipant(@ApiParam(value = "The unique identifier for a conference object.", required=true) @RequestPart(value="ConferenceSid", required=true)  String conferenceSid,@NotNull @ApiParam(value = "The unique identifier for a participant object.", required = true) @Valid @RequestParam(value = "ParticipantSid", required = true) String participantSid);


    @ApiOperation(value = "List Participants", nickname = "conferencesListParticipant", notes = "Retrieve a list of participants for an in-progress conference.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Conference", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/conferences/listParticipant.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> conferencesListParticipant(@ApiParam(value = "The unique identifier for a conference.", required=true) @RequestPart(value="ConferenceSid", required=true)  String conferenceSid,@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestPart(value="Page", required=false)  Integer page,@ApiParam(value = "The count of objects to return per page.", defaultValue="10") @RequestPart(value="Pagesize", required=false)  Integer pagesize,@ApiParam(value = "Specifies if participant should be muted.") @RequestPart(value="Muted", required=false)  Boolean muted,@ApiParam(value = "Specifies if the participant should hear audio in the conference.") @RequestPart(value="Deaf", required=false)  Boolean deaf);


    @ApiOperation(value = "List Conferences", nickname = "conferencesListconference", notes = "Retrieve a list of conference objects.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Conference", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/conferences/listconference.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> conferencesListconference(@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestPart(value="page", required=false)  Integer page,@ApiParam(value = "Number of individual resources listed in the response per page", defaultValue="10") @RequestPart(value="pagesize", required=false)  Integer pagesize,@ApiParam(value = "Only return conferences with the specified FriendlyName") @RequestPart(value="FriendlyName", required=false)  String friendlyName,@ApiParam(value = "Conference created date") @RequestPart(value="DateCreated", required=false)  String dateCreated);


    @ApiOperation(value = "Play Audio", nickname = "conferencesPlayAudio", notes = "Play an audio file during a conference.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Conference", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/conferences/playAudio.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> conferencesPlayAudio(@ApiParam(value = "The unique identifier for a conference object.", required=true) @RequestPart(value="ConferenceSid", required=true)  String conferenceSid,@ApiParam(value = "The unique identifier for a participant object.", required=true) @RequestPart(value="ParticipantSid", required=true)  String participantSid,@ApiParam(value = "The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon.", required=true, allowableValues="mp3, wav") @RequestPart(value="AudioUrl", required=true)  String audioUrl);


    @ApiOperation(value = "View Participant", nickname = "conferencesViewParticipant", notes = "Retrieve information about a participant by its ParticipantSid.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Conference", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/conferences/viewParticipant.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> conferencesViewParticipant(@ApiParam(value = "The unique identifier for a conference object.", required=true) @RequestPart(value="ConferenceSid", required=true)  String conferenceSid,@ApiParam(value = "The unique identifier for a participant object.", required=true) @RequestPart(value="ParticipantSid", required=true)  String participantSid);


    @ApiOperation(value = "View Conference", nickname = "conferencesViewconference", notes = "Retrieve information about a conference by its ConferenceSid.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Conference", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/conferences/viewconference.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> conferencesViewconference(@ApiParam(value = "The unique identifier of each conference resource", required=true) @RequestPart(value="ConferenceSid", required=true)  String conferenceSid);

}
