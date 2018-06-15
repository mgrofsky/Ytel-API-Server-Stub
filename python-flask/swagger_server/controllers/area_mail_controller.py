import connexion
import six

from swagger_server import util


def areamail_create(routes, attachbyid, front, back, description=None, targettype=None, htmldata=None):  # noqa: E501
    """Create AreaMail

    Create a new AreaMail object. # noqa: E501

    :param routes: List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043
    :type routes: str
    :param attachbyid: Set an existing areamail by attaching its AreamailId.
    :type attachbyid: str
    :param front: The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required
    :type front: str
    :param back: The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.
    :type back: str
    :param description: A string value to use as a description for this AreaMail item.
    :type description: str
    :param targettype: The delivery location type.
    :type targettype: str
    :param htmldata: A string value that contains HTML markup.
    :type htmldata: str

    :rtype: str
    """
    return 'do some magic!'


def areamail_delete(areamailid):  # noqa: E501
    """Delete AreaMail

    Remove an AreaMail object by its AreaMailId. # noqa: E501

    :param areamailid: The unique identifier for an AreaMail object.
    :type areamailid: str

    :rtype: str
    """
    return 'do some magic!'


def areamail_lists(page=None, pagesize=None, areamailsid=None, dateCreated=None):  # noqa: E501
    """List AreaMails

    Retrieve a list of AreaMail objects. # noqa: E501

    :param page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type page: int
    :param pagesize: The count of objects to return per page.
    :type pagesize: int
    :param areamailsid: The unique identifier for an AreaMail object.
    :type areamailsid: str
    :param dateCreated: The date the AreaMail was created.
    :type dateCreated: str

    :rtype: str
    """
    return 'do some magic!'


def areamail_view(areamailid):  # noqa: E501
    """View AreaMail

    Retrieve an AreaMail object by its AreaMailId. # noqa: E501

    :param areamailid: The unique identifier for an AreaMail object.
    :type areamailid: str

    :rtype: str
    """
    return 'do some magic!'
