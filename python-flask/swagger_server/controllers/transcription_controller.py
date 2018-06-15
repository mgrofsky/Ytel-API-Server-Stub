import connexion
import six

from swagger_server import util


def transcriptions_audiourltranscription(audiourl):  # noqa: E501
    """Transcribe Audio URL

    Transcribe an audio recording from a file. # noqa: E501

    :param audiourl: URL pointing to the location of the audio file that is to be transcribed.
    :type audiourl: str

    :rtype: str
    """
    return 'do some magic!'


def transcriptions_listtranscription(page=None, pagesize=None, status=None, dateTranscribed=None):  # noqa: E501
    """List Transcriptions

    Retrieve a list of transcription objects for your Ytel account. # noqa: E501

    :param page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type page: int
    :param pagesize: The count of objects to return per page.
    :type pagesize: int
    :param status: The state of the transcription.
    :type status: str
    :param dateTranscribed: The date the transcription took place.
    :type dateTranscribed: str

    :rtype: str
    """
    return 'do some magic!'


def transcriptions_recordingtranscription(recordingSid):  # noqa: E501
    """Transcribe Recording

    Transcribe a recording by its RecordingSid. # noqa: E501

    :param recordingSid: The unique identifier for a recording object.
    :type recordingSid: str

    :rtype: str
    """
    return 'do some magic!'


def transcriptions_viewtranscription(transcriptionsid):  # noqa: E501
    """View Transcription

    Retrieve information about a transaction by its TranscriptionSid. # noqa: E501

    :param transcriptionsid: The unique identifier for a transcription object.
    :type transcriptionsid: str

    :rtype: str
    """
    return 'do some magic!'
