# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestTranscriptionController(BaseTestCase):
    """TranscriptionController integration test stubs"""

    def test_transcriptions_audiourltranscription(self):
        """Test case for transcriptions_audiourltranscription

        Transcribe Audio URL
        """
        data = dict(audiourl='audiourl_example')
        response = self.client.open(
            '/api/v3//transcriptions/audiourltranscription.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_transcriptions_listtranscription(self):
        """Test case for transcriptions_listtranscription

        List Transcriptions
        """
        data = dict(page=1,
                    pagesize=10,
                    status='status_example',
                    dateTranscribed='dateTranscribed_example')
        response = self.client.open(
            '/api/v3//transcriptions/listtranscription.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_transcriptions_recordingtranscription(self):
        """Test case for transcriptions_recordingtranscription

        Transcribe Recording
        """
        data = dict(recordingSid='recordingSid_example')
        response = self.client.open(
            '/api/v3//transcriptions/recordingtranscription.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_transcriptions_viewtranscription(self):
        """Test case for transcriptions_viewtranscription

        View Transcription
        """
        data = dict(transcriptionsid='transcriptionsid_example')
        response = self.client.open(
            '/api/v3//transcriptions/viewtranscription.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
