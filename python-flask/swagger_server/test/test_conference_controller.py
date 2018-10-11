# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestConferenceController(BaseTestCase):
    """ConferenceController integration test stubs"""

    def test_conferences_add_participant(self):
        """Test case for conferences_add_participant

        Add Participant
        """
        data = dict(ConferenceSid='ConferenceSid_example',
                    ParticipantNumber='ParticipantNumber_example',
                    Muted=true,
                    Deaf=true)
        response = self.client.open(
            '/api/v3/conferences/addParticipant.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_conferences_create_conference(self):
        """Test case for conferences_create_conference

        Create Conference
        """
        query_string = [('Url', 'Url_example')]
        data = dict(From='From_example',
                    To='To_example',
                    Method='POST',
                    StatusCallBackUrl='StatusCallBackUrl_example',
                    StatusCallBackMethod='StatusCallBackMethod_example',
                    FallbackUrl='FallbackUrl_example',
                    FallbackMethod='FallbackMethod_example',
                    Record=true,
                    RecordCallBackUrl='RecordCallBackUrl_example',
                    RecordCallBackMethod='RecordCallBackMethod_example',
                    ScheduleTime='ScheduleTime_example',
                    Timeout=56)
        response = self.client.open(
            '/api/v3/conferences/createConference.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_conferences_deaf_mute_participant(self):
        """Test case for conferences_deaf_mute_participant

        Silence Participant
        """
        data = dict(conferenceSid='conferenceSid_example',
                    ParticipantSid='ParticipantSid_example',
                    Muted=true,
                    Deaf=true)
        response = self.client.open(
            '/api/v3/conferences/deafMuteParticipant.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_conferences_hangup_participant(self):
        """Test case for conferences_hangup_participant

        Hangup Participant
        """
        query_string = [('ParticipantSid', 'ParticipantSid_example')]
        data = dict(ConferenceSid='ConferenceSid_example')
        response = self.client.open(
            '/api/v3/conferences/hangupParticipant.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_conferences_list_participant(self):
        """Test case for conferences_list_participant

        List Participants
        """
        data = dict(ConferenceSid='ConferenceSid_example',
                    Page=1,
                    Pagesize=10,
                    Muted=true,
                    Deaf=true)
        response = self.client.open(
            '/api/v3/conferences/listParticipant.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_conferences_listconference(self):
        """Test case for conferences_listconference

        List Conferences
        """
        data = dict(page=1,
                    pagesize=10,
                    FriendlyName='FriendlyName_example',
                    DateCreated='DateCreated_example')
        response = self.client.open(
            '/api/v3/conferences/listconference.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_conferences_play_audio(self):
        """Test case for conferences_play_audio

        Play Audio
        """
        data = dict(ConferenceSid='ConferenceSid_example',
                    ParticipantSid='ParticipantSid_example',
                    AudioUrl='AudioUrl_example')
        response = self.client.open(
            '/api/v3/conferences/playAudio.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_conferences_view_participant(self):
        """Test case for conferences_view_participant

        View Participant
        """
        data = dict(ConferenceSid='ConferenceSid_example',
                    ParticipantSid='ParticipantSid_example')
        response = self.client.open(
            '/api/v3/conferences/viewParticipant.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_conferences_viewconference(self):
        """Test case for conferences_viewconference

        View Conference
        """
        data = dict(ConferenceSid='ConferenceSid_example')
        response = self.client.open(
            '/api/v3/conferences/viewconference.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
