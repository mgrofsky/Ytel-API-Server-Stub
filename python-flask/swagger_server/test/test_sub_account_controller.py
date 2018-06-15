# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestSubAccountController(BaseTestCase):
    """SubAccountController integration test stubs"""

    def test_user_createsubaccount(self):
        """Test case for user_createsubaccount

        Create Subaccount
        """
        data = dict(FirstName='FirstName_example',
                    LastName='LastName_example',
                    Email='Email_example',
                    FriendlyName='FriendlyName_example',
                    Password='Password_example')
        response = self.client.open(
            '/api/v3//user/createsubaccount.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_deletesubaccount(self):
        """Test case for user_deletesubaccount

        Delete Subaccount
        """
        data = dict(SubAccountSID='SubAccountSID_example',
                    MergeNumber='MergeNumber_example')
        response = self.client.open(
            '/api/v3//user/deletesubaccount.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_subaccountactivation(self):
        """Test case for user_subaccountactivation

        Toggle Subaccount Status
        """
        data = dict(SubAccountSID='SubAccountSID_example',
                    Activate='Activate_example')
        response = self.client.open(
            '/api/v3//user/subaccountactivation.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
