=begin
Ytel API V3

Ytel API version 3

OpenAPI spec version: 3.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

=end
Rails.application.routes.draw do

  def add_swagger_route http_method, path, opts = {}
    full_path = path.gsub(/{(.*?)}/, ':\1')
    match full_path, to: "#{opts.fetch(:controller_name)}##{opts[:action_name]}", via: http_method
  end

  add_swagger_route 'POST', '/api/v3//accounts/viewaccount.json', controller_name: 'account', action_name: 'accounts_viewaccount'
  add_swagger_route 'POST', '/api/v3//address/createaddress.json', controller_name: 'address', action_name: 'address_createaddress'
  add_swagger_route 'POST', '/api/v3//address/deleteaddress.json', controller_name: 'address', action_name: 'address_deleteaddress'
  add_swagger_route 'POST', '/api/v3//address/listaddress.json', controller_name: 'address', action_name: 'address_listaddress'
  add_swagger_route 'POST', '/api/v3//address/verifyaddress.json', controller_name: 'address', action_name: 'address_verifyaddress'
  add_swagger_route 'POST', '/api/v3//address/viewaddress.json', controller_name: 'address', action_name: 'address_viewaddress'
  add_swagger_route 'POST', '/api/v3//areamail/create.json', controller_name: 'areaMail', action_name: 'areamail_create'
  add_swagger_route 'POST', '/api/v3//areamail/delete.json', controller_name: 'areaMail', action_name: 'areamail_delete'
  add_swagger_route 'POST', '/api/v3//areamail/lists.json', controller_name: 'areaMail', action_name: 'areamail_lists'
  add_swagger_route 'POST', '/api/v3//areamail/view.json', controller_name: 'areaMail', action_name: 'areamail_view'
  add_swagger_route 'POST', '/api/v3//calls/groupcall.json', controller_name: 'call', action_name: 'calls_groupcall'
  add_swagger_route 'POST', '/api/v3//calls/interruptcalls.json', controller_name: 'call', action_name: 'calls_interruptcalls'
  add_swagger_route 'POST', '/api/v3//calls/listcalls.json', controller_name: 'call', action_name: 'calls_listcalls'
  add_swagger_route 'POST', '/api/v3//calls/makecall.json', controller_name: 'call', action_name: 'calls_makecall'
  add_swagger_route 'POST', '/api/v3//calls/makervm.json', controller_name: 'call', action_name: 'calls_makervm'
  add_swagger_route 'POST', '/api/v3//calls/playaudios.json', controller_name: 'call', action_name: 'calls_playaudios'
  add_swagger_route 'POST', '/api/v3//calls/recordcalls.json', controller_name: 'call', action_name: 'calls_recordcalls'
  add_swagger_route 'POST', '/api/v3//calls/senddigits.json', controller_name: 'call', action_name: 'calls_senddigits'
  add_swagger_route 'POST', '/api/v3//calls/viewcalldetail.json', controller_name: 'call', action_name: 'calls_viewcalldetail'
  add_swagger_route 'POST', '/api/v3//calls/viewcalls.json', controller_name: 'call', action_name: 'calls_viewcalls'
  add_swagger_route 'POST', '/api/v3//calls/voiceeffect.json', controller_name: 'call', action_name: 'calls_voiceeffect'
  add_swagger_route 'POST', '/api/v3//carrier/lookup.json', controller_name: 'carrier', action_name: 'carrier_lookup'
  add_swagger_route 'POST', '/api/v3//carrier/lookuplist.json', controller_name: 'carrier', action_name: 'carrier_lookuplist'
  add_swagger_route 'POST', '/api/v3//conferences/addParticipant.json', controller_name: 'conference', action_name: 'conferences_add_participant'
  add_swagger_route 'POST', '/api/v3//conferences/createConference.json', controller_name: 'conference', action_name: 'conferences_create_conference'
  add_swagger_route 'POST', '/api/v3//conferences/deafMuteParticipant.json', controller_name: 'conference', action_name: 'conferences_deaf_mute_participant'
  add_swagger_route 'POST', '/api/v3//conferences/hangupParticipant.json', controller_name: 'conference', action_name: 'conferences_hangup_participant'
  add_swagger_route 'POST', '/api/v3//conferences/listParticipant.json', controller_name: 'conference', action_name: 'conferences_list_participant'
  add_swagger_route 'POST', '/api/v3//conferences/listconference.json', controller_name: 'conference', action_name: 'conferences_listconference'
  add_swagger_route 'POST', '/api/v3//conferences/playAudio.json', controller_name: 'conference', action_name: 'conferences_play_audio'
  add_swagger_route 'POST', '/api/v3//conferences/viewParticipant.json', controller_name: 'conference', action_name: 'conferences_view_participant'
  add_swagger_route 'POST', '/api/v3//conferences/viewconference.json', controller_name: 'conference', action_name: 'conferences_viewconference'
  add_swagger_route 'POST', '/api/v3//email/addunsubscribesemail.json', controller_name: 'email', action_name: 'email_addunsubscribesemail'
  add_swagger_route 'POST', '/api/v3//email/deleteblocksemail.json', controller_name: 'email', action_name: 'email_deleteblocksemail'
  add_swagger_route 'POST', '/api/v3//email/deletebouncesemail.json', controller_name: 'email', action_name: 'email_deletebouncesemail'
  add_swagger_route 'POST', '/api/v3//email/deleteinvalidemail.json', controller_name: 'email', action_name: 'email_deleteinvalidemail'
  add_swagger_route 'POST', '/api/v3//email/deletespamemail.json', controller_name: 'email', action_name: 'email_deletespamemail'
  add_swagger_route 'POST', '/api/v3//email/deleteunsubscribedemail.json', controller_name: 'email', action_name: 'email_deleteunsubscribedemail'
  add_swagger_route 'POST', '/api/v3//email/listblockemail.json', controller_name: 'email', action_name: 'email_listblockemail'
  add_swagger_route 'POST', '/api/v3//email/listbounceemail.json', controller_name: 'email', action_name: 'email_listbounceemail'
  add_swagger_route 'POST', '/api/v3//email/listinvalidemail.json', controller_name: 'email', action_name: 'email_listinvalidemail'
  add_swagger_route 'POST', '/api/v3//email/listspamemail.json', controller_name: 'email', action_name: 'email_listspamemail'
  add_swagger_route 'POST', '/api/v3//email/listunsubscribedemail.json', controller_name: 'email', action_name: 'email_listunsubscribedemail'
  add_swagger_route 'POST', '/api/v3//email/sendemails.json', controller_name: 'email', action_name: 'email_sendemails'
  add_swagger_route 'POST', '/api/v3//letter/create.json', controller_name: 'letter', action_name: 'letter_create'
  add_swagger_route 'POST', '/api/v3//letter/delete.json', controller_name: 'letter', action_name: 'letter_delete'
  add_swagger_route 'POST', '/api/v3//letter/listsletter.json', controller_name: 'letter', action_name: 'letter_listsletter'
  add_swagger_route 'POST', '/api/v3//letter/viewletter.json', controller_name: 'letter', action_name: 'letter_viewletter'
  add_swagger_route 'POST', '/api/v3//incomingphone/availablenumber.json', controller_name: 'phoneNumber', action_name: 'incomingphone_availablenumber'
  add_swagger_route 'POST', '/api/v3//incomingphone/bulkbuy.json', controller_name: 'phoneNumber', action_name: 'incomingphone_bulkbuy'
  add_swagger_route 'POST', '/api/v3//incomingphone/buynumber.json', controller_name: 'phoneNumber', action_name: 'incomingphone_buynumber'
  add_swagger_route 'POST', '/api/v3//incomingphone/getdidscore.json', controller_name: 'phoneNumber', action_name: 'incomingphone_getdidscore'
  add_swagger_route 'POST', '/api/v3//incomingphone/listnumber.json', controller_name: 'phoneNumber', action_name: 'incomingphone_listnumber'
  add_swagger_route 'POST', '/api/v3//incomingphone/massreleasenumber.json', controller_name: 'phoneNumber', action_name: 'incomingphone_massreleasenumber'
  add_swagger_route 'POST', '/api/v3//incomingphone/massupdatenumber.json', controller_name: 'phoneNumber', action_name: 'incomingphone_massupdatenumber'
  add_swagger_route 'POST', '/api/v3//incomingphone/releasenumber.{ResponseType}', controller_name: 'phoneNumber', action_name: 'incomingphone_releasenumber_by_response_type_post'
  add_swagger_route 'POST', '/api/v3//incomingphone/transferphonenumbers.json', controller_name: 'phoneNumber', action_name: 'incomingphone_transferphonenumbers'
  add_swagger_route 'POST', '/api/v3//incomingphone/updatenumber.json', controller_name: 'phoneNumber', action_name: 'incomingphone_updatenumber'
  add_swagger_route 'POST', '/api/v3//incomingphone/viewnumber.json', controller_name: 'phoneNumber', action_name: 'incomingphone_viewnumber'
  add_swagger_route 'POST', '/api/v3//Postcard/createpostcard.json', controller_name: 'postCard', action_name: 'postcard_createpostcard'
  add_swagger_route 'POST', '/api/v3//Postcard/deletepostcard.json', controller_name: 'postCard', action_name: 'postcard_deletepostcard'
  add_swagger_route 'POST', '/api/v3//Postcard/listpostcard.json', controller_name: 'postCard', action_name: 'postcard_listpostcard'
  add_swagger_route 'POST', '/api/v3//Postcard/viewpostcard.json', controller_name: 'postCard', action_name: 'postcard_viewpostcard'
  add_swagger_route 'POST', '/api/v3//recording/deleterecording.json', controller_name: 'recording', action_name: 'recording_deleterecording'
  add_swagger_route 'POST', '/api/v3//recording/listrecording.json', controller_name: 'recording', action_name: 'recording_listrecording'
  add_swagger_route 'POST', '/api/v3//recording/viewrecording.json', controller_name: 'recording', action_name: 'recording_viewrecording'
  add_swagger_route 'POST', '/api/v3//sms/getinboundsms.json', controller_name: 'sMS', action_name: 'sms_getinboundsms'
  add_swagger_route 'POST', '/api/v3//sms/listsms.json', controller_name: 'sMS', action_name: 'sms_listsms'
  add_swagger_route 'POST', '/api/v3//sms/sendsms.json', controller_name: 'sMS', action_name: 'sms_sendsms'
  add_swagger_route 'POST', '/api/v3//sms/viewdetailsms.json', controller_name: 'sMS', action_name: 'sms_viewdetailsms'
  add_swagger_route 'POST', '/api/v3//sms/viewsms.json', controller_name: 'sMS', action_name: 'sms_viewsms'
  add_swagger_route 'POST', '/api/v3//keyword/lists.json', controller_name: 'sharedShortCode', action_name: 'keyword_lists'
  add_swagger_route 'POST', '/api/v3//keyword/view.json', controller_name: 'sharedShortCode', action_name: 'keyword_view'
  add_swagger_route 'POST', '/api/v3//shortcode/getinboundsms.json', controller_name: 'sharedShortCode', action_name: 'shortcode_getinboundsms'
  add_swagger_route 'POST', '/api/v3//shortcode/listshortcode.json', controller_name: 'sharedShortCode', action_name: 'shortcode_listshortcode'
  add_swagger_route 'POST', '/api/v3//shortcode/sendsms.json', controller_name: 'sharedShortCode', action_name: 'shortcode_sendsms'
  add_swagger_route 'POST', '/api/v3//shortcode/updateshortcode.json', controller_name: 'sharedShortCode', action_name: 'shortcode_updateshortcode'
  add_swagger_route 'POST', '/api/v3//shortcode/viewshortcode.json', controller_name: 'sharedShortCode', action_name: 'shortcode_viewshortcode'
  add_swagger_route 'POST', '/api/v3//template/lists.json', controller_name: 'sharedShortCode', action_name: 'template_lists'
  add_swagger_route 'POST', '/api/v3//template/view.json', controller_name: 'sharedShortCode', action_name: 'template_view'
  add_swagger_route 'POST', '/api/v3//dedicatedshortcode/getinboundsms.json', controller_name: 'shortCode', action_name: 'dedicatedshortcode_getinboundsms'
  add_swagger_route 'POST', '/api/v3//dedicatedshortcode/listshortcode.json', controller_name: 'shortCode', action_name: 'dedicatedshortcode_listshortcode'
  add_swagger_route 'POST', '/api/v3//dedicatedshortcode/sendsms.json', controller_name: 'shortCode', action_name: 'dedicatedshortcode_sendsms'
  add_swagger_route 'POST', '/api/v3//dedicatedshortcode/updateshortcode.json', controller_name: 'shortCode', action_name: 'dedicatedshortcode_updateshortcode'
  add_swagger_route 'POST', '/api/v3//dedicatedshortcode/viewshortcode.json', controller_name: 'shortCode', action_name: 'dedicatedshortcode_viewshortcode'
  add_swagger_route 'POST', '/api/v3//shortcode/listsms.json', controller_name: 'shortCode', action_name: 'shortcode_listsms'
  add_swagger_route 'POST', '/api/v3//shortcode/viewsms.json', controller_name: 'shortCode', action_name: 'shortcode_viewsms'
  add_swagger_route 'POST', '/api/v3//user/createsubaccount.json', controller_name: 'subAccount', action_name: 'user_createsubaccount'
  add_swagger_route 'POST', '/api/v3//user/deletesubaccount.json', controller_name: 'subAccount', action_name: 'user_deletesubaccount'
  add_swagger_route 'POST', '/api/v3//user/subaccountactivation.json', controller_name: 'subAccount', action_name: 'user_subaccountactivation'
  add_swagger_route 'POST', '/api/v3//transcriptions/audiourltranscription.json', controller_name: 'transcription', action_name: 'transcriptions_audiourltranscription'
  add_swagger_route 'POST', '/api/v3//transcriptions/listtranscription.json', controller_name: 'transcription', action_name: 'transcriptions_listtranscription'
  add_swagger_route 'POST', '/api/v3//transcriptions/recordingtranscription.json', controller_name: 'transcription', action_name: 'transcriptions_recordingtranscription'
  add_swagger_route 'POST', '/api/v3//transcriptions/viewtranscription.json', controller_name: 'transcription', action_name: 'transcriptions_viewtranscription'
  add_swagger_route 'POST', '/api/v3//usage/listusage.json', controller_name: 'usage', action_name: 'usage_listusage'
end
