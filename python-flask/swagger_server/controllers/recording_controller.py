import connexion
import six

from swagger_server import util


def recording_deleterecording(recordingsid):  # noqa: E501
    """Delete Recording

    Remove a recording from your Ytel account. # noqa: E501

    :param recordingsid: The unique identifier for a recording.
    :type recordingsid: str

    :rtype: str
    """
    return 'do some magic!'


def recording_listrecording(page=None, pagesize=None, Datecreated=None, callsid=None):  # noqa: E501
    """List Recordings

    Retrieve a list of recording objects. # noqa: E501

    :param page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type page: int
    :param pagesize: The count of objects to return per page.
    :type pagesize: int
    :param Datecreated: Filter results by creation date
    :type Datecreated: str
    :param callsid: The unique identifier for a call.
    :type callsid: str

    :rtype: str
    """
    return 'do some magic!'


def recording_viewrecording(recordingsid):  # noqa: E501
    """View Recording

    Retrieve the recording of a call by its RecordingSid. This resource will return information regarding the call such as start time, end time, duration, and so forth. # noqa: E501

    :param recordingsid: The unique identifier for the recording.
    :type recordingsid: str

    :rtype: str
    """
    return 'do some magic!'
