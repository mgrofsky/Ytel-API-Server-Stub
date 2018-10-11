# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestCarrierController(BaseTestCase):
    """CarrierController integration test stubs"""

    def test_carrier_lookup(self):
        """Test case for carrier_lookup

        Lookup Carrier
        """
        data = dict(PhoneNumber='PhoneNumber_example')
        response = self.client.open(
            '/api/v3/carrier/lookup.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_carrier_lookuplist(self):
        """Test case for carrier_lookuplist

        Carrier Results
        """
        data = dict(Page=1,
                    PageSize=10)
        response = self.client.open(
            '/api/v3/carrier/lookuplist.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
