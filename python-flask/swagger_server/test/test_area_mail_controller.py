# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestAreaMailController(BaseTestCase):
    """AreaMailController integration test stubs"""

    def test_areamail_create(self):
        """Test case for areamail_create

        Create AreaMail
        """
        data = dict(routes='routes_example',
                    attachbyid='attachbyid_example',
                    front='front_example',
                    back='back_example',
                    description='description_example',
                    targettype='targettype_example',
                    htmldata='htmldata_example')
        response = self.client.open(
            '/api/v3/areamail/create.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_areamail_delete(self):
        """Test case for areamail_delete

        Delete AreaMail
        """
        data = dict(areamailid='areamailid_example')
        response = self.client.open(
            '/api/v3/areamail/delete.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_areamail_lists(self):
        """Test case for areamail_lists

        List AreaMails
        """
        data = dict(page=1,
                    pagesize=10,
                    areamailsid='areamailsid_example',
                    dateCreated='dateCreated_example')
        response = self.client.open(
            '/api/v3/areamail/lists.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_areamail_view(self):
        """Test case for areamail_view

        View AreaMail
        """
        data = dict(areamailid='areamailid_example')
        response = self.client.open(
            '/api/v3/areamail/view.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
