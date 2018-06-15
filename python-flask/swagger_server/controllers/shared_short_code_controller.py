import connexion
import six

from swagger_server import util


def keyword_lists(page=None, pagesize=None, Keyword=None, Shortcode=None):  # noqa: E501
    """List Keywords

    Retrieve a list of keywords associated with your Ytel account. # noqa: E501

    :param page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type page: int
    :param pagesize: Number of individual resources listed in the response per page
    :type pagesize: int
    :param Keyword: Only list keywords of keyword
    :type Keyword: str
    :param Shortcode: Only list keywords of shortcode
    :type Shortcode: int

    :rtype: str
    """
    return 'do some magic!'


def keyword_view(Keywordid):  # noqa: E501
    """View Keyword

    View a set of properties for a single keyword. # noqa: E501

    :param Keywordid: The unique identifier of each keyword
    :type Keywordid: str

    :rtype: str
    """
    return 'do some magic!'


def shortcode_getinboundsms(page=None, pagesize=None, _from=None, Shortcode=None, Datecreated=None):  # noqa: E501
    """List Inbound SMS

    List All Inbound ShortCode # noqa: E501

    :param page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type page: int
    :param pagesize: Number of individual resources listed in the response per page
    :type pagesize: int
    :param _from: From Number to Inbound ShortCode
    :type _from: str
    :param Shortcode: Only list messages sent to this Short Code
    :type Shortcode: str
    :param Datecreated: Only list messages sent with the specified date
    :type Datecreated: str

    :rtype: str
    """
    return 'do some magic!'


def shortcode_listshortcode(page=None, pagesize=None, Shortcode=None):  # noqa: E501
    """List Shortcodes

    Retrieve a list of shortcode assignment associated with your Ytel account. # noqa: E501

    :param page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type page: int
    :param pagesize: Number of individual resources listed in the response per page
    :type pagesize: int
    :param Shortcode: Only list keywords of shortcode
    :type Shortcode: str

    :rtype: str
    """
    return 'do some magic!'


def shortcode_sendsms(shortcode, to, templateid, data, Method=None, MessageStatusCallback=None):  # noqa: E501
    """Send SMS

    Send an SMS from a Ytel ShortCode # noqa: E501

    :param shortcode: The Short Code number that is the sender of this message
    :type shortcode: str
    :param to: A valid 10-digit number that should receive the message
    :type to: str
    :param templateid: The unique identifier for the template used for the message
    :type templateid: str
    :param data: format of your data, example: {companyname}:test,{otpcode}:1234
    :type data: str
    :param Method: Specifies the HTTP method used to request the required URL once the Short Code message is sent.
    :type Method: str
    :param MessageStatusCallback: URL that can be requested to receive notification when Short Code message was sent.
    :type MessageStatusCallback: str

    :rtype: str
    """
    return 'do some magic!'


def shortcode_updateshortcode(Shortcode, FriendlyName=None, CallbackUrl=None, CallbackMethod=None, FallbackUrl=None, FallbackUrlMethod=None):  # noqa: E501
    """Update Shortcode

    Update Assignment # noqa: E501

    :param Shortcode: List of valid shortcode to your Ytel account
    :type Shortcode: str
    :param FriendlyName: User generated name of the shortcode
    :type FriendlyName: str
    :param CallbackUrl: URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
    :type CallbackUrl: str
    :param CallbackMethod: Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
    :type CallbackMethod: str
    :param FallbackUrl: URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
    :type FallbackUrl: str
    :param FallbackUrlMethod: Specifies the HTTP method used to request the required FallbackUrl once call connects.
    :type FallbackUrlMethod: str

    :rtype: str
    """
    return 'do some magic!'


def shortcode_viewshortcode(Shortcode):  # noqa: E501
    """View Shortcode

    The response returned here contains all resource properties associated with the given Shortcode. # noqa: E501

    :param Shortcode: List of valid Shortcode to your Ytel account
    :type Shortcode: str

    :rtype: str
    """
    return 'do some magic!'


def template_lists(type=None, page=None, pagesize=None, Shortcode=None):  # noqa: E501
    """List Templates

    List Shortcode Templates by Type # noqa: E501

    :param type: The type (category) of template Valid values: marketing, authorization
    :type type: str
    :param page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type page: int
    :param pagesize: The count of objects to return per page.
    :type pagesize: int
    :param Shortcode: Only list templates of type
    :type Shortcode: str

    :rtype: str
    """
    return 'do some magic!'


def template_view(TemplateId):  # noqa: E501
    """View Template

    View a Shared ShortCode Template # noqa: E501

    :param TemplateId: The unique identifier for a template object
    :type TemplateId: str

    :rtype: str
    """
    return 'do some magic!'
