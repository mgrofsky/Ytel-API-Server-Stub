# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestSMSController(BaseTestCase):
    """SMSController integration test stubs"""

    def test_sms_getinboundsms(self):
        """Test case for sms_getinboundsms

        List Inbound SMS
        """
        data = dict(Page=1,
                    PageSize=10,
                    From='From_example',
                    To='To_example',
                    DateSent='DateSent_example')
        response = self.client.open(
            '/api/v3/sms/getinboundsms.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_sms_listsms(self):
        """Test case for sms_listsms

        List SMS
        """
        data = dict(Page=1,
                    PageSize=10,
                    From='From_example',
                    To='To_example',
                    DateSent='DateSent_example')
        response = self.client.open(
            '/api/v3/sms/listsms.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_sms_sendsms(self):
        """Test case for sms_sendsms

        Send SMS
        """
        data = dict(From='From_example',
                    To='To_example',
                    Body='Body_example',
                    Method='Method_example',
                    MessageStatusCallback='MessageStatusCallback_example',
                    Smartsms=false,
                    DeliveryStatus=false)
        response = self.client.open(
            '/api/v3/sms/sendsms.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_sms_viewdetailsms(self):
        """Test case for sms_viewdetailsms

        View SMS
        """
        data = dict(MessageSid='MessageSid_example')
        response = self.client.open(
            '/api/v3/sms/viewdetailsms.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_sms_viewsms(self):
        """Test case for sms_viewsms

        View SMS
        """
        data = dict(MessageSid='MessageSid_example')
        response = self.client.open(
            '/api/v3/sms/viewsms.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
