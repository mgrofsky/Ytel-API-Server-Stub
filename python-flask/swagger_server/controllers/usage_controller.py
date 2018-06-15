import connexion
import six

from swagger_server import util


def usage_listusage(ProductCode=None, startDate=None, endDate=None, IncludeSubAccounts=None):  # noqa: E501
    """List Usage

    Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests. # noqa: E501

    :param ProductCode: Filter usage results by product type.
    :type ProductCode: str
    :param startDate: Filter usage objects by start date.
    :type startDate: str
    :param endDate: Filter usage objects by end date.
    :type endDate: str
    :param IncludeSubAccounts: Will include all subaccount usage data
    :type IncludeSubAccounts: str

    :rtype: str
    """
    return 'do some magic!'
