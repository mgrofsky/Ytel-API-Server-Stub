import connexion
import six

from swagger_server import util


def calls_groupcall(From, To, Url, GroupConfirmKey, GroupConfirmFile, Method=None, StatusCallBackUrl=None, StatusCallBackMethod=None, FallBackUrl=None, FallBackMethod=None, HeartBeatUrl=None, HeartBeatMethod=None, Timeout=None, PlayDtmf=None, HideCallerId=None, Record=None, RecordCallBackUrl=None, RecordCallBackMethod=None, Transcribe=None, TranscribeCallBackUrl=None):  # noqa: E501
    """Group Call

    Group Call # noqa: E501

    :param From: This number to display on Caller ID as calling
    :type From: str
    :param To: Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222
    :type To: str
    :param Url: URL requested once the call connects
    :type Url: str
    :param GroupConfirmKey: Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, *
    :type GroupConfirmKey: str
    :param GroupConfirmFile: Specify the audio file you want to play when the called party picks up the call
    :type GroupConfirmFile: str
    :param Method: Specifies the HTTP method used to request the required URL once call connects.
    :type Method: str
    :param StatusCallBackUrl: URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
    :type StatusCallBackUrl: str
    :param StatusCallBackMethod: Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
    :type StatusCallBackMethod: str
    :param FallBackUrl: URL requested if the initial Url parameter fails or encounters an error
    :type FallBackUrl: str
    :param FallBackMethod: Specifies the HTTP method used to request the required FallbackUrl once call connects.
    :type FallBackMethod: str
    :param HeartBeatUrl: URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information.
    :type HeartBeatUrl: str
    :param HeartBeatMethod: Specifies the HTTP method used to request HeartbeatUrl.
    :type HeartBeatMethod: str
    :param Timeout: Time (in seconds) we should wait while the call is ringing before canceling the call
    :type Timeout: int
    :param PlayDtmf: DTMF Digits to play to the call once it connects. 0-9, #, or *
    :type PlayDtmf: str
    :param HideCallerId: Specifies if the caller id will be hidden
    :type HideCallerId: str
    :param Record: Specifies if the call should be recorded
    :type Record: bool
    :param RecordCallBackUrl: Recording parameters will be sent here upon completion
    :type RecordCallBackUrl: str
    :param RecordCallBackMethod: Method used to request the RecordCallback URL.
    :type RecordCallBackMethod: str
    :param Transcribe: Specifies if the call recording should be transcribed
    :type Transcribe: bool
    :param TranscribeCallBackUrl: Transcription parameters will be sent here upon completion
    :type TranscribeCallBackUrl: str

    :rtype: str
    """
    return 'do some magic!'


def calls_interruptcalls(CallSid, Url=None, Method=None, Status=None):  # noqa: E501
    """Interrupt Call

    Interrupt the Call by Call Sid # noqa: E501

    :param CallSid: The unique identifier for voice call that is in progress.
    :type CallSid: str
    :param Url: URL the in-progress call will be redirected to
    :type Url: str
    :param Method: The method used to request the above Url parameter
    :type Method: str
    :param Status: Status to set the in-progress call to
    :type Status: str

    :rtype: str
    """
    return 'do some magic!'


def calls_listcalls(Page=None, PageSize=None, To=None, From=None, DateCreated=None):  # noqa: E501
    """List Calls

    A list of calls associated with your Ytel account # noqa: E501

    :param Page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    :type Page: int
    :param PageSize: Number of individual resources listed in the response per page
    :type PageSize: int
    :param To: Filter calls that were sent to this 10-digit number (E.164 format).
    :type To: str
    :param From: Filter calls that were sent from this 10-digit number (E.164 format).
    :type From: str
    :param DateCreated: Return calls that are from a specified date.
    :type DateCreated: str

    :rtype: str
    """
    return 'do some magic!'


def calls_makecall(From, To, Url, Method=None, StatusCallBackUrl=None, StatusCallBackMethod=None, FallBackUrl=None, FallBackMethod=None, HeartBeatUrl=None, HeartBeatMethod=None, Timeout=None, PlayDtmf=None, HideCallerId=None, Record=None, RecordCallBackUrl=None, RecordCallBackMethod=None, Transcribe=None, TranscribeCallBackUrl=None, IfMachine=None, IfMachineUrl=None, IfMachineMethod=None, Feedback=None, SurveyId=None):  # noqa: E501
    """Make Call

    You can experiment with initiating a call through Ytel and view the request response generated when doing so and get the response in json # noqa: E501

    :param From: A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
    :type From: str
    :param To: To number
    :type To: str
    :param Url: URL requested once the call connects
    :type Url: str
    :param Method: Specifies the HTTP method used to request the required URL once call connects.
    :type Method: str
    :param StatusCallBackUrl: URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
    :type StatusCallBackUrl: str
    :param StatusCallBackMethod: Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
    :type StatusCallBackMethod: str
    :param FallBackUrl: URL requested if the initial Url parameter fails or encounters an error
    :type FallBackUrl: str
    :param FallBackMethod: Specifies the HTTP method used to request the required FallbackUrl once call connects.
    :type FallBackMethod: str
    :param HeartBeatUrl: URL that can be requested every 60 seconds during the call to notify of elapsed tim
    :type HeartBeatUrl: str
    :param HeartBeatMethod: Specifies the HTTP method used to request HeartbeatUrl.
    :type HeartBeatMethod: str
    :param Timeout: Time (in seconds) Ytel should wait while the call is ringing before canceling the call
    :type Timeout: int
    :param PlayDtmf: DTMF Digits to play to the call once it connects. 0-9, #, or *
    :type PlayDtmf: str
    :param HideCallerId: Specifies if the caller id will be hidden
    :type HideCallerId: bool
    :param Record: Specifies if the call should be recorded
    :type Record: bool
    :param RecordCallBackUrl: Recording parameters will be sent here upon completion
    :type RecordCallBackUrl: str
    :param RecordCallBackMethod: Method used to request the RecordCallback URL.
    :type RecordCallBackMethod: str
    :param Transcribe: Specifies if the call recording should be transcribed
    :type Transcribe: bool
    :param TranscribeCallBackUrl: Transcription parameters will be sent here upon completion
    :type TranscribeCallBackUrl: str
    :param IfMachine: How Ytel should handle the receiving numbers voicemail machine
    :type IfMachine: str
    :param IfMachineUrl: URL requested when IfMachine&#x3D;continue
    :type IfMachineUrl: str
    :param IfMachineMethod: Method used to request the IfMachineUrl.
    :type IfMachineMethod: str
    :param Feedback: Specify if survey should be enable or not
    :type Feedback: bool
    :param SurveyId: The unique identifier for the survey.
    :type SurveyId: str

    :rtype: str
    """
    return 'do some magic!'


def calls_makervm(From, RVMCallerId, To, VoiceMailURL, Method=None, StatusCallBackUrl=None, StatsCallBackMethod=None):  # noqa: E501
    """Send RVM

    Initiate an outbound Ringless Voicemail through Ytel. # noqa: E501

    :param From: A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
    :type From: str
    :param RVMCallerId: A required secondary Caller ID for RVM to work.
    :type RVMCallerId: str
    :param To: A valid number (E.164 format) that will receive the phone call.
    :type To: str
    :param VoiceMailURL: The URL requested once the RVM connects. A set of default parameters will be sent here.
    :type VoiceMailURL: str
    :param Method: Specifies the HTTP method used to request the required URL once call connects.
    :type Method: str
    :param StatusCallBackUrl: URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
    :type StatusCallBackUrl: str
    :param StatsCallBackMethod: Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
    :type StatsCallBackMethod: str

    :rtype: str
    """
    return 'do some magic!'


def calls_playaudios(CallSid, AudioUrl, SayText, Length=None, Direction=None, Mix=None):  # noqa: E501
    """Play Audio

    Play Audio from a url # noqa: E501

    :param CallSid: The unique identifier of each call resource
    :type CallSid: str
    :param AudioUrl: URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav
    :type AudioUrl: str
    :param SayText: Valid alphanumeric string that should be played to the In-progress call.
    :type SayText: str
    :param Length: Time limit in seconds for audio play back
    :type Length: int
    :param Direction: The leg of the call audio will be played to
    :type Direction: str
    :param Mix: If false, all other audio will be muted
    :type Mix: bool

    :rtype: str
    """
    return 'do some magic!'


def calls_recordcalls(CallSid, Record, Direction=None, TimeLimit=None, CallBackUrl=None, Fileformat=None):  # noqa: E501
    """Record Call

    Start or stop recording of an in-progress voice call. # noqa: E501

    :param CallSid: The unique identifier of each call resource
    :type CallSid: str
    :param Record: Set true to initiate recording or false to terminate recording
    :type Record: bool
    :param Direction: The leg of the call to record
    :type Direction: str
    :param TimeLimit: Time in seconds the recording duration should not exceed
    :type TimeLimit: int
    :param CallBackUrl: URL consulted after the recording completes
    :type CallBackUrl: str
    :param Fileformat: Format of the recording file. Can be .mp3 or .wav
    :type Fileformat: str

    :rtype: str
    """
    return 'do some magic!'


def calls_senddigits(CallSid, PlayDtmf, PlayDtmfDirection=None):  # noqa: E501
    """Play DTMF

    Play Dtmf and send the Digit # noqa: E501

    :param CallSid: The unique identifier of each call resource
    :type CallSid: str
    :param PlayDtmf: DTMF digits to play to the call. 0-9, #, *, W, or w
    :type PlayDtmf: str
    :param PlayDtmfDirection: The leg of the call DTMF digits should be sent to
    :type PlayDtmfDirection: str

    :rtype: str
    """
    return 'do some magic!'


def calls_viewcalldetail(callSid):  # noqa: E501
    """View Call Details

    Retrieve a single voice call’s information by its CallSid. # noqa: E501

    :param callSid: The unique identifier for the voice call.
    :type callSid: str

    :rtype: str
    """
    return 'do some magic!'


def calls_viewcalls(callsid):  # noqa: E501
    """View Call

    Retrieve a single voice call’s information by its CallSid. # noqa: E501

    :param callsid: The unique identifier for the voice call.
    :type callsid: str

    :rtype: str
    """
    return 'do some magic!'


def calls_voiceeffect(CallSid, AudioDirection=None, PitchSemiTones=None, PitchOctaves=None, Pitch=None, Rate=None, Tempo=None):  # noqa: E501
    """Voice Effect

    Add audio voice effects to the an in-progress voice call. # noqa: E501

    :param CallSid: The unique identifier for the in-progress voice call.
    :type CallSid: str
    :param AudioDirection: The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream.
    :type AudioDirection: str
    :param PitchSemiTones: Set the pitch in semitone (half-step) intervals. Value between -14 and 14
    :type PitchSemiTones: float
    :param PitchOctaves: Set the pitch in octave intervals.. Value between -1 and 1
    :type PitchOctaves: float
    :param Pitch: Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0
    :type Pitch: float
    :param Rate: Set the rate for audio. The lower the value, the lower the rate. value greater than 0
    :type Rate: float
    :param Tempo: Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0
    :type Tempo: float

    :rtype: str
    """
    return 'do some magic!'
