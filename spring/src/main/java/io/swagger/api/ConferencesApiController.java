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
public class ConferencesApiController implements ConferencesApi {

    private static final Logger log = LoggerFactory.getLogger(ConferencesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ConferencesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> conferencesAddParticipant(@ApiParam(value = "The unique identifier for a conference object.", required=true) @RequestParam(value="ConferenceSid", required=true)  String conferenceSid,@ApiParam(value = "The phone number of the participant to be added.", required=true) @RequestParam(value="ParticipantNumber", required=true)  String participantNumber,@ApiParam(value = "Specifies if participant should be muted.") @RequestParam(value="Muted", required=false)  Boolean muted,@ApiParam(value = "Specifies if the participant should hear audio in the conference.") @RequestParam(value="Deaf", required=false)  Boolean deaf) {
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

    public ResponseEntity<String> conferencesCreateConference(@ApiParam(value = "A valid 10-digit number (E.164 format) that will be initiating the conference call.", required=true) @RequestParam(value="From", required=true)  String from,@ApiParam(value = "A valid 10-digit number (E.164 format) that is to receive the conference call.", required=true) @RequestParam(value="To", required=true)  String to,@NotNull @ApiParam(value = "URL requested once the conference connects", required = true) @Valid @RequestParam(value = "Url", required = true) String url,@ApiParam(value = "Specifies the HTTP method used to request the required URL once call connects.", defaultValue="POST") @RequestParam(value="Method", required=false)  String method,@ApiParam(value = "URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished.") @RequestParam(value="StatusCallBackUrl", required=false)  String statusCallBackUrl,@ApiParam(value = "Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.") @RequestParam(value="StatusCallBackMethod", required=false)  String statusCallBackMethod,@ApiParam(value = "URL requested if the initial Url parameter fails or encounters an error") @RequestParam(value="FallbackUrl", required=false)  String fallbackUrl,@ApiParam(value = "Specifies the HTTP method used to request the required FallbackUrl once call connects.") @RequestParam(value="FallbackMethod", required=false)  String fallbackMethod,@ApiParam(value = "Specifies if the conference should be recorded.") @RequestParam(value="Record", required=false)  Boolean record,@ApiParam(value = "Recording parameters will be sent here upon completion.") @RequestParam(value="RecordCallBackUrl", required=false)  String recordCallBackUrl,@ApiParam(value = "Specifies the HTTP method used to request the required URL once conference connects.") @RequestParam(value="RecordCallBackMethod", required=false)  String recordCallBackMethod,@ApiParam(value = "Schedule conference in future. Schedule time must be greater than current time") @RequestParam(value="ScheduleTime", required=false)  String scheduleTime,@ApiParam(value = "The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set.") @RequestParam(value="Timeout", required=false)  Integer timeout) {
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

    public ResponseEntity<String> conferencesDeafMuteParticipant(@ApiParam(value = "ID of the active conference", required=true) @RequestParam(value="conferenceSid", required=true)  String conferenceSid,@ApiParam(value = "ID of an active participant", required=true) @RequestParam(value="ParticipantSid", required=true)  String participantSid,@ApiParam(value = "Mute a participant") @RequestParam(value="Muted", required=false)  Boolean muted,@ApiParam(value = "Make it so a participant cant hear") @RequestParam(value="Deaf", required=false)  Boolean deaf) {
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

    public ResponseEntity<String> conferencesHangupParticipant(@ApiParam(value = "The unique identifier for a conference object.", required=true) @RequestParam(value="ConferenceSid", required=true)  String conferenceSid,@NotNull @ApiParam(value = "The unique identifier for a participant object.", required = true) @Valid @RequestParam(value = "ParticipantSid", required = true) String participantSid) {
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

    public ResponseEntity<String> conferencesListParticipant(@ApiParam(value = "The unique identifier for a conference.", required=true) @RequestParam(value="ConferenceSid", required=true)  String conferenceSid,@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestParam(value="Page", required=false)  Integer page,@ApiParam(value = "The count of objects to return per page.", defaultValue="10") @RequestParam(value="Pagesize", required=false)  Integer pagesize,@ApiParam(value = "Specifies if participant should be muted.") @RequestParam(value="Muted", required=false)  Boolean muted,@ApiParam(value = "Specifies if the participant should hear audio in the conference.") @RequestParam(value="Deaf", required=false)  Boolean deaf) {
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

    public ResponseEntity<String> conferencesListconference(@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestParam(value="page", required=false)  Integer page,@ApiParam(value = "Number of individual resources listed in the response per page", defaultValue="10") @RequestParam(value="pagesize", required=false)  Integer pagesize,@ApiParam(value = "Only return conferences with the specified FriendlyName") @RequestParam(value="FriendlyName", required=false)  String friendlyName,@ApiParam(value = "Conference created date") @RequestParam(value="DateCreated", required=false)  String dateCreated) {
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

    public ResponseEntity<String> conferencesPlayAudio(@ApiParam(value = "The unique identifier for a conference object.", required=true) @RequestParam(value="ConferenceSid", required=true)  String conferenceSid,@ApiParam(value = "The unique identifier for a participant object.", required=true) @RequestParam(value="ParticipantSid", required=true)  String participantSid,@ApiParam(value = "The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon.", required=true, allowableValues="mp3, wav") @RequestParam(value="AudioUrl", required=true)  String audioUrl) {
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

    public ResponseEntity<String> conferencesViewParticipant(@ApiParam(value = "The unique identifier for a conference object.", required=true) @RequestParam(value="ConferenceSid", required=true)  String conferenceSid,@ApiParam(value = "The unique identifier for a participant object.", required=true) @RequestParam(value="ParticipantSid", required=true)  String participantSid) {
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

    public ResponseEntity<String> conferencesViewconference(@ApiParam(value = "The unique identifier of each conference resource", required=true) @RequestParam(value="ConferenceSid", required=true)  String conferenceSid) {
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
