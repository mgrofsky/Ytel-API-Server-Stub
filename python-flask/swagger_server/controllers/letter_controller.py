import connexion
import six

from swagger_server import util


def letter_create(to, _from, attachbyid, file, color, description=None, extraservice=None, doublesided=None, template=None, htmldata=None):  # noqa: E501
    """Create Letter

    Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string. # noqa: E501

    :param to: The AddressId or an object structured when creating an address by addresses/Create.
    :type to: str
    :param _from: The AddressId or an object structured when creating an address by addresses/Create.
    :type _from: str
    :param attachbyid: Set an existing letter by attaching its LetterId.
    :type attachbyid: str
    :param file: File can be a 8.5\&quot;x11\&quot; PDF uploaded file or URL that links to a file.
    :type file: str
    :param color: Specify if letter should be printed in color.
    :type color: str
    :param description: A description for the letter.
    :type description: str
    :param extraservice: Add an extra service to your letter. Options are \&quot;certified\&quot; or \&quot;registered\&quot;. Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50.
    :type extraservice: str
    :param doublesided: Specify if letter should be printed on both sides.
    :type doublesided: str
    :param template: Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page.
    :type template: str
    :param htmldata: A string value that contains HTML markup.
    :type htmldata: str

    :rtype: str
    """
    return 'do some magic!'


def letter_delete(lettersid):  # noqa: E501
    """Delete Letter

    Remove a letter object by its LetterId. # noqa: E501

    :param lettersid: The unique identifier for a letter object.
    :type lettersid: str

    :rtype: str
    """
    return 'do some magic!'


def letter_listsletter(page=None, pagesize=None, lettersid=None, dateCreated=None):  # noqa: E501
    """List Letters

    Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first. # noqa: E501

    :param page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type page: int
    :param pagesize: The count of objects to return per page.
    :type pagesize: int
    :param lettersid: The unique identifier for a letter object.
    :type lettersid: str
    :param dateCreated: The date the letter was created.
    :type dateCreated: str

    :rtype: str
    """
    return 'do some magic!'


def letter_viewletter(lettersid):  # noqa: E501
    """View Letter

    Retrieve a letter object by its LetterSid. # noqa: E501

    :param lettersid: The unique identifier for a letter object.
    :type lettersid: str

    :rtype: str
    """
    return 'do some magic!'
