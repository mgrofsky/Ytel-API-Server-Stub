import connexion
import six

from swagger_server import util


def conferences_add_participant(ConferenceSid, ParticipantNumber, Muted=None, Deaf=None):  # noqa: E501
    """Add Participant

    Add Participant in conference  # noqa: E501

    :param ConferenceSid: The unique identifier for a conference object.
    :type ConferenceSid: str
    :param ParticipantNumber: The phone number of the participant to be added.
    :type ParticipantNumber: str
    :param Muted: Specifies if participant should be muted.
    :type Muted: bool
    :param Deaf: Specifies if the participant should hear audio in the conference.
    :type Deaf: bool

    :rtype: str
    """
    return 'do some magic!'


def conferences_create_conference(From, To, Url, Method=None, StatusCallBackUrl=None, StatusCallBackMethod=None, FallbackUrl=None, FallbackMethod=None, Record=None, RecordCallBackUrl=None, RecordCallBackMethod=None, ScheduleTime=None, Timeout=None):  # noqa: E501
    """Create Conference

    Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so. # noqa: E501

    :param From: A valid 10-digit number (E.164 format) that will be initiating the conference call.
    :type From: str
    :param To: A valid 10-digit number (E.164 format) that is to receive the conference call.
    :type To: str
    :param Url: URL requested once the conference connects
    :type Url: str
    :param Method: Specifies the HTTP method used to request the required URL once call connects.
    :type Method: str
    :param StatusCallBackUrl: URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished.
    :type StatusCallBackUrl: str
    :param StatusCallBackMethod: Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
    :type StatusCallBackMethod: str
    :param FallbackUrl: URL requested if the initial Url parameter fails or encounters an error
    :type FallbackUrl: str
    :param FallbackMethod: Specifies the HTTP method used to request the required FallbackUrl once call connects.
    :type FallbackMethod: str
    :param Record: Specifies if the conference should be recorded.
    :type Record: bool
    :param RecordCallBackUrl: Recording parameters will be sent here upon completion.
    :type RecordCallBackUrl: str
    :param RecordCallBackMethod: Specifies the HTTP method used to request the required URL once conference connects.
    :type RecordCallBackMethod: str
    :param ScheduleTime: Schedule conference in future. Schedule time must be greater than current time
    :type ScheduleTime: str
    :param Timeout: The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set.
    :type Timeout: int

    :rtype: str
    """
    return 'do some magic!'


def conferences_deaf_mute_participant(conferenceSid, ParticipantSid, Muted=None, Deaf=None):  # noqa: E501
    """Silence Participant

    Deaf Mute Participant # noqa: E501

    :param conferenceSid: ID of the active conference
    :type conferenceSid: str
    :param ParticipantSid: ID of an active participant
    :type ParticipantSid: str
    :param Muted: Mute a participant
    :type Muted: bool
    :param Deaf: Make it so a participant cant hear
    :type Deaf: bool

    :rtype: str
    """
    return 'do some magic!'


def conferences_hangup_participant(ConferenceSid, ParticipantSid):  # noqa: E501
    """Hangup Participant

    Remove a participant from a conference. # noqa: E501

    :param ConferenceSid: The unique identifier for a conference object.
    :type ConferenceSid: str
    :param ParticipantSid: The unique identifier for a participant object.
    :type ParticipantSid: str

    :rtype: str
    """
    return 'do some magic!'


def conferences_list_participant(ConferenceSid, Page=None, Pagesize=None, Muted=None, Deaf=None):  # noqa: E501
    """List Participants

    Retrieve a list of participants for an in-progress conference. # noqa: E501

    :param ConferenceSid: The unique identifier for a conference.
    :type ConferenceSid: str
    :param Page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type Page: int
    :param Pagesize: The count of objects to return per page.
    :type Pagesize: int
    :param Muted: Specifies if participant should be muted.
    :type Muted: bool
    :param Deaf: Specifies if the participant should hear audio in the conference.
    :type Deaf: bool

    :rtype: str
    """
    return 'do some magic!'


def conferences_listconference(page=None, pagesize=None, FriendlyName=None, DateCreated=None):  # noqa: E501
    """List Conferences

    Retrieve a list of conference objects. # noqa: E501

    :param page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type page: int
    :param pagesize: Number of individual resources listed in the response per page
    :type pagesize: int
    :param FriendlyName: Only return conferences with the specified FriendlyName
    :type FriendlyName: str
    :param DateCreated: Conference created date
    :type DateCreated: str

    :rtype: str
    """
    return 'do some magic!'


def conferences_play_audio(ConferenceSid, ParticipantSid, AudioUrl):  # noqa: E501
    """Play Audio

    Play an audio file during a conference. # noqa: E501

    :param ConferenceSid: The unique identifier for a conference object.
    :type ConferenceSid: str
    :param ParticipantSid: The unique identifier for a participant object.
    :type ParticipantSid: str
    :param AudioUrl: The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon.
    :type AudioUrl: str

    :rtype: str
    """
    return 'do some magic!'


def conferences_view_participant(ConferenceSid, ParticipantSid):  # noqa: E501
    """View Participant

    Retrieve information about a participant by its ParticipantSid. # noqa: E501

    :param ConferenceSid: The unique identifier for a conference object.
    :type ConferenceSid: str
    :param ParticipantSid: The unique identifier for a participant object.
    :type ParticipantSid: str

    :rtype: str
    """
    return 'do some magic!'


def conferences_viewconference(ConferenceSid):  # noqa: E501
    """View Conference

    Retrieve information about a conference by its ConferenceSid. # noqa: E501

    :param ConferenceSid: The unique identifier of each conference resource
    :type ConferenceSid: str

    :rtype: str
    """
    return 'do some magic!'
