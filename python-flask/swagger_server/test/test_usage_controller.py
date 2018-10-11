# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestUsageController(BaseTestCase):
    """UsageController integration test stubs"""

    def test_usage_listusage(self):
        """Test case for usage_listusage

        List Usage
        """
        data = dict(ProductCode='0',
                    startDate='2016-09-06',
                    endDate='2016-09-06',
                    IncludeSubAccounts='IncludeSubAccounts_example')
        response = self.client.open(
            '/api/v3/usage/listusage.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
