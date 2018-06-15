import connexion
import six

from swagger_server import util


def carrier_lookup(PhoneNumber):  # noqa: E501
    """Lookup Carrier

    Get the Carrier Lookup # noqa: E501

    :param PhoneNumber: A valid 10-digit number (E.164 format).
    :type PhoneNumber: str

    :rtype: str
    """
    return 'do some magic!'


def carrier_lookuplist(Page=None, PageSize=None):  # noqa: E501
    """Carrier Results

    Retrieve a list of carrier lookup objects. # noqa: E501

    :param Page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type Page: int
    :param PageSize: The count of objects to return per page.
    :type PageSize: int

    :rtype: str
    """
    return 'do some magic!'
