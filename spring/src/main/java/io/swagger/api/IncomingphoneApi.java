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

@Api(value = "incomingphone", description = "the incomingphone API")
public interface IncomingphoneApi {

    @ApiOperation(value = "Available Numbers", nickname = "incomingphoneAvailablenumber", notes = "Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Phone Number", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/incomingphone/availablenumber.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> incomingphoneAvailablenumber(@ApiParam(value = "Number type either SMS,Voice or all", required=true, allowableValues="all, voice, sms") @RequestParam(value="numbertype", required=true)  String numbertype,@ApiParam(value = "Specifies the area code for the returned list of available numbers. Only available for North American numbers.", required=true) @RequestParam(value="areacode", required=true)  String areacode,@ApiParam(value = "The count of objects to return.", defaultValue="10") @RequestParam(value="pagesize", required=false)  Integer pagesize);


    @ApiOperation(value = "Bulk Buy Numbers", nickname = "incomingphoneBulkbuy", notes = "Purchase a selected number of DID's from specific area codes to be used with your Ytel account.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Phone Number", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/incomingphone/bulkbuy.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> incomingphoneBulkbuy(@ApiParam(value = "The capability the number supports.", required=true, allowableValues="all, voice, sms") @RequestParam(value="NumberType", required=true)  String numberType,@ApiParam(value = "Specifies the area code for the returned list of available numbers. Only available for North American numbers.", required=true) @RequestParam(value="AreaCode", required=true)  String areaCode,@ApiParam(value = "A positive integer that tells how many number you want to buy at a time.", required=true) @RequestParam(value="Quantity", required=true)  String quantity,@ApiParam(value = "If desired quantity is unavailable purchase what is available .") @RequestParam(value="Leftover", required=false)  String leftover);


    @ApiOperation(value = "Purchase Number", nickname = "incomingphoneBuynumber", notes = "Purchase a phone number to be used with your Ytel account", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Phone Number", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/incomingphone/buynumber.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> incomingphoneBuynumber(@ApiParam(value = "A valid 10-digit Ytel number (E.164 format).", required=true) @RequestParam(value="PhoneNumber", required=true)  String phoneNumber);


    @ApiOperation(value = "Get DID Score", nickname = "incomingphoneGetdidscore", notes = "Get DID Score Number", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Phone Number", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/incomingphone/getdidscore.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> incomingphoneGetdidscore(@ApiParam(value = "Specifies the multiple phone numbers for check updated spamscore .", required=true) @RequestParam(value="Phonenumber", required=true)  String phonenumber);


    @ApiOperation(value = "List Numbers", nickname = "incomingphoneListnumber", notes = "Retrieve a list of purchased phones numbers associated with your Ytel account.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Phone Number", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/incomingphone/listnumber.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> incomingphoneListnumber(@ApiParam(value = "Which page of the overall response will be returned. Page indexing starts at 1.", defaultValue="1") @RequestParam(value="Page", required=false)  Integer page,@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="10") @RequestParam(value="PageSize", required=false)  Integer pageSize,@ApiParam(value = "The capability supported by the number.Number type either SMS,Voice or all", allowableValues="all, voice, sms") @RequestParam(value="NumberType", required=false)  String numberType,@ApiParam(value = "A human-readable label added to the number object.") @RequestParam(value="FriendlyName", required=false)  String friendlyName);


    @ApiOperation(value = "Bulk Release", nickname = "incomingphoneMassreleasenumber", notes = "Remove a purchased Ytel number from your account.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Phone Number", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/incomingphone/massreleasenumber.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> incomingphoneMassreleasenumber(@ApiParam(value = "A valid Ytel comma separated numbers (E.164 format).", required=true) @RequestParam(value="PhoneNumber", required=true)  String phoneNumber);


    @ApiOperation(value = "Bulk Update Numbers", nickname = "incomingphoneMassupdatenumber", notes = "Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Phone Number", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/incomingphone/massupdatenumber.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> incomingphoneMassupdatenumber(@ApiParam(value = "A valid comma(,) separated Ytel numbers. (E.164 format).", required=true) @RequestParam(value="PhoneNumber", required=true)  String phoneNumber,@ApiParam(value = "The URL returning InboundXML incoming calls should execute when connected.", required=true) @RequestParam(value="VoiceUrl", required=true)  String voiceUrl,@ApiParam(value = "A human-readable value for labeling the number.") @RequestParam(value="FriendlyName", required=false)  String friendlyName,@ApiParam(value = "Specifies the HTTP method used to request the VoiceUrl once incoming call connects.") @RequestParam(value="VoiceMethod", required=false)  String voiceMethod,@ApiParam(value = "URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url") @RequestParam(value="VoiceFallbackUrl", required=false)  String voiceFallbackUrl,@ApiParam(value = "Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects.") @RequestParam(value="VoiceFallbackMethod", required=false)  String voiceFallbackMethod,@ApiParam(value = "URL that can be requested to receive notification when and how incoming call has ended.") @RequestParam(value="HangupCallback", required=false)  String hangupCallback,@ApiParam(value = "The HTTP method Ytel will use when requesting the HangupCallback URL.") @RequestParam(value="HangupCallbackMethod", required=false)  String hangupCallbackMethod,@ApiParam(value = "URL that can be used to monitor the phone number.") @RequestParam(value="HeartbeatUrl", required=false)  String heartbeatUrl,@ApiParam(value = "The HTTP method Ytel will use when requesting the HeartbeatUrl.") @RequestParam(value="HeartbeatMethod", required=false)  String heartbeatMethod,@ApiParam(value = "URL requested when an SMS is received.") @RequestParam(value="SmsUrl", required=false)  String smsUrl,@ApiParam(value = "The HTTP method Ytel will use when requesting the SmsUrl.") @RequestParam(value="SmsMethod", required=false)  String smsMethod,@ApiParam(value = "URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.") @RequestParam(value="SmsFallbackUrl", required=false)  String smsFallbackUrl,@ApiParam(value = "The HTTP method Ytel will use when URL requested if the SmsUrl is not available.") @RequestParam(value="SmsFallbackMethod", required=false)  String smsFallbackMethod);


    @ApiOperation(value = "Release Number", nickname = "incomingphoneReleasenumberByResponseTypePost", notes = "Remove a purchased Ytel number from your account.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Phone Number", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/incomingphone/releasenumber.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> incomingphoneReleasenumberByResponseTypePost(@ApiParam(value = "A valid 10-digit Ytel number (E.164 format).", required=true) @RequestParam(value="PhoneNumber", required=true)  String phoneNumber);


    @ApiOperation(value = "Move Number", nickname = "incomingphoneTransferphonenumbers", notes = "Transfer phone number that has been purchased for from one account to another account.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Phone Number", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/incomingphone/transferphonenumbers.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> incomingphoneTransferphonenumbers(@ApiParam(value = "A valid 10-digit Ytel number (E.164 format).", required=true) @RequestParam(value="phonenumber", required=true)  String phonenumber,@ApiParam(value = "A specific Accountsid from where Number is getting transfer.", required=true) @RequestParam(value="fromaccountsid", required=true)  String fromaccountsid,@ApiParam(value = "A specific Accountsid to which Number is getting transfer.", required=true) @RequestParam(value="toaccountsid", required=true)  String toaccountsid);


    @ApiOperation(value = "Update Number", nickname = "incomingphoneUpdatenumber", notes = "Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Phone Number", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/incomingphone/updatenumber.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> incomingphoneUpdatenumber(@ApiParam(value = "A valid Ytel number (E.164 format).", required=true) @RequestParam(value="PhoneNumber", required=true)  String phoneNumber,@ApiParam(value = "URL requested once the call connects", required=true) @RequestParam(value="VoiceUrl", required=true)  String voiceUrl,@ApiParam(value = "Phone number friendly name description") @RequestParam(value="FriendlyName", required=false)  String friendlyName,@ApiParam(value = "Post or Get") @RequestParam(value="VoiceMethod", required=false)  String voiceMethod,@ApiParam(value = "URL requested if the voice URL is not available") @RequestParam(value="VoiceFallbackUrl", required=false)  String voiceFallbackUrl,@ApiParam(value = "Post or Get") @RequestParam(value="VoiceFallbackMethod", required=false)  String voiceFallbackMethod,@ApiParam(value = "callback url after a hangup occurs") @RequestParam(value="HangupCallback", required=false)  String hangupCallback,@ApiParam(value = "Post or Get") @RequestParam(value="HangupCallbackMethod", required=false)  String hangupCallbackMethod,@ApiParam(value = "URL requested once the call connects") @RequestParam(value="HeartbeatUrl", required=false)  String heartbeatUrl,@ApiParam(value = "URL that can be requested every 60 seconds during the call to notify of elapsed time") @RequestParam(value="HeartbeatMethod", required=false)  String heartbeatMethod,@ApiParam(value = "URL requested when an SMS is received") @RequestParam(value="SmsUrl", required=false)  String smsUrl,@ApiParam(value = "Post or Get") @RequestParam(value="SmsMethod", required=false)  String smsMethod,@ApiParam(value = "URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.") @RequestParam(value="SmsFallbackUrl", required=false)  String smsFallbackUrl,@ApiParam(value = "The HTTP method Ytel will use when URL requested if the SmsUrl is not available.") @RequestParam(value="SmsFallbackMethod", required=false)  String smsFallbackMethod);


    @ApiOperation(value = "View Details", nickname = "incomingphoneViewnumber", notes = "Retrieve the details for a phone number by its number.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Phone Number", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/incomingphone/viewnumber.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> incomingphoneViewnumber(@ApiParam(value = "A valid Ytel 10-digit phone number (E.164 format).", required=true) @RequestParam(value="PhoneNumber", required=true)  String phoneNumber);

}
