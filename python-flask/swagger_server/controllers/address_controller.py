import connexion
import six

from swagger_server import util


def address_createaddress(Name, Address, Country, State, City, Zip, Description=None, email=None, Phone=None):  # noqa: E501
    """Create Address

    To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID. # noqa: E501

    :param Name: Name of user
    :type Name: str
    :param Address: Address of user.
    :type Address: str
    :param Country: Must be a 2 letter country short-name code (ISO 3166)
    :type Country: str
    :param State: Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.
    :type State: str
    :param City: City Name.
    :type City: str
    :param Zip: Zip code of city.
    :type Zip: str
    :param Description: Description of addresses.
    :type Description: str
    :param email: Email Id of user.
    :type email: str
    :param Phone: Phone number of user.
    :type Phone: str

    :rtype: str
    """
    return 'do some magic!'


def address_deleteaddress(addressid):  # noqa: E501
    """Delete Address

    To delete Address to your address book # noqa: E501

    :param addressid: The identifier of the address to be deleted.
    :type addressid: str

    :rtype: str
    """
    return 'do some magic!'


def address_listaddress(page=None, pagesize=None, addressid=None, dateCreated=None):  # noqa: E501
    """List Addresses

    List All Address  # noqa: E501

    :param page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type page: int
    :param pagesize: How many results to return, default is 10, max is 100, must be an integer
    :type pagesize: int
    :param addressid: addresses Sid
    :type addressid: str
    :param dateCreated: date created address.
    :type dateCreated: str

    :rtype: str
    """
    return 'do some magic!'


def address_verifyaddress(addressid):  # noqa: E501
    """Verify Address

    Validates an address given. # noqa: E501

    :param addressid: The identifier of the address to be verified.
    :type addressid: str

    :rtype: str
    """
    return 'do some magic!'


def address_viewaddress(addressid):  # noqa: E501
    """View Address

    View Address Specific address Book by providing the address id # noqa: E501

    :param addressid: The identifier of the address to be retrieved.
    :type addressid: str

    :rtype: str
    """
    return 'do some magic!'
