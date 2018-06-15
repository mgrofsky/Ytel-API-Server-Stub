# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestPostCardController(BaseTestCase):
    """PostCardController integration test stubs"""

    def test_postcard_createpostcard(self):
        """Test case for postcard_createpostcard

        Create Postcard
        """
        data = dict(to='to_example',
                    _from='_from_example',
                    attachbyid='attachbyid_example',
                    front='front_example',
                    back='back_example',
                    message='message_example',
                    setting='setting_example',
                    description='description_example',
                    htmldata='htmldata_example')
        response = self.client.open(
            '/api/v3//Postcard/createpostcard.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_postcard_deletepostcard(self):
        """Test case for postcard_deletepostcard

        Delete Postcard
        """
        data = dict(postcardid='postcardid_example')
        response = self.client.open(
            '/api/v3//Postcard/deletepostcard.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_postcard_listpostcard(self):
        """Test case for postcard_listpostcard

        List Postcards
        """
        data = dict(page=1,
                    pagesize=10,
                    postcardid='postcardid_example',
                    dateCreated='dateCreated_example')
        response = self.client.open(
            '/api/v3//Postcard/listpostcard.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_postcard_viewpostcard(self):
        """Test case for postcard_viewpostcard

        View Postcard
        """
        data = dict(postcardid='postcardid_example')
        response = self.client.open(
            '/api/v3//Postcard/viewpostcard.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
