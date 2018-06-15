import connexion
import six

from swagger_server import util


def user_createsubaccount(FirstName, LastName, Email, FriendlyName, Password):  # noqa: E501
    """Create Subaccount

    Create a sub user account under the parent account # noqa: E501

    :param FirstName: Sub account user first name
    :type FirstName: str
    :param LastName: sub account user last name
    :type LastName: str
    :param Email: Sub account email address
    :type Email: str
    :param FriendlyName: Descriptive name of the sub account
    :type FriendlyName: str
    :param Password: The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.
    :type Password: str

    :rtype: str
    """
    return 'do some magic!'


def user_deletesubaccount(SubAccountSID, MergeNumber):  # noqa: E501
    """Delete Subaccount

    Delete sub account or merge numbers into parent # noqa: E501

    :param SubAccountSID: The SubaccountSid to be deleted
    :type SubAccountSID: str
    :param MergeNumber: 0 to delete or 1 to merge numbers to parent account.
    :type MergeNumber: str

    :rtype: str
    """
    return 'do some magic!'


def user_subaccountactivation(SubAccountSID, Activate):  # noqa: E501
    """Toggle Subaccount Status

    Suspend or unsuspend # noqa: E501

    :param SubAccountSID: The SubaccountSid to be activated or suspended
    :type SubAccountSID: str
    :param Activate: 0 to suspend or 1 to activate
    :type Activate: str

    :rtype: str
    """
    return 'do some magic!'
