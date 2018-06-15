import connexion
import six

from swagger_server import util


def incomingphone_availablenumber(numbertype, areacode, pagesize=None):  # noqa: E501
    """Available Numbers

    Retrieve a list of available phone numbers that can be purchased and used for your Ytel account. # noqa: E501

    :param numbertype: Number type either SMS,Voice or all
    :type numbertype: str
    :param areacode: Specifies the area code for the returned list of available numbers. Only available for North American numbers.
    :type areacode: str
    :param pagesize: The count of objects to return.
    :type pagesize: int

    :rtype: str
    """
    return 'do some magic!'


def incomingphone_bulkbuy(NumberType, AreaCode, Quantity, Leftover=None):  # noqa: E501
    """Bulk Buy Numbers

    Purchase a selected number of DID&#39;s from specific area codes to be used with your Ytel account. # noqa: E501

    :param NumberType: The capability the number supports.
    :type NumberType: str
    :param AreaCode: Specifies the area code for the returned list of available numbers. Only available for North American numbers.
    :type AreaCode: str
    :param Quantity: A positive integer that tells how many number you want to buy at a time.
    :type Quantity: str
    :param Leftover: If desired quantity is unavailable purchase what is available .
    :type Leftover: str

    :rtype: str
    """
    return 'do some magic!'


def incomingphone_buynumber(PhoneNumber):  # noqa: E501
    """Purchase Number

    Purchase a phone number to be used with your Ytel account # noqa: E501

    :param PhoneNumber: A valid 10-digit Ytel number (E.164 format).
    :type PhoneNumber: str

    :rtype: str
    """
    return 'do some magic!'


def incomingphone_getdidscore(Phonenumber):  # noqa: E501
    """Get DID Score

    Get DID Score Number # noqa: E501

    :param Phonenumber: Specifies the multiple phone numbers for check updated spamscore .
    :type Phonenumber: str

    :rtype: str
    """
    return 'do some magic!'


def incomingphone_listnumber(Page=None, PageSize=None, NumberType=None, FriendlyName=None):  # noqa: E501
    """List Numbers

    Retrieve a list of purchased phones numbers associated with your Ytel account. # noqa: E501

    :param Page: Which page of the overall response will be returned. Page indexing starts at 1.
    :type Page: int
    :param PageSize: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type PageSize: int
    :param NumberType: The capability supported by the number.Number type either SMS,Voice or all
    :type NumberType: str
    :param FriendlyName: A human-readable label added to the number object.
    :type FriendlyName: str

    :rtype: str
    """
    return 'do some magic!'


def incomingphone_massreleasenumber(PhoneNumber):  # noqa: E501
    """Bulk Release

    Remove a purchased Ytel number from your account. # noqa: E501

    :param PhoneNumber: A valid Ytel comma separated numbers (E.164 format).
    :type PhoneNumber: str

    :rtype: str
    """
    return 'do some magic!'


def incomingphone_massupdatenumber(PhoneNumber, VoiceUrl, FriendlyName=None, VoiceMethod=None, VoiceFallbackUrl=None, VoiceFallbackMethod=None, HangupCallback=None, HangupCallbackMethod=None, HeartbeatUrl=None, HeartbeatMethod=None, SmsUrl=None, SmsMethod=None, SmsFallbackUrl=None, SmsFallbackMethod=None):  # noqa: E501
    """Bulk Update Numbers

    Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated. # noqa: E501

    :param PhoneNumber: A valid comma(,) separated Ytel numbers. (E.164 format).
    :type PhoneNumber: str
    :param VoiceUrl: The URL returning InboundXML incoming calls should execute when connected.
    :type VoiceUrl: str
    :param FriendlyName: A human-readable value for labeling the number.
    :type FriendlyName: str
    :param VoiceMethod: Specifies the HTTP method used to request the VoiceUrl once incoming call connects.
    :type VoiceMethod: str
    :param VoiceFallbackUrl: URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url
    :type VoiceFallbackUrl: str
    :param VoiceFallbackMethod: Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects.
    :type VoiceFallbackMethod: str
    :param HangupCallback: URL that can be requested to receive notification when and how incoming call has ended.
    :type HangupCallback: str
    :param HangupCallbackMethod: The HTTP method Ytel will use when requesting the HangupCallback URL.
    :type HangupCallbackMethod: str
    :param HeartbeatUrl: URL that can be used to monitor the phone number.
    :type HeartbeatUrl: str
    :param HeartbeatMethod: The HTTP method Ytel will use when requesting the HeartbeatUrl.
    :type HeartbeatMethod: str
    :param SmsUrl: URL requested when an SMS is received.
    :type SmsUrl: str
    :param SmsMethod: The HTTP method Ytel will use when requesting the SmsUrl.
    :type SmsMethod: str
    :param SmsFallbackUrl: URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
    :type SmsFallbackUrl: str
    :param SmsFallbackMethod: The HTTP method Ytel will use when URL requested if the SmsUrl is not available.
    :type SmsFallbackMethod: str

    :rtype: str
    """
    return 'do some magic!'


def incomingphone_releasenumber_by_response_type_post(PhoneNumber, ResponseType):  # noqa: E501
    """Release Number

    Remove a purchased Ytel number from your account. # noqa: E501

    :param PhoneNumber: A valid 10-digit Ytel number (E.164 format).
    :type PhoneNumber: str
    :param ResponseType: Response type format xml or json
    :type ResponseType: str

    :rtype: str
    """
    return 'do some magic!'


def incomingphone_transferphonenumbers(phonenumber, fromaccountsid, toaccountsid):  # noqa: E501
    """Move Number

    Transfer phone number that has been purchased for from one account to another account. # noqa: E501

    :param phonenumber: A valid 10-digit Ytel number (E.164 format).
    :type phonenumber: str
    :param fromaccountsid: A specific Accountsid from where Number is getting transfer.
    :type fromaccountsid: str
    :param toaccountsid: A specific Accountsid to which Number is getting transfer.
    :type toaccountsid: str

    :rtype: str
    """
    return 'do some magic!'


def incomingphone_updatenumber(PhoneNumber, VoiceUrl, FriendlyName=None, VoiceMethod=None, VoiceFallbackUrl=None, VoiceFallbackMethod=None, HangupCallback=None, HangupCallbackMethod=None, HeartbeatUrl=None, HeartbeatMethod=None, SmsUrl=None, SmsMethod=None, SmsFallbackUrl=None, SmsFallbackMethod=None):  # noqa: E501
    """Update Number

    Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated. # noqa: E501

    :param PhoneNumber: A valid Ytel number (E.164 format).
    :type PhoneNumber: str
    :param VoiceUrl: URL requested once the call connects
    :type VoiceUrl: str
    :param FriendlyName: Phone number friendly name description
    :type FriendlyName: str
    :param VoiceMethod: Post or Get
    :type VoiceMethod: str
    :param VoiceFallbackUrl: URL requested if the voice URL is not available
    :type VoiceFallbackUrl: str
    :param VoiceFallbackMethod: Post or Get
    :type VoiceFallbackMethod: str
    :param HangupCallback: callback url after a hangup occurs
    :type HangupCallback: str
    :param HangupCallbackMethod: Post or Get
    :type HangupCallbackMethod: str
    :param HeartbeatUrl: URL requested once the call connects
    :type HeartbeatUrl: str
    :param HeartbeatMethod: URL that can be requested every 60 seconds during the call to notify of elapsed time
    :type HeartbeatMethod: str
    :param SmsUrl: URL requested when an SMS is received
    :type SmsUrl: str
    :param SmsMethod: Post or Get
    :type SmsMethod: str
    :param SmsFallbackUrl: URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
    :type SmsFallbackUrl: str
    :param SmsFallbackMethod: The HTTP method Ytel will use when URL requested if the SmsUrl is not available.
    :type SmsFallbackMethod: str

    :rtype: str
    """
    return 'do some magic!'


def incomingphone_viewnumber(PhoneNumber):  # noqa: E501
    """View Details

    Retrieve the details for a phone number by its number. # noqa: E501

    :param PhoneNumber: A valid Ytel 10-digit phone number (E.164 format).
    :type PhoneNumber: str

    :rtype: str
    """
    return 'do some magic!'
