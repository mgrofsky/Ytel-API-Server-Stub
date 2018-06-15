import connexion
import six

from swagger_server import util


def sms_getinboundsms(Page=None, PageSize=None, From=None, To=None, DateSent=None):  # noqa: E501
    """List Inbound SMS

    Retrieve a list of Inbound SMS message objects. # noqa: E501

    :param Page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type Page: int
    :param PageSize: The count of objects to return per page.
    :type PageSize: int
    :param From: Filter SMS message objects from this valid 10-digit phone number (E.164 format).
    :type From: str
    :param To: Filter SMS message objects to this valid 10-digit phone number (E.164 format).
    :type To: str
    :param DateSent: Filter sms message objects by this date.
    :type DateSent: str

    :rtype: str
    """
    return 'do some magic!'


def sms_listsms(Page=None, PageSize=None, From=None, To=None, DateSent=None):  # noqa: E501
    """List SMS

    Retrieve a list of Outbound SMS message objects. # noqa: E501

    :param Page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type Page: int
    :param PageSize: Number of individual resources listed in the response per page
    :type PageSize: int
    :param From: Filter SMS message objects from this valid 10-digit phone number (E.164 format).
    :type From: str
    :param To: Filter SMS message objects to this valid 10-digit phone number (E.164 format).
    :type To: str
    :param DateSent: Only list SMS messages sent in the specified date range
    :type DateSent: str

    :rtype: str
    """
    return 'do some magic!'


def sms_sendsms(From, To, Body, Method=None, MessageStatusCallback=None, Smartsms=None, DeliveryStatus=None):  # noqa: E501
    """Send SMS

    Send an SMS from a Ytel number # noqa: E501

    :param From: The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent.
    :type From: str
    :param To: The 10-digit phone number (E.164 format) that will receive the message.
    :type To: str
    :param Body: The body message that is to be sent in the text.
    :type Body: str
    :param Method: Specifies the HTTP method used to request the required URL once SMS sent.
    :type Method: str
    :param MessageStatusCallback: URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.
    :type MessageStatusCallback: str
    :param Smartsms: Check&#39;s &#39;to&#39; number can receive sms or not using Carrier API, if wireless &#x3D; true then text sms is sent, else wireless &#x3D; false then call is recieved to end user with audible message.
    :type Smartsms: bool
    :param DeliveryStatus: Delivery reports are a method to tell your system if the message has arrived on the destination phone.
    :type DeliveryStatus: bool

    :rtype: str
    """
    return 'do some magic!'


def sms_viewdetailsms(MessageSid):  # noqa: E501
    """View SMS

    Retrieve a single SMS message object with details by its SmsSid. # noqa: E501

    :param MessageSid: The unique identifier for a sms message.
    :type MessageSid: str

    :rtype: str
    """
    return 'do some magic!'


def sms_viewsms(MessageSid):  # noqa: E501
    """View SMS

    Retrieve a single SMS message object by its SmsSid. # noqa: E501

    :param MessageSid: The unique identifier for a sms message.
    :type MessageSid: str

    :rtype: str
    """
    return 'do some magic!'
