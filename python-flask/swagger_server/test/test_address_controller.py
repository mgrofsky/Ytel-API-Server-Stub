# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestAddressController(BaseTestCase):
    """AddressController integration test stubs"""

    def test_address_createaddress(self):
        """Test case for address_createaddress

        Create Address
        """
        data = dict(Name='Name_example',
                    Address='Address_example',
                    Country='Country_example',
                    State='State_example',
                    City='City_example',
                    Zip='Zip_example',
                    Description='Description_example',
                    email='email_example',
                    Phone='Phone_example')
        response = self.client.open(
            '/api/v3/address/createaddress.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_address_deleteaddress(self):
        """Test case for address_deleteaddress

        Delete Address
        """
        data = dict(addressid='addressid_example')
        response = self.client.open(
            '/api/v3/address/deleteaddress.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_address_listaddress(self):
        """Test case for address_listaddress

        List Addresses
        """
        data = dict(page=1,
                    pagesize=10,
                    addressid='addressid_example',
                    dateCreated='dateCreated_example')
        response = self.client.open(
            '/api/v3/address/listaddress.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_address_verifyaddress(self):
        """Test case for address_verifyaddress

        Verify Address
        """
        data = dict(addressid='addressid_example')
        response = self.client.open(
            '/api/v3/address/verifyaddress.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_address_viewaddress(self):
        """Test case for address_viewaddress

        View Address
        """
        data = dict(addressid='addressid_example')
        response = self.client.open(
            '/api/v3/address/viewaddress.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
