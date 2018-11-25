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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-25T18:04:42.332Z")

@Api(value = "user", description = "the user API")
public interface UserApi {

    @ApiOperation(value = "Create Subaccount", nickname = "userCreatesubaccount", notes = "Create a sub user account under the parent account", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Sub Account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/user/createsubaccount.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> userCreatesubaccount(@ApiParam(value = "Sub account user first name", required=true) @RequestParam(value="FirstName", required=true)  String firstName,@ApiParam(value = "sub account user last name", required=true) @RequestParam(value="LastName", required=true)  String lastName,@ApiParam(value = "Sub account email address", required=true) @RequestParam(value="Email", required=true)  String email,@ApiParam(value = "Descriptive name of the sub account", required=true) @RequestParam(value="FriendlyName", required=true)  String friendlyName,@ApiParam(value = "The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.", required=true) @RequestParam(value="Password", required=true)  String password);


    @ApiOperation(value = "Delete Subaccount", nickname = "userDeletesubaccount", notes = "Delete sub account or merge numbers into parent", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Sub Account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/user/deletesubaccount.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> userDeletesubaccount(@ApiParam(value = "The SubaccountSid to be deleted", required=true) @RequestParam(value="SubAccountSID", required=true)  String subAccountSID,@ApiParam(value = "0 to delete or 1 to merge numbers to parent account.", required=true, allowableValues="0, 1") @RequestParam(value="MergeNumber", required=true)  String mergeNumber);


    @ApiOperation(value = "Toggle Subaccount Status", nickname = "userSubaccountactivation", notes = "Suspend or unsuspend", response = String.class, authorizations = {
        @Authorization(value = "auth")
    }, tags={ "Sub Account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = String.class) })
    @RequestMapping(value = "/user/subaccountactivation.json",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<String> userSubaccountactivation(@ApiParam(value = "The SubaccountSid to be activated or suspended", required=true) @RequestParam(value="SubAccountSID", required=true)  String subAccountSID,@ApiParam(value = "0 to suspend or 1 to activate", required=true, allowableValues="1, 0") @RequestParam(value="Activate", required=true)  String activate);

}
