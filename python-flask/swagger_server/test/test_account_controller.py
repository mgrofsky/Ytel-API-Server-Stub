# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestAccountController(BaseTestCase):
    """AccountController integration test stubs"""

    def test_accounts_viewaccount(self):
        """Test case for accounts_viewaccount

        View Account
        """
        data = dict(Date='Date_example')
        response = self.client.open(
            '/api/v3//accounts/viewaccount.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
