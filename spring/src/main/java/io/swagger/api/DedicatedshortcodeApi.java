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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-25T17:53:17.796Z")

@Api(value = "dedicatedshortcode", description = "the dedicatedshortcode API")
public interface DedicatedshortcodeApi {

    @ApiOperation(value = "List Inbound SMS", nickname = "dedicatedshortcodeGetinboundsms", notes = "Retrive a list of inbound Sms Short Code messages associated with your Ytel account.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "ShortCode", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/dedicatedshortcode/getinboundsms.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> dedicatedshortcodeGetinboundsms(@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestParam(value="page", required=false)  Integer page,@ApiParam(value = "Number of individual resources listed in the response per page", defaultValue="10") @RequestParam(value="pagesize", required=false)  Integer pagesize,@ApiParam(value = "Only list SMS messages sent from this number") @RequestParam(value="From", required=false)  String from,@ApiParam(value = "Only list SMS messages sent to Shortcode") @RequestParam(value="Shortcode", required=false)  String shortcode,@ApiParam(value = "Only list SMS messages sent in the specified date MAKE REQUEST") @RequestParam(value="Datecreated", required=false)  String datecreated);


    @ApiOperation(value = "List Shortcodes", nickname = "dedicatedshortcodeListshortcode", notes = "Retrieve a list of Short Code assignment associated with your Ytel account.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "ShortCode", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/dedicatedshortcode/listshortcode.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> dedicatedshortcodeListshortcode(@ApiParam(value = "Only list Short Code Assignment sent from this Short Code") @RequestParam(value="Shortcode", required=false)  String shortcode,@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.") @RequestParam(value="page", required=false)  String page,@ApiParam(value = "The count of objects to return per page.") @RequestParam(value="pagesize", required=false)  String pagesize);


    @ApiOperation(value = "Send SMS", nickname = "dedicatedshortcodeSendsms", notes = "Send Dedicated Shortcode", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "ShortCode", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/dedicatedshortcode/sendsms.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> dedicatedshortcodeSendsms(@ApiParam(value = "Your dedicated shortcode", required=true) @RequestParam(value="shortcode", required=true)  Integer shortcode,@ApiParam(value = "The number to send your SMS to", required=true) @RequestParam(value="to", required=true)  Double to,@ApiParam(value = "The body of your message", required=true) @RequestParam(value="body", required=true)  String body,@ApiParam(value = "Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST") @RequestParam(value="method", required=false)  String method,@ApiParam(value = "URL that can be requested to receive notification when Short Code message was sent.") @RequestParam(value="messagestatuscallback", required=false)  String messagestatuscallback);


    @ApiOperation(value = "Update Shortcode", nickname = "dedicatedshortcodeUpdateshortcode", notes = "Update a dedicated shortcode.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "ShortCode", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/dedicatedshortcode/updateshortcode.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> dedicatedshortcodeUpdateshortcode(@ApiParam(value = "List of valid dedicated shortcode to your Ytel account.", required=true) @RequestParam(value="Shortcode", required=true)  String shortcode,@ApiParam(value = "User generated name of the dedicated shortcode.") @RequestParam(value="FriendlyName", required=false)  String friendlyName,@ApiParam(value = "Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.") @RequestParam(value="CallbackMethod", required=false)  String callbackMethod,@ApiParam(value = "URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.") @RequestParam(value="CallbackUrl", required=false)  String callbackUrl,@ApiParam(value = "Specifies the HTTP method used to request the required FallbackUrl once call connects.") @RequestParam(value="FallbackMethod", required=false)  String fallbackMethod,@ApiParam(value = "URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.") @RequestParam(value="FallbackUrl", required=false)  String fallbackUrl);


    @ApiOperation(value = "View SMS", nickname = "dedicatedshortcodeViewshortcode", notes = "Retrieve a single Short Code object by its shortcode assignment.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "ShortCode", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/dedicatedshortcode/viewshortcode.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> dedicatedshortcodeViewshortcode(@ApiParam(value = "List of valid Dedicated Short Code to your Ytel account", required=true) @RequestParam(value="Shortcode", required=true)  String shortcode);

}
