package 

import (
	"net/http"
	"fmt"
	"github.com/gorilla/mux"
)

type Route struct {
	Name        string
	Method      string
	Pattern     string
	HandlerFunc http.HandlerFunc
}

type Routes []Route

func NewRouter() *mux.Router {
	router := mux.NewRouter().StrictSlash(true)
	for _, route := range routes {
		var handler http.Handler
		handler = route.HandlerFunc
		handler = Logger(handler, route.Name)

		router.
			Methods(route.Method).
			Path(route.Pattern).
			Name(route.Name).
			Handler(handler)
	}

	return router
}

func Index(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w, "Hello World!")
}

var routes = Routes{
	Route{
		"Index",
		"GET",
		"/api/v3//",
		Index,
	},

	Route{
		"AccountsViewaccount",
		"POST",
		"/api/v3//accounts/viewaccount.json",
		AccountsViewaccount,
	},

	Route{
		"AddressCreateaddress",
		"POST",
		"/api/v3//address/createaddress.json",
		AddressCreateaddress,
	},

	Route{
		"AddressDeleteaddress",
		"POST",
		"/api/v3//address/deleteaddress.json",
		AddressDeleteaddress,
	},

	Route{
		"AddressListaddress",
		"POST",
		"/api/v3//address/listaddress.json",
		AddressListaddress,
	},

	Route{
		"AddressVerifyaddress",
		"POST",
		"/api/v3//address/verifyaddress.json",
		AddressVerifyaddress,
	},

	Route{
		"AddressViewaddress",
		"POST",
		"/api/v3//address/viewaddress.json",
		AddressViewaddress,
	},

	Route{
		"AreamailCreate",
		"POST",
		"/api/v3//areamail/create.json",
		AreamailCreate,
	},

	Route{
		"AreamailDelete",
		"POST",
		"/api/v3//areamail/delete.json",
		AreamailDelete,
	},

	Route{
		"AreamailLists",
		"POST",
		"/api/v3//areamail/lists.json",
		AreamailLists,
	},

	Route{
		"AreamailView",
		"POST",
		"/api/v3//areamail/view.json",
		AreamailView,
	},

	Route{
		"CallsGroupcall",
		"POST",
		"/api/v3//calls/groupcall.json",
		CallsGroupcall,
	},

	Route{
		"CallsInterruptcalls",
		"POST",
		"/api/v3//calls/interruptcalls.json",
		CallsInterruptcalls,
	},

	Route{
		"CallsListcalls",
		"POST",
		"/api/v3//calls/listcalls.json",
		CallsListcalls,
	},

	Route{
		"CallsMakecall",
		"POST",
		"/api/v3//calls/makecall.json",
		CallsMakecall,
	},

	Route{
		"CallsMakervm",
		"POST",
		"/api/v3//calls/makervm.json",
		CallsMakervm,
	},

	Route{
		"CallsPlayaudios",
		"POST",
		"/api/v3//calls/playaudios.json",
		CallsPlayaudios,
	},

	Route{
		"CallsRecordcalls",
		"POST",
		"/api/v3//calls/recordcalls.json",
		CallsRecordcalls,
	},

	Route{
		"CallsSenddigits",
		"POST",
		"/api/v3//calls/senddigits.json",
		CallsSenddigits,
	},

	Route{
		"CallsViewcalldetail",
		"POST",
		"/api/v3//calls/viewcalldetail.json",
		CallsViewcalldetail,
	},

	Route{
		"CallsViewcalls",
		"POST",
		"/api/v3//calls/viewcalls.json",
		CallsViewcalls,
	},

	Route{
		"CallsVoiceeffect",
		"POST",
		"/api/v3//calls/voiceeffect.json",
		CallsVoiceeffect,
	},

	Route{
		"CarrierLookup",
		"POST",
		"/api/v3//carrier/lookup.json",
		CarrierLookup,
	},

	Route{
		"CarrierLookuplist",
		"POST",
		"/api/v3//carrier/lookuplist.json",
		CarrierLookuplist,
	},

	Route{
		"ConferencesAddParticipant",
		"POST",
		"/api/v3//conferences/addParticipant.json",
		ConferencesAddParticipant,
	},

	Route{
		"ConferencesCreateConference",
		"POST",
		"/api/v3//conferences/createConference.json",
		ConferencesCreateConference,
	},

	Route{
		"ConferencesDeafMuteParticipant",
		"POST",
		"/api/v3//conferences/deafMuteParticipant.json",
		ConferencesDeafMuteParticipant,
	},

	Route{
		"ConferencesHangupParticipant",
		"POST",
		"/api/v3//conferences/hangupParticipant.json",
		ConferencesHangupParticipant,
	},

	Route{
		"ConferencesListParticipant",
		"POST",
		"/api/v3//conferences/listParticipant.json",
		ConferencesListParticipant,
	},

	Route{
		"ConferencesListconference",
		"POST",
		"/api/v3//conferences/listconference.json",
		ConferencesListconference,
	},

	Route{
		"ConferencesPlayAudio",
		"POST",
		"/api/v3//conferences/playAudio.json",
		ConferencesPlayAudio,
	},

	Route{
		"ConferencesViewParticipant",
		"POST",
		"/api/v3//conferences/viewParticipant.json",
		ConferencesViewParticipant,
	},

	Route{
		"ConferencesViewconference",
		"POST",
		"/api/v3//conferences/viewconference.json",
		ConferencesViewconference,
	},

	Route{
		"EmailAddunsubscribesemail",
		"POST",
		"/api/v3//email/addunsubscribesemail.json",
		EmailAddunsubscribesemail,
	},

	Route{
		"EmailDeleteblocksemail",
		"POST",
		"/api/v3//email/deleteblocksemail.json",
		EmailDeleteblocksemail,
	},

	Route{
		"EmailDeletebouncesemail",
		"POST",
		"/api/v3//email/deletebouncesemail.json",
		EmailDeletebouncesemail,
	},

	Route{
		"EmailDeleteinvalidemail",
		"POST",
		"/api/v3//email/deleteinvalidemail.json",
		EmailDeleteinvalidemail,
	},

	Route{
		"EmailDeletespamemail",
		"POST",
		"/api/v3//email/deletespamemail.json",
		EmailDeletespamemail,
	},

	Route{
		"EmailDeleteunsubscribedemail",
		"POST",
		"/api/v3//email/deleteunsubscribedemail.json",
		EmailDeleteunsubscribedemail,
	},

	Route{
		"EmailListblockemail",
		"POST",
		"/api/v3//email/listblockemail.json",
		EmailListblockemail,
	},

	Route{
		"EmailListbounceemail",
		"POST",
		"/api/v3//email/listbounceemail.json",
		EmailListbounceemail,
	},

	Route{
		"EmailListinvalidemail",
		"POST",
		"/api/v3//email/listinvalidemail.json",
		EmailListinvalidemail,
	},

	Route{
		"EmailListspamemail",
		"POST",
		"/api/v3//email/listspamemail.json",
		EmailListspamemail,
	},

	Route{
		"EmailListunsubscribedemail",
		"POST",
		"/api/v3//email/listunsubscribedemail.json",
		EmailListunsubscribedemail,
	},

	Route{
		"EmailSendemails",
		"POST",
		"/api/v3//email/sendemails.json",
		EmailSendemails,
	},

	Route{
		"LetterCreate",
		"POST",
		"/api/v3//letter/create.json",
		LetterCreate,
	},

	Route{
		"LetterDelete",
		"POST",
		"/api/v3//letter/delete.json",
		LetterDelete,
	},

	Route{
		"LetterListsletter",
		"POST",
		"/api/v3//letter/listsletter.json",
		LetterListsletter,
	},

	Route{
		"LetterViewletter",
		"POST",
		"/api/v3//letter/viewletter.json",
		LetterViewletter,
	},

	Route{
		"IncomingphoneAvailablenumber",
		"POST",
		"/api/v3//incomingphone/availablenumber.json",
		IncomingphoneAvailablenumber,
	},

	Route{
		"IncomingphoneBulkbuy",
		"POST",
		"/api/v3//incomingphone/bulkbuy.json",
		IncomingphoneBulkbuy,
	},

	Route{
		"IncomingphoneBuynumber",
		"POST",
		"/api/v3//incomingphone/buynumber.json",
		IncomingphoneBuynumber,
	},

	Route{
		"IncomingphoneGetdidscore",
		"POST",
		"/api/v3//incomingphone/getdidscore.json",
		IncomingphoneGetdidscore,
	},

	Route{
		"IncomingphoneListnumber",
		"POST",
		"/api/v3//incomingphone/listnumber.json",
		IncomingphoneListnumber,
	},

	Route{
		"IncomingphoneMassreleasenumber",
		"POST",
		"/api/v3//incomingphone/massreleasenumber.json",
		IncomingphoneMassreleasenumber,
	},

	Route{
		"IncomingphoneMassupdatenumber",
		"POST",
		"/api/v3//incomingphone/massupdatenumber.json",
		IncomingphoneMassupdatenumber,
	},

	Route{
		"IncomingphoneReleasenumberByResponseTypePost",
		"POST",
		"/api/v3//incomingphone/releasenumber.{ResponseType}",
		IncomingphoneReleasenumberByResponseTypePost,
	},

	Route{
		"IncomingphoneTransferphonenumbers",
		"POST",
		"/api/v3//incomingphone/transferphonenumbers.json",
		IncomingphoneTransferphonenumbers,
	},

	Route{
		"IncomingphoneUpdatenumber",
		"POST",
		"/api/v3//incomingphone/updatenumber.json",
		IncomingphoneUpdatenumber,
	},

	Route{
		"IncomingphoneViewnumber",
		"POST",
		"/api/v3//incomingphone/viewnumber.json",
		IncomingphoneViewnumber,
	},

	Route{
		"PostcardCreatepostcard",
		"POST",
		"/api/v3//Postcard/createpostcard.json",
		PostcardCreatepostcard,
	},

	Route{
		"PostcardDeletepostcard",
		"POST",
		"/api/v3//Postcard/deletepostcard.json",
		PostcardDeletepostcard,
	},

	Route{
		"PostcardListpostcard",
		"POST",
		"/api/v3//Postcard/listpostcard.json",
		PostcardListpostcard,
	},

	Route{
		"PostcardViewpostcard",
		"POST",
		"/api/v3//Postcard/viewpostcard.json",
		PostcardViewpostcard,
	},

	Route{
		"RecordingDeleterecording",
		"POST",
		"/api/v3//recording/deleterecording.json",
		RecordingDeleterecording,
	},

	Route{
		"RecordingListrecording",
		"POST",
		"/api/v3//recording/listrecording.json",
		RecordingListrecording,
	},

	Route{
		"RecordingViewrecording",
		"POST",
		"/api/v3//recording/viewrecording.json",
		RecordingViewrecording,
	},

	Route{
		"SmsGetinboundsms",
		"POST",
		"/api/v3//sms/getinboundsms.json",
		SmsGetinboundsms,
	},

	Route{
		"SmsListsms",
		"POST",
		"/api/v3//sms/listsms.json",
		SmsListsms,
	},

	Route{
		"SmsSendsms",
		"POST",
		"/api/v3//sms/sendsms.json",
		SmsSendsms,
	},

	Route{
		"SmsViewdetailsms",
		"POST",
		"/api/v3//sms/viewdetailsms.json",
		SmsViewdetailsms,
	},

	Route{
		"SmsViewsms",
		"POST",
		"/api/v3//sms/viewsms.json",
		SmsViewsms,
	},

	Route{
		"KeywordLists",
		"POST",
		"/api/v3//keyword/lists.json",
		KeywordLists,
	},

	Route{
		"KeywordView",
		"POST",
		"/api/v3//keyword/view.json",
		KeywordView,
	},

	Route{
		"ShortcodeGetinboundsms",
		"POST",
		"/api/v3//shortcode/getinboundsms.json",
		ShortcodeGetinboundsms,
	},

	Route{
		"ShortcodeListshortcode",
		"POST",
		"/api/v3//shortcode/listshortcode.json",
		ShortcodeListshortcode,
	},

	Route{
		"ShortcodeSendsms",
		"POST",
		"/api/v3//shortcode/sendsms.json",
		ShortcodeSendsms,
	},

	Route{
		"ShortcodeUpdateshortcode",
		"POST",
		"/api/v3//shortcode/updateshortcode.json",
		ShortcodeUpdateshortcode,
	},

	Route{
		"ShortcodeViewshortcode",
		"POST",
		"/api/v3//shortcode/viewshortcode.json",
		ShortcodeViewshortcode,
	},

	Route{
		"TemplateLists",
		"POST",
		"/api/v3//template/lists.json",
		TemplateLists,
	},

	Route{
		"TemplateView",
		"POST",
		"/api/v3//template/view.json",
		TemplateView,
	},

	Route{
		"DedicatedshortcodeGetinboundsms",
		"POST",
		"/api/v3//dedicatedshortcode/getinboundsms.json",
		DedicatedshortcodeGetinboundsms,
	},

	Route{
		"DedicatedshortcodeListshortcode",
		"POST",
		"/api/v3//dedicatedshortcode/listshortcode.json",
		DedicatedshortcodeListshortcode,
	},

	Route{
		"DedicatedshortcodeSendsms",
		"POST",
		"/api/v3//dedicatedshortcode/sendsms.json",
		DedicatedshortcodeSendsms,
	},

	Route{
		"DedicatedshortcodeUpdateshortcode",
		"POST",
		"/api/v3//dedicatedshortcode/updateshortcode.json",
		DedicatedshortcodeUpdateshortcode,
	},

	Route{
		"DedicatedshortcodeViewshortcode",
		"POST",
		"/api/v3//dedicatedshortcode/viewshortcode.json",
		DedicatedshortcodeViewshortcode,
	},

	Route{
		"ShortcodeListsms",
		"POST",
		"/api/v3//shortcode/listsms.json",
		ShortcodeListsms,
	},

	Route{
		"ShortcodeViewsms",
		"POST",
		"/api/v3//shortcode/viewsms.json",
		ShortcodeViewsms,
	},

	Route{
		"UserCreatesubaccount",
		"POST",
		"/api/v3//user/createsubaccount.json",
		UserCreatesubaccount,
	},

	Route{
		"UserDeletesubaccount",
		"POST",
		"/api/v3//user/deletesubaccount.json",
		UserDeletesubaccount,
	},

	Route{
		"UserSubaccountactivation",
		"POST",
		"/api/v3//user/subaccountactivation.json",
		UserSubaccountactivation,
	},

	Route{
		"TranscriptionsAudiourltranscription",
		"POST",
		"/api/v3//transcriptions/audiourltranscription.json",
		TranscriptionsAudiourltranscription,
	},

	Route{
		"TranscriptionsListtranscription",
		"POST",
		"/api/v3//transcriptions/listtranscription.json",
		TranscriptionsListtranscription,
	},

	Route{
		"TranscriptionsRecordingtranscription",
		"POST",
		"/api/v3//transcriptions/recordingtranscription.json",
		TranscriptionsRecordingtranscription,
	},

	Route{
		"TranscriptionsViewtranscription",
		"POST",
		"/api/v3//transcriptions/viewtranscription.json",
		TranscriptionsViewtranscription,
	},

	Route{
		"UsageListusage",
		"POST",
		"/api/v3//usage/listusage.json",
		UsageListusage,
	},

}
