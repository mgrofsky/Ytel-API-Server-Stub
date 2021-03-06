import connexion
import six

from swagger_server import util


def postcard_createpostcard(to, _from, attachbyid, front, back, message, setting, description=None, htmldata=None):  # noqa: E501
    """Create Postcard

    Create, print, and mail a postcard to an address. The postcard front must be supplied as a PDF, image, or an HTML string. The back can be a PDF, image, HTML string, or it can be automatically generated by supplying a custom message. # noqa: E501

    :param to: The AddressId or an object structured when creating an address by addresses/Create.
    :type to: str
    :param _from: The AddressId or an object structured when creating an address by addresses/Create.
    :type _from: str
    :param attachbyid: Set an existing postcard by attaching its PostcardId.
    :type attachbyid: str
    :param front: A 4.25\&quot;x6.25\&quot; or 6.25\&quot;x11.25\&quot; image to use as the front of the postcard.  This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.
    :type front: str
    :param back: A 4.25\&quot;x6.25\&quot; or 6.25\&quot;x11.25\&quot; image to use as the back of the postcard, supplied as a URL, local file, or HTML string.  This allows you to customize your back design, but we will still insert the recipient address for you.
    :type back: str
    :param message: The message for the back of the postcard with a maximum of 350 characters.
    :type message: str
    :param setting: Code for the dimensions of the media to be printed.
    :type setting: str
    :param description: A description for the postcard.
    :type description: str
    :param htmldata: A string value that contains HTML markup.
    :type htmldata: str

    :rtype: str
    """
    return 'do some magic!'


def postcard_deletepostcard(postcardid):  # noqa: E501
    """Delete Postcard

    Remove a postcard object. # noqa: E501

    :param postcardid: The unique identifier of a postcard object.
    :type postcardid: str

    :rtype: str
    """
    return 'do some magic!'


def postcard_listpostcard(page=None, pagesize=None, postcardid=None, dateCreated=None):  # noqa: E501
    """List Postcards

    Retrieve a list of postcard objects. The postcards objects are sorted by creation date, with the most recently created postcards appearing first. # noqa: E501

    :param page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type page: int
    :param pagesize: The count of objects to return per page.
    :type pagesize: int
    :param postcardid: The unique identifier for a postcard object.
    :type postcardid: str
    :param dateCreated: The date the postcard was created.
    :type dateCreated: str

    :rtype: str
    """
    return 'do some magic!'


def postcard_viewpostcard(postcardid):  # noqa: E501
    """View Postcard

    Retrieve a postcard object by its PostcardId. # noqa: E501

    :param postcardid: The unique identifier for a postcard object.
    :type postcardid: str

    :rtype: str
    """
    return 'do some magic!'
