# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestLetterController(BaseTestCase):
    """LetterController integration test stubs"""

    def test_letter_create(self):
        """Test case for letter_create

        Create Letter
        """
        data = dict(to='to_example',
                    _from='_from_example',
                    attachbyid='attachbyid_example',
                    file='file_example',
                    color='color_example',
                    description='description_example',
                    extraservice='extraservice_example',
                    doublesided='doublesided_example',
                    template='template_example',
                    htmldata='htmldata_example')
        response = self.client.open(
            '/api/v3/letter/create.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_letter_delete(self):
        """Test case for letter_delete

        Delete Letter
        """
        data = dict(lettersid='lettersid_example')
        response = self.client.open(
            '/api/v3/letter/delete.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_letter_listsletter(self):
        """Test case for letter_listsletter

        List Letters
        """
        data = dict(page=1,
                    pagesize=10,
                    lettersid='lettersid_example',
                    dateCreated='dateCreated_example')
        response = self.client.open(
            '/api/v3/letter/listsletter.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_letter_viewletter(self):
        """Test case for letter_viewletter

        View Letter
        """
        data = dict(lettersid='lettersid_example')
        response = self.client.open(
            '/api/v3/letter/viewletter.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
