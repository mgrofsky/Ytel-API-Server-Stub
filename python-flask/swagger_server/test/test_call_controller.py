# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestCallController(BaseTestCase):
    """CallController integration test stubs"""

    def test_calls_groupcall(self):
        """Test case for calls_groupcall

        Group Call
        """
        data = dict(From='From_example',
                    To='To_example',
                    Url='Url_example',
                    GroupConfirmKey='GroupConfirmKey_example',
                    GroupConfirmFile='GroupConfirmFile_example',
                    Method='Method_example',
                    StatusCallBackUrl='StatusCallBackUrl_example',
                    StatusCallBackMethod='StatusCallBackMethod_example',
                    FallBackUrl='FallBackUrl_example',
                    FallBackMethod='FallBackMethod_example',
                    HeartBeatUrl='HeartBeatUrl_example',
                    HeartBeatMethod='HeartBeatMethod_example',
                    Timeout=56,
                    PlayDtmf='PlayDtmf_example',
                    HideCallerId='HideCallerId_example',
                    Record=true,
                    RecordCallBackUrl='RecordCallBackUrl_example',
                    RecordCallBackMethod='RecordCallBackMethod_example',
                    Transcribe=true,
                    TranscribeCallBackUrl='TranscribeCallBackUrl_example')
        response = self.client.open(
            '/api/v3/calls/groupcall.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_calls_interruptcalls(self):
        """Test case for calls_interruptcalls

        Interrupt Call
        """
        data = dict(CallSid='CallSid_example',
                    Url='Url_example',
                    Method='Method_example',
                    Status='Status_example')
        response = self.client.open(
            '/api/v3/calls/interruptcalls.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_calls_listcalls(self):
        """Test case for calls_listcalls

        List Calls
        """
        data = dict(Page=1,
                    PageSize=10,
                    To='To_example',
                    From='From_example',
                    DateCreated='DateCreated_example')
        response = self.client.open(
            '/api/v3/calls/listcalls.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_calls_makecall(self):
        """Test case for calls_makecall

        Make Call
        """
        data = dict(From='From_example',
                    To='To_example',
                    Url='Url_example',
                    Method='Method_example',
                    StatusCallBackUrl='StatusCallBackUrl_example',
                    StatusCallBackMethod='StatusCallBackMethod_example',
                    FallBackUrl='FallBackUrl_example',
                    FallBackMethod='FallBackMethod_example',
                    HeartBeatUrl='HeartBeatUrl_example',
                    HeartBeatMethod='HeartBeatMethod_example',
                    Timeout=56,
                    PlayDtmf='PlayDtmf_example',
                    HideCallerId=true,
                    Record=true,
                    RecordCallBackUrl='RecordCallBackUrl_example',
                    RecordCallBackMethod='RecordCallBackMethod_example',
                    Transcribe=true,
                    TranscribeCallBackUrl='TranscribeCallBackUrl_example',
                    IfMachine='IfMachine_example',
                    IfMachineUrl='IfMachineUrl_example',
                    IfMachineMethod='IfMachineMethod_example',
                    Feedback=true,
                    SurveyId='SurveyId_example')
        response = self.client.open(
            '/api/v3/calls/makecall.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_calls_makervm(self):
        """Test case for calls_makervm

        Send RVM
        """
        data = dict(From='From_example',
                    RVMCallerId='RVMCallerId_example',
                    To='To_example',
                    VoiceMailURL='VoiceMailURL_example',
                    Method='GET',
                    StatusCallBackUrl='StatusCallBackUrl_example',
                    StatsCallBackMethod='StatsCallBackMethod_example')
        response = self.client.open(
            '/api/v3/calls/makervm.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_calls_playaudios(self):
        """Test case for calls_playaudios

        Play Audio
        """
        data = dict(CallSid='CallSid_example',
                    AudioUrl='AudioUrl_example',
                    SayText='SayText_example',
                    Length=56,
                    Direction='Direction_example',
                    Mix=true)
        response = self.client.open(
            '/api/v3/calls/playaudios.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_calls_recordcalls(self):
        """Test case for calls_recordcalls

        Record Call
        """
        data = dict(CallSid='CallSid_example',
                    Record=true,
                    Direction='Direction_example',
                    TimeLimit=56,
                    CallBackUrl='CallBackUrl_example',
                    Fileformat='Fileformat_example')
        response = self.client.open(
            '/api/v3/calls/recordcalls.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_calls_senddigits(self):
        """Test case for calls_senddigits

        Play DTMF
        """
        data = dict(CallSid='CallSid_example',
                    PlayDtmf='PlayDtmf_example',
                    PlayDtmfDirection='PlayDtmfDirection_example')
        response = self.client.open(
            '/api/v3/calls/senddigits.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_calls_viewcalldetail(self):
        """Test case for calls_viewcalldetail

        View Call
        """
        data = dict(callSid='callSid_example')
        response = self.client.open(
            '/api/v3/calls/viewcalldetail.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_calls_viewcalls(self):
        """Test case for calls_viewcalls

        View Call
        """
        data = dict(callsid='callsid_example')
        response = self.client.open(
            '/api/v3/calls/viewcalls.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_calls_voiceeffect(self):
        """Test case for calls_voiceeffect

        Voice Effect
        """
        data = dict(CallSid='CallSid_example',
                    AudioDirection='AudioDirection_example',
                    PitchSemiTones=1.2,
                    PitchOctaves=1.2,
                    Pitch=1.2,
                    Rate=1.2,
                    Tempo=1.2)
        response = self.client.open(
            '/api/v3/calls/voiceeffect.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
