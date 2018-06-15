# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestRecordingController(BaseTestCase):
    """RecordingController integration test stubs"""

    def test_recording_deleterecording(self):
        """Test case for recording_deleterecording

        Delete Recording
        """
        data = dict(recordingsid='recordingsid_example')
        response = self.client.open(
            '/api/v3//recording/deleterecording.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_recording_listrecording(self):
        """Test case for recording_listrecording

        List Recordings
        """
        data = dict(page=1,
                    pagesize=10,
                    Datecreated='Datecreated_example',
                    callsid='callsid_example')
        response = self.client.open(
            '/api/v3//recording/listrecording.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_recording_viewrecording(self):
        """Test case for recording_viewrecording

        View Recording
        """
        data = dict(recordingsid='recordingsid_example')
        response = self.client.open(
            '/api/v3//recording/viewrecording.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
