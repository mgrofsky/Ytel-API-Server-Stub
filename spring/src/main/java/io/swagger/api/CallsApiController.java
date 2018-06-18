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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T20:13:28.172Z")

@Controller
public class CallsApiController implements CallsApi {

    private static final Logger log = LoggerFactory.getLogger(CallsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CallsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> callsGroupcall(@ApiParam(value = "This number to display on Caller ID as calling", required=true) @RequestPart(value="From", required=true)  String from,@ApiParam(value = "Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222", required=true) @RequestPart(value="To", required=true)  String to,@ApiParam(value = "URL requested once the call connects", required=true) @RequestPart(value="Url", required=true)  String url,@ApiParam(value = "Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, *", required=true) @RequestPart(value="GroupConfirmKey", required=true)  String groupConfirmKey,@ApiParam(value = "Specify the audio file you want to play when the called party picks up the call", required=true, allowableValues="mp3, wav") @RequestPart(value="GroupConfirmFile", required=true)  String groupConfirmFile,@ApiParam(value = "Specifies the HTTP method used to request the required URL once call connects.") @RequestPart(value="Method", required=false)  String method,@ApiParam(value = "URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.") @RequestPart(value="StatusCallBackUrl", required=false)  String statusCallBackUrl,@ApiParam(value = "Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.") @RequestPart(value="StatusCallBackMethod", required=false)  String statusCallBackMethod,@ApiParam(value = "URL requested if the initial Url parameter fails or encounters an error") @RequestPart(value="FallBackUrl", required=false)  String fallBackUrl,@ApiParam(value = "Specifies the HTTP method used to request the required FallbackUrl once call connects.") @RequestPart(value="FallBackMethod", required=false)  String fallBackMethod,@ApiParam(value = "URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information.") @RequestPart(value="HeartBeatUrl", required=false)  String heartBeatUrl,@ApiParam(value = "Specifies the HTTP method used to request HeartbeatUrl.") @RequestPart(value="HeartBeatMethod", required=false)  String heartBeatMethod,@ApiParam(value = "Time (in seconds) we should wait while the call is ringing before canceling the call") @RequestPart(value="Timeout", required=false)  Integer timeout,@ApiParam(value = "DTMF Digits to play to the call once it connects. 0-9, #, or *") @RequestPart(value="PlayDtmf", required=false)  String playDtmf,@ApiParam(value = "Specifies if the caller id will be hidden") @RequestPart(value="HideCallerId", required=false)  String hideCallerId,@ApiParam(value = "Specifies if the call should be recorded") @RequestPart(value="Record", required=false)  Boolean record,@ApiParam(value = "Recording parameters will be sent here upon completion") @RequestPart(value="RecordCallBackUrl", required=false)  String recordCallBackUrl,@ApiParam(value = "Method used to request the RecordCallback URL.") @RequestPart(value="RecordCallBackMethod", required=false)  String recordCallBackMethod,@ApiParam(value = "Specifies if the call recording should be transcribed") @RequestPart(value="Transcribe", required=false)  Boolean transcribe,@ApiParam(value = "Transcription parameters will be sent here upon completion") @RequestPart(value="TranscribeCallBackUrl", required=false)  String transcribeCallBackUrl) {
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

    public ResponseEntity<String> callsInterruptcalls(@ApiParam(value = "The unique identifier for voice call that is in progress.", required=true) @RequestPart(value="CallSid", required=true)  String callSid,@ApiParam(value = "URL the in-progress call will be redirected to") @RequestPart(value="Url", required=false)  String url,@ApiParam(value = "The method used to request the above Url parameter") @RequestPart(value="Method", required=false)  String method,@ApiParam(value = "Status to set the in-progress call to", allowableValues="canceled, completed") @RequestPart(value="Status", required=false)  String status) {
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

    public ResponseEntity<String> callsListcalls(@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestPart(value="Page", required=false)  Integer page,@ApiParam(value = "Number of individual resources listed in the response per page", defaultValue="10") @RequestPart(value="PageSize", required=false)  Integer pageSize,@ApiParam(value = "Filter calls that were sent to this 10-digit number (E.164 format).") @RequestPart(value="To", required=false)  String to,@ApiParam(value = "Filter calls that were sent from this 10-digit number (E.164 format).") @RequestPart(value="From", required=false)  String from,@ApiParam(value = "Return calls that are from a specified date.") @RequestPart(value="DateCreated", required=false)  String dateCreated) {
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

    public ResponseEntity<String> callsMakecall(@ApiParam(value = "A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.", required=true) @RequestPart(value="From", required=true)  String from,@ApiParam(value = "To number", required=true) @RequestPart(value="To", required=true)  String to,@ApiParam(value = "URL requested once the call connects", required=true) @RequestPart(value="Url", required=true)  String url,@ApiParam(value = "Specifies the HTTP method used to request the required URL once call connects.") @RequestPart(value="Method", required=false)  String method,@ApiParam(value = "URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.") @RequestPart(value="StatusCallBackUrl", required=false)  String statusCallBackUrl,@ApiParam(value = "Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.") @RequestPart(value="StatusCallBackMethod", required=false)  String statusCallBackMethod,@ApiParam(value = "URL requested if the initial Url parameter fails or encounters an error") @RequestPart(value="FallBackUrl", required=false)  String fallBackUrl,@ApiParam(value = "Specifies the HTTP method used to request the required FallbackUrl once call connects.") @RequestPart(value="FallBackMethod", required=false)  String fallBackMethod,@ApiParam(value = "URL that can be requested every 60 seconds during the call to notify of elapsed tim") @RequestPart(value="HeartBeatUrl", required=false)  String heartBeatUrl,@ApiParam(value = "Specifies the HTTP method used to request HeartbeatUrl.") @RequestPart(value="HeartBeatMethod", required=false)  String heartBeatMethod,@ApiParam(value = "Time (in seconds) Ytel should wait while the call is ringing before canceling the call") @RequestPart(value="Timeout", required=false)  Integer timeout,@ApiParam(value = "DTMF Digits to play to the call once it connects. 0-9, #, or *") @RequestPart(value="PlayDtmf", required=false)  String playDtmf,@ApiParam(value = "Specifies if the caller id will be hidden") @RequestPart(value="HideCallerId", required=false)  Boolean hideCallerId,@ApiParam(value = "Specifies if the call should be recorded") @RequestPart(value="Record", required=false)  Boolean record,@ApiParam(value = "Recording parameters will be sent here upon completion") @RequestPart(value="RecordCallBackUrl", required=false)  String recordCallBackUrl,@ApiParam(value = "Method used to request the RecordCallback URL.") @RequestPart(value="RecordCallBackMethod", required=false)  String recordCallBackMethod,@ApiParam(value = "Specifies if the call recording should be transcribed") @RequestPart(value="Transcribe", required=false)  Boolean transcribe,@ApiParam(value = "Transcription parameters will be sent here upon completion") @RequestPart(value="TranscribeCallBackUrl", required=false)  String transcribeCallBackUrl,@ApiParam(value = "How Ytel should handle the receiving numbers voicemail machine", allowableValues="continue, hangup") @RequestPart(value="IfMachine", required=false)  String ifMachine,@ApiParam(value = "URL requested when IfMachine=continue") @RequestPart(value="IfMachineUrl", required=false)  String ifMachineUrl,@ApiParam(value = "Method used to request the IfMachineUrl.") @RequestPart(value="IfMachineMethod", required=false)  String ifMachineMethod,@ApiParam(value = "Specify if survey should be enable or not") @RequestPart(value="Feedback", required=false)  Boolean feedback,@ApiParam(value = "The unique identifier for the survey.") @RequestPart(value="SurveyId", required=false)  String surveyId) {
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

    public ResponseEntity<String> callsMakervm(@ApiParam(value = "A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.", required=true) @RequestPart(value="From", required=true)  String from,@ApiParam(value = "A required secondary Caller ID for RVM to work.", required=true) @RequestPart(value="RVMCallerId", required=true)  String rvMCallerId,@ApiParam(value = "A valid number (E.164 format) that will receive the phone call.", required=true) @RequestPart(value="To", required=true)  String to,@ApiParam(value = "The URL requested once the RVM connects. A set of default parameters will be sent here.", required=true) @RequestPart(value="VoiceMailURL", required=true)  String voiceMailURL,@ApiParam(value = "Specifies the HTTP method used to request the required URL once call connects.", defaultValue="GET") @RequestPart(value="Method", required=false)  String method,@ApiParam(value = "URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.") @RequestPart(value="StatusCallBackUrl", required=false)  String statusCallBackUrl,@ApiParam(value = "Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.") @RequestPart(value="StatsCallBackMethod", required=false)  String statsCallBackMethod) {
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

    public ResponseEntity<String> callsPlayaudios(@ApiParam(value = "The unique identifier of each call resource", required=true) @RequestPart(value="CallSid", required=true)  String callSid,@ApiParam(value = "URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav", required=true) @RequestPart(value="AudioUrl", required=true)  String audioUrl,@ApiParam(value = "Valid alphanumeric string that should be played to the In-progress call.", required=true) @RequestPart(value="SayText", required=true)  String sayText,@ApiParam(value = "Time limit in seconds for audio play back") @RequestPart(value="Length", required=false)  Integer length,@ApiParam(value = "The leg of the call audio will be played to", allowableValues="in, out, both") @RequestPart(value="Direction", required=false)  String direction,@ApiParam(value = "If false, all other audio will be muted") @RequestPart(value="Mix", required=false)  Boolean mix) {
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

    public ResponseEntity<String> callsRecordcalls(@ApiParam(value = "The unique identifier of each call resource", required=true) @RequestPart(value="CallSid", required=true)  String callSid,@ApiParam(value = "Set true to initiate recording or false to terminate recording", required=true) @RequestPart(value="Record", required=true)  Boolean record,@ApiParam(value = "The leg of the call to record", allowableValues="in, out, both") @RequestPart(value="Direction", required=false)  String direction,@ApiParam(value = "Time in seconds the recording duration should not exceed") @RequestPart(value="TimeLimit", required=false)  Integer timeLimit,@ApiParam(value = "URL consulted after the recording completes") @RequestPart(value="CallBackUrl", required=false)  String callBackUrl,@ApiParam(value = "Format of the recording file. Can be .mp3 or .wav", allowableValues="mp3, wav") @RequestPart(value="Fileformat", required=false)  String fileformat) {
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

    public ResponseEntity<String> callsSenddigits(@ApiParam(value = "The unique identifier of each call resource", required=true) @RequestPart(value="CallSid", required=true)  String callSid,@ApiParam(value = "DTMF digits to play to the call. 0-9, #, *, W, or w", required=true) @RequestPart(value="PlayDtmf", required=true)  String playDtmf,@ApiParam(value = "The leg of the call DTMF digits should be sent to", allowableValues="in, out, both") @RequestPart(value="PlayDtmfDirection", required=false)  String playDtmfDirection) {
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

    public ResponseEntity<String> callsViewcalldetail(@ApiParam(value = "The unique identifier for the voice call.", required=true) @RequestPart(value="callSid", required=true)  String callSid) {
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

    public ResponseEntity<String> callsViewcalls(@ApiParam(value = "The unique identifier for the voice call.", required=true) @RequestPart(value="callsid", required=true)  String callsid) {
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

    public ResponseEntity<String> callsVoiceeffect(@ApiParam(value = "The unique identifier for the in-progress voice call.", required=true) @RequestPart(value="CallSid", required=true)  String callSid,@ApiParam(value = "The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream.", allowableValues="in, out") @RequestPart(value="AudioDirection", required=false)  String audioDirection,@ApiParam(value = "Set the pitch in semitone (half-step) intervals. Value between -14 and 14") @RequestPart(value="PitchSemiTones", required=false)  Double pitchSemiTones,@ApiParam(value = "Set the pitch in octave intervals.. Value between -1 and 1") @RequestPart(value="PitchOctaves", required=false)  Double pitchOctaves,@ApiParam(value = "Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0") @RequestPart(value="Pitch", required=false)  Double pitch,@ApiParam(value = "Set the rate for audio. The lower the value, the lower the rate. value greater than 0") @RequestPart(value="Rate", required=false)  Double rate,@ApiParam(value = "Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0") @RequestPart(value="Tempo", required=false)  Double tempo) {
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
