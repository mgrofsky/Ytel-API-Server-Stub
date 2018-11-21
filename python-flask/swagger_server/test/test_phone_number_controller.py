# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestPhoneNumberController(BaseTestCase):
    """PhoneNumberController integration test stubs"""

    def test_incomingphone_availablenumber(self):
        """Test case for incomingphone_availablenumber

        Available Numbers
        """
        data = dict(numbertype='numbertype_example',
                    areacode='areacode_example',
                    pagesize=10)
        response = self.client.open(
            '/api/v3/incomingphone/availablenumber.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_incomingphone_bulkbuy(self):
        """Test case for incomingphone_bulkbuy

        Bulk Buy Numbers
        """
        data = dict(NumberType='NumberType_example',
                    AreaCode='AreaCode_example',
                    Quantity='Quantity_example',
                    Leftover='Leftover_example')
        response = self.client.open(
            '/api/v3/incomingphone/bulkbuy.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_incomingphone_buynumber(self):
        """Test case for incomingphone_buynumber

        Purchase Number
        """
        data = dict(PhoneNumber='PhoneNumber_example')
        response = self.client.open(
            '/api/v3/incomingphone/buynumber.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_incomingphone_getdidscore(self):
        """Test case for incomingphone_getdidscore

        Get DID Score
        """
        data = dict(Phonenumber='Phonenumber_example')
        response = self.client.open(
            '/api/v3/incomingphone/getdidscore.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_incomingphone_listnumber(self):
        """Test case for incomingphone_listnumber

        List Numbers
        """
        data = dict(Page=1,
                    PageSize=10,
                    NumberType='NumberType_example',
                    FriendlyName='FriendlyName_example')
        response = self.client.open(
            '/api/v3/incomingphone/listnumber.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_incomingphone_massreleasenumber(self):
        """Test case for incomingphone_massreleasenumber

        Bulk Release
        """
        data = dict(PhoneNumber='PhoneNumber_example')
        response = self.client.open(
            '/api/v3/incomingphone/massreleasenumber.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_incomingphone_massupdatenumber(self):
        """Test case for incomingphone_massupdatenumber

        Bulk Update Numbers
        """
        data = dict(PhoneNumber='PhoneNumber_example',
                    VoiceUrl='VoiceUrl_example',
                    FriendlyName='FriendlyName_example',
                    VoiceMethod='VoiceMethod_example',
                    VoiceFallbackUrl='VoiceFallbackUrl_example',
                    VoiceFallbackMethod='VoiceFallbackMethod_example',
                    HangupCallback='HangupCallback_example',
                    HangupCallbackMethod='HangupCallbackMethod_example',
                    HeartbeatUrl='HeartbeatUrl_example',
                    HeartbeatMethod='HeartbeatMethod_example',
                    SmsUrl='SmsUrl_example',
                    SmsMethod='SmsMethod_example',
                    SmsFallbackUrl='SmsFallbackUrl_example',
                    SmsFallbackMethod='SmsFallbackMethod_example')
        response = self.client.open(
            '/api/v3/incomingphone/massupdatenumber.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_incomingphone_releasenumber_by_response_type_post(self):
        """Test case for incomingphone_releasenumber_by_response_type_post

        Release Number
        """
        data = dict(PhoneNumber='PhoneNumber_example')
        response = self.client.open(
            '/api/v3/incomingphone/releasenumber.json'.format(ResponseType='ResponseType_example'),
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_incomingphone_transferphonenumbers(self):
        """Test case for incomingphone_transferphonenumbers

        Move Number
        """
        data = dict(phonenumber='phonenumber_example',
                    fromaccountsid='fromaccountsid_example',
                    toaccountsid='toaccountsid_example')
        response = self.client.open(
            '/api/v3/incomingphone/transferphonenumbers.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_incomingphone_updatenumber(self):
        """Test case for incomingphone_updatenumber

        Update Number
        """
        data = dict(PhoneNumber='PhoneNumber_example',
                    VoiceUrl='VoiceUrl_example',
                    FriendlyName='FriendlyName_example',
                    VoiceMethod='VoiceMethod_example',
                    VoiceFallbackUrl='VoiceFallbackUrl_example',
                    VoiceFallbackMethod='VoiceFallbackMethod_example',
                    HangupCallback='HangupCallback_example',
                    HangupCallbackMethod='HangupCallbackMethod_example',
                    HeartbeatUrl='HeartbeatUrl_example',
                    HeartbeatMethod='HeartbeatMethod_example',
                    SmsUrl='SmsUrl_example',
                    SmsMethod='SmsMethod_example',
                    SmsFallbackUrl='SmsFallbackUrl_example',
                    SmsFallbackMethod='SmsFallbackMethod_example')
        response = self.client.open(
            '/api/v3/incomingphone/updatenumber.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_incomingphone_viewnumber(self):
        """Test case for incomingphone_viewnumber

        View Details
        """
        data = dict(PhoneNumber='PhoneNumber_example')
        response = self.client.open(
            '/api/v3/incomingphone/viewnumber.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
