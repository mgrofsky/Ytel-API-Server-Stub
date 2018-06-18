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
public class IncomingphoneApiController implements IncomingphoneApi {

    private static final Logger log = LoggerFactory.getLogger(IncomingphoneApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public IncomingphoneApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> incomingphoneAvailablenumber(@ApiParam(value = "Number type either SMS,Voice or all", required=true, allowableValues="all, voice, sms") @RequestPart(value="numbertype", required=true)  String numbertype,@ApiParam(value = "Specifies the area code for the returned list of available numbers. Only available for North American numbers.", required=true) @RequestPart(value="areacode", required=true)  String areacode,@ApiParam(value = "The count of objects to return.", defaultValue="10") @RequestPart(value="pagesize", required=false)  Integer pagesize) {
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

    public ResponseEntity<String> incomingphoneBulkbuy(@ApiParam(value = "The capability the number supports.", required=true, allowableValues="all, voice, sms") @RequestPart(value="NumberType", required=true)  String numberType,@ApiParam(value = "Specifies the area code for the returned list of available numbers. Only available for North American numbers.", required=true) @RequestPart(value="AreaCode", required=true)  String areaCode,@ApiParam(value = "A positive integer that tells how many number you want to buy at a time.", required=true) @RequestPart(value="Quantity", required=true)  String quantity,@ApiParam(value = "If desired quantity is unavailable purchase what is available .") @RequestPart(value="Leftover", required=false)  String leftover) {
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

    public ResponseEntity<String> incomingphoneBuynumber(@ApiParam(value = "A valid 10-digit Ytel number (E.164 format).", required=true) @RequestPart(value="PhoneNumber", required=true)  String phoneNumber) {
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

    public ResponseEntity<String> incomingphoneGetdidscore(@ApiParam(value = "Specifies the multiple phone numbers for check updated spamscore .", required=true) @RequestPart(value="Phonenumber", required=true)  String phonenumber) {
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

    public ResponseEntity<String> incomingphoneListnumber(@ApiParam(value = "Which page of the overall response will be returned. Page indexing starts at 1.", defaultValue="1") @RequestPart(value="Page", required=false)  Integer page,@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="10") @RequestPart(value="PageSize", required=false)  Integer pageSize,@ApiParam(value = "The capability supported by the number.Number type either SMS,Voice or all", allowableValues="all, voice, sms") @RequestPart(value="NumberType", required=false)  String numberType,@ApiParam(value = "A human-readable label added to the number object.") @RequestPart(value="FriendlyName", required=false)  String friendlyName) {
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

    public ResponseEntity<String> incomingphoneMassreleasenumber(@ApiParam(value = "A valid Ytel comma separated numbers (E.164 format).", required=true) @RequestPart(value="PhoneNumber", required=true)  String phoneNumber) {
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

    public ResponseEntity<String> incomingphoneMassupdatenumber(@ApiParam(value = "A valid comma(,) separated Ytel numbers. (E.164 format).", required=true) @RequestPart(value="PhoneNumber", required=true)  String phoneNumber,@ApiParam(value = "The URL returning InboundXML incoming calls should execute when connected.", required=true) @RequestPart(value="VoiceUrl", required=true)  String voiceUrl,@ApiParam(value = "A human-readable value for labeling the number.") @RequestPart(value="FriendlyName", required=false)  String friendlyName,@ApiParam(value = "Specifies the HTTP method used to request the VoiceUrl once incoming call connects.") @RequestPart(value="VoiceMethod", required=false)  String voiceMethod,@ApiParam(value = "URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url") @RequestPart(value="VoiceFallbackUrl", required=false)  String voiceFallbackUrl,@ApiParam(value = "Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects.") @RequestPart(value="VoiceFallbackMethod", required=false)  String voiceFallbackMethod,@ApiParam(value = "URL that can be requested to receive notification when and how incoming call has ended.") @RequestPart(value="HangupCallback", required=false)  String hangupCallback,@ApiParam(value = "The HTTP method Ytel will use when requesting the HangupCallback URL.") @RequestPart(value="HangupCallbackMethod", required=false)  String hangupCallbackMethod,@ApiParam(value = "URL that can be used to monitor the phone number.") @RequestPart(value="HeartbeatUrl", required=false)  String heartbeatUrl,@ApiParam(value = "The HTTP method Ytel will use when requesting the HeartbeatUrl.") @RequestPart(value="HeartbeatMethod", required=false)  String heartbeatMethod,@ApiParam(value = "URL requested when an SMS is received.") @RequestPart(value="SmsUrl", required=false)  String smsUrl,@ApiParam(value = "The HTTP method Ytel will use when requesting the SmsUrl.") @RequestPart(value="SmsMethod", required=false)  String smsMethod,@ApiParam(value = "URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.") @RequestPart(value="SmsFallbackUrl", required=false)  String smsFallbackUrl,@ApiParam(value = "The HTTP method Ytel will use when URL requested if the SmsUrl is not available.") @RequestPart(value="SmsFallbackMethod", required=false)  String smsFallbackMethod) {
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

    public ResponseEntity<String> incomingphoneReleasenumberByResponseTypePost(@ApiParam(value = "A valid 10-digit Ytel number (E.164 format).", required=true) @RequestPart(value="PhoneNumber", required=true)  String phoneNumber,@ApiParam(value = "Response type format xml or json",required=true) @PathVariable("ResponseType") String responseType) {
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

    public ResponseEntity<String> incomingphoneTransferphonenumbers(@ApiParam(value = "A valid 10-digit Ytel number (E.164 format).", required=true) @RequestPart(value="phonenumber", required=true)  String phonenumber,@ApiParam(value = "A specific Accountsid from where Number is getting transfer.", required=true) @RequestPart(value="fromaccountsid", required=true)  String fromaccountsid,@ApiParam(value = "A specific Accountsid to which Number is getting transfer.", required=true) @RequestPart(value="toaccountsid", required=true)  String toaccountsid) {
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

    public ResponseEntity<String> incomingphoneUpdatenumber(@ApiParam(value = "A valid Ytel number (E.164 format).", required=true) @RequestPart(value="PhoneNumber", required=true)  String phoneNumber,@ApiParam(value = "URL requested once the call connects", required=true) @RequestPart(value="VoiceUrl", required=true)  String voiceUrl,@ApiParam(value = "Phone number friendly name description") @RequestPart(value="FriendlyName", required=false)  String friendlyName,@ApiParam(value = "Post or Get") @RequestPart(value="VoiceMethod", required=false)  String voiceMethod,@ApiParam(value = "URL requested if the voice URL is not available") @RequestPart(value="VoiceFallbackUrl", required=false)  String voiceFallbackUrl,@ApiParam(value = "Post or Get") @RequestPart(value="VoiceFallbackMethod", required=false)  String voiceFallbackMethod,@ApiParam(value = "callback url after a hangup occurs") @RequestPart(value="HangupCallback", required=false)  String hangupCallback,@ApiParam(value = "Post or Get") @RequestPart(value="HangupCallbackMethod", required=false)  String hangupCallbackMethod,@ApiParam(value = "URL requested once the call connects") @RequestPart(value="HeartbeatUrl", required=false)  String heartbeatUrl,@ApiParam(value = "URL that can be requested every 60 seconds during the call to notify of elapsed time") @RequestPart(value="HeartbeatMethod", required=false)  String heartbeatMethod,@ApiParam(value = "URL requested when an SMS is received") @RequestPart(value="SmsUrl", required=false)  String smsUrl,@ApiParam(value = "Post or Get") @RequestPart(value="SmsMethod", required=false)  String smsMethod,@ApiParam(value = "URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.") @RequestPart(value="SmsFallbackUrl", required=false)  String smsFallbackUrl,@ApiParam(value = "The HTTP method Ytel will use when URL requested if the SmsUrl is not available.") @RequestPart(value="SmsFallbackMethod", required=false)  String smsFallbackMethod) {
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

    public ResponseEntity<String> incomingphoneViewnumber(@ApiParam(value = "A valid Ytel 10-digit phone number (E.164 format).", required=true) @RequestPart(value="PhoneNumber", required=true)  String phoneNumber) {
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
