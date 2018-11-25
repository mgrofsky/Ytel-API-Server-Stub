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

@Api(value = "carrier", description = "the carrier API")
public interface CarrierApi {

    @ApiOperation(value = "Lookup Carrier", nickname = "carrierLookup", notes = "Get the Carrier Lookup", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Carrier", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/carrier/lookup.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> carrierLookup(@ApiParam(value = "A valid 10-digit number (E.164 format).", required=true) @RequestParam(value="PhoneNumber", required=true)  String phoneNumber);


    @ApiOperation(value = "Carrier Results", nickname = "carrierLookuplist", notes = "Retrieve a list of carrier lookup objects.", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Carrier", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/carrier/lookuplist.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> carrierLookuplist(@ApiParam(value = "The page count to retrieve from the total results in the collection. Page indexing starts at 1.", defaultValue="1") @RequestParam(value="Page", required=false)  Integer page,@ApiParam(value = "The count of objects to return per page.", defaultValue="10") @RequestParam(value="PageSize", required=false)  Integer pageSize);

}
