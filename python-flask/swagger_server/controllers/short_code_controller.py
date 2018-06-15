import connexion
import six

from swagger_server import util


def dedicatedshortcode_getinboundsms(page=None, pagesize=None, From=None, Shortcode=None, Datecreated=None):  # noqa: E501
    """List Inbound SMS

    Retrive a list of inbound Sms Short Code messages associated with your Ytel account. # noqa: E501

    :param page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type page: int
    :param pagesize: Number of individual resources listed in the response per page
    :type pagesize: int
    :param From: Only list SMS messages sent from this number
    :type From: str
    :param Shortcode: Only list SMS messages sent to Shortcode
    :type Shortcode: str
    :param Datecreated: Only list SMS messages sent in the specified date MAKE REQUEST
    :type Datecreated: str

    :rtype: str
    """
    return 'do some magic!'


def dedicatedshortcode_listshortcode(Shortcode=None, page=None, pagesize=None):  # noqa: E501
    """List Shortcodes

    Retrieve a list of Short Code assignment associated with your Ytel account. # noqa: E501

    :param Shortcode: Only list Short Code Assignment sent from this Short Code
    :type Shortcode: str
    :param page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type page: str
    :param pagesize: The count of objects to return per page.
    :type pagesize: str

    :rtype: str
    """
    return 'do some magic!'


def dedicatedshortcode_sendsms(shortcode, to, body, method=None, messagestatuscallback=None):  # noqa: E501
    """Send SMS

    Send Dedicated Shortcode # noqa: E501

    :param shortcode: Your dedicated shortcode
    :type shortcode: int
    :param to: The number to send your SMS to
    :type to: float
    :param body: The body of your message
    :type body: str
    :param method: Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST
    :type method: str
    :param messagestatuscallback: URL that can be requested to receive notification when Short Code message was sent.
    :type messagestatuscallback: str

    :rtype: str
    """
    return 'do some magic!'


def dedicatedshortcode_updateshortcode(Shortcode, FriendlyName=None, CallbackMethod=None, CallbackUrl=None, FallbackMethod=None, FallbackUrl=None):  # noqa: E501
    """Update Shortcode

    Update a dedicated shortcode. # noqa: E501

    :param Shortcode: List of valid dedicated shortcode to your Ytel account.
    :type Shortcode: str
    :param FriendlyName: User generated name of the dedicated shortcode.
    :type FriendlyName: str
    :param CallbackMethod: Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
    :type CallbackMethod: str
    :param CallbackUrl: URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
    :type CallbackUrl: str
    :param FallbackMethod: Specifies the HTTP method used to request the required FallbackUrl once call connects.
    :type FallbackMethod: str
    :param FallbackUrl: URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
    :type FallbackUrl: str

    :rtype: str
    """
    return 'do some magic!'


def dedicatedshortcode_viewshortcode(Shortcode):  # noqa: E501
    """View SMS

    Retrieve a single Short Code object by its shortcode assignment. # noqa: E501

    :param Shortcode: List of valid Dedicated Short Code to your Ytel account
    :type Shortcode: str

    :rtype: str
    """
    return 'do some magic!'


def shortcode_listsms(Shortcode=None, To=None, DateSent=None, Page=None, PageSize=None):  # noqa: E501
    """List SMS

    Retrieve a list of Short Code messages. # noqa: E501

    :param Shortcode: Only list messages sent from this Short Code
    :type Shortcode: str
    :param To: Only list messages sent to this number
    :type To: str
    :param DateSent: Only list messages sent with the specified date
    :type DateSent: str
    :param Page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type Page: int
    :param PageSize: The count of objects to return per page.
    :type PageSize: int

    :rtype: str
    """
    return 'do some magic!'


def shortcode_viewsms(MessageSid):  # noqa: E501
    """View SMS

    View a single Sms Short Code message. # noqa: E501

    :param MessageSid: The unique identifier for the sms resource
    :type MessageSid: str

    :rtype: str
    """
    return 'do some magic!'
