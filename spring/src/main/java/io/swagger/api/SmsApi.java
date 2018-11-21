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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-21T18:17:51.171Z")

@Api(value = "sms", description = "the sms API")
public interface SmsApi {

    @ApiOperation(value = "List Inbound SMS", nickname = "smsGetinboundsms", notes = "Retrieve a list of Inbound SMS message objects.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "SMS", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/sms/getinboundsms.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> smsGetinboundsms(@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestParam(value="Page", required=false)  Integer page,@ApiParam(value = "The count of objects to return per page.", defaultValue="10") @RequestParam(value="PageSize", required=false)  Integer pageSize,@ApiParam(value = "Filter SMS message objects from this valid 10-digit phone number (E.164 format).") @RequestParam(value="From", required=false)  String from,@ApiParam(value = "Filter SMS message objects to this valid 10-digit phone number (E.164 format).") @RequestParam(value="To", required=false)  String to,@ApiParam(value = "Filter sms message objects by this date.") @RequestParam(value="DateSent", required=false)  String dateSent);


    @ApiOperation(value = "List SMS", nickname = "smsListsms", notes = "Retrieve a list of Outbound SMS message objects.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "SMS", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/sms/listsms.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> smsListsms(@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestParam(value="Page", required=false)  Integer page,@ApiParam(value = "Number of individual resources listed in the response per page", defaultValue="10") @RequestParam(value="PageSize", required=false)  Integer pageSize,@ApiParam(value = "Filter SMS message objects from this valid 10-digit phone number (E.164 format).") @RequestParam(value="From", required=false)  String from,@ApiParam(value = "Filter SMS message objects to this valid 10-digit phone number (E.164 format).") @RequestParam(value="To", required=false)  String to,@ApiParam(value = "Only list SMS messages sent in the specified date range") @RequestParam(value="DateSent", required=false)  String dateSent);


    @ApiOperation(value = "Send SMS", nickname = "smsSendsms", notes = "Send an SMS from a Ytel number", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "SMS", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/sms/sendsms.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> smsSendsms(@ApiParam(value = "The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent.", required=true) @RequestParam(value="From", required=true)  String from,@ApiParam(value = "The 10-digit phone number (E.164 format) that will receive the message.", required=true) @RequestParam(value="To", required=true)  String to,@ApiParam(value = "The body message that is to be sent in the text.", required=true) @RequestParam(value="Body", required=true)  String body,@ApiParam(value = "Specifies the HTTP method used to request the required URL once SMS sent.") @RequestParam(value="Method", required=false)  String method,@ApiParam(value = "URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.") @RequestParam(value="MessageStatusCallback", required=false)  String messageStatusCallback,@ApiParam(value = "Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message.", defaultValue="false") @RequestParam(value="Smartsms", required=false)  Boolean smartsms,@ApiParam(value = "Delivery reports are a method to tell your system if the message has arrived on the destination phone.", defaultValue="false") @RequestParam(value="DeliveryStatus", required=false)  Boolean deliveryStatus);


    @ApiOperation(value = "View SMS", nickname = "smsViewdetailsms", notes = "Retrieve a single SMS message object with details by its SmsSid.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "SMS", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/sms/viewdetailsms.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> smsViewdetailsms(@ApiParam(value = "The unique identifier for a sms message.", required=true) @RequestParam(value="MessageSid", required=true)  String messageSid);


    @ApiOperation(value = "View SMS", nickname = "smsViewsms", notes = "Retrieve a single SMS message object by its SmsSid.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "SMS", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/sms/viewsms.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> smsViewsms(@ApiParam(value = "The unique identifier for a sms message.", required=true) @RequestParam(value="MessageSid", required=true)  String messageSid);

}
