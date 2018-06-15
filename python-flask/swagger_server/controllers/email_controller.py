import connexion
import six

from swagger_server import util


def email_addunsubscribesemail(email):  # noqa: E501
    """Add Email Unsubscribe

    Add an email to the unsubscribe list # noqa: E501

    :param email: A valid email address that is to be added to the unsubscribe list
    :type email: str

    :rtype: str
    """
    return 'do some magic!'


def email_deleteblocksemail(Email):  # noqa: E501
    """Remove Blocked Address

    Remove an email from blocked emails list. # noqa: E501

    :param Email: The email address to be remove from the blocked list.
    :type Email: str

    :rtype: str
    """
    return 'do some magic!'


def email_deletebouncesemail(Email):  # noqa: E501
    """Remove Bounced Email

    Remove an email address from the bounced list. # noqa: E501

    :param Email: The email address to be remove from the bounced email list.
    :type Email: str

    :rtype: str
    """
    return 'do some magic!'


def email_deleteinvalidemail(Email):  # noqa: E501
    """Remove Invalid Email

    Remove an email from the invalid email list. # noqa: E501

    :param Email: A valid email address that is to be remove from the invalid email list.
    :type Email: str

    :rtype: str
    """
    return 'do some magic!'


def email_deletespamemail(Email):  # noqa: E501
    """Remove Spam Address

    Remove an email from the spam email list. # noqa: E501

    :param Email: A valid email address that is to be remove from the spam list.
    :type Email: str

    :rtype: str
    """
    return 'do some magic!'


def email_deleteunsubscribedemail(email):  # noqa: E501
    """Remove Unsubscribed Email

    Remove an email address from the list of unsubscribed emails. # noqa: E501

    :param email: A valid email address that is to be remove from the unsubscribe list.
    :type email: str

    :rtype: str
    """
    return 'do some magic!'


def email_listblockemail(Offset=None, Limit=None):  # noqa: E501
    """Blocked Emails

    Retrieve a list of emails that have been blocked. # noqa: E501

    :param Offset: The starting point of the list of blocked emails that should be returned.
    :type Offset: str
    :param Limit: The count of results that should be returned.
    :type Limit: str

    :rtype: str
    """
    return 'do some magic!'


def email_listbounceemail(Offset=None, Limit=None):  # noqa: E501
    """Bounced Emails

    Retrieve a list of emails that have bounced. # noqa: E501

    :param Offset: The starting point of the list of bounced emails that should be returned.
    :type Offset: str
    :param Limit: The count of results that should be returned.
    :type Limit: str

    :rtype: str
    """
    return 'do some magic!'


def email_listinvalidemail(Offset=None, Limit=None):  # noqa: E501
    """Invalid Emails

    Retrieve a list of invalid email addresses. # noqa: E501

    :param Offset: The starting point of the list of invalid emails that should be returned.
    :type Offset: str
    :param Limit: The count of results that should be returned.
    :type Limit: str

    :rtype: str
    """
    return 'do some magic!'


def email_listspamemail(Offset=None, Limit=None):  # noqa: E501
    """Spam Emails

    Retrieve a list of emails that are on the spam list. # noqa: E501

    :param Offset: The starting point of the list of spam emails that should be returned.
    :type Offset: str
    :param Limit: The count of results that should be returned.
    :type Limit: str

    :rtype: str
    """
    return 'do some magic!'


def email_listunsubscribedemail(Offset=None, Limit=None):  # noqa: E501
    """List Unsubscribed Emails

    Retrieve a list of email addresses from the unsubscribe list. # noqa: E501

    :param Offset: The starting point of the list of unsubscribed emails that should be returned.
    :type Offset: str
    :param Limit: The count of results that should be returned.
    :type Limit: str

    :rtype: str
    """
    return 'do some magic!'


def email_sendemails(To, Type, Subject, Message, From=None, Cc=None, Bcc=None, Attachment=None):  # noqa: E501
    """Send Email

    Create and submit an email message to one or more email addresses. # noqa: E501

    :param To: A valid address that will receive the email. Multiple addresses can be separated by using commas.
    :type To: str
    :param Type: Specifies the type of email to be sent
    :type Type: str
    :param Subject: The subject of the mail. Must be a valid string.
    :type Subject: str
    :param Message: The email message that is to be sent in the text.
    :type Message: str
    :param From: A valid address that will send the email.
    :type From: str
    :param Cc: Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas.
    :type Cc: str
    :param Bcc: Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas.
    :type Bcc: str
    :param Attachment: A file that is attached to the email. Must be less than 7 MB in size.
    :type Attachment: str

    :rtype: str
    """
    return 'do some magic!'
