# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestShortCodeController(BaseTestCase):
    """ShortCodeController integration test stubs"""

    def test_dedicatedshortcode_getinboundsms(self):
        """Test case for dedicatedshortcode_getinboundsms

        List Inbound SMS
        """
        data = dict(page=1,
                    pagesize=10,
                    From='From_example',
                    Shortcode='Shortcode_example',
                    Datecreated='Datecreated_example')
        response = self.client.open(
            '/api/v3//dedicatedshortcode/getinboundsms.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_dedicatedshortcode_listshortcode(self):
        """Test case for dedicatedshortcode_listshortcode

        List Shortcodes
        """
        data = dict(Shortcode='Shortcode_example',
                    page='page_example',
                    pagesize='pagesize_example')
        response = self.client.open(
            '/api/v3//dedicatedshortcode/listshortcode.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_dedicatedshortcode_sendsms(self):
        """Test case for dedicatedshortcode_sendsms

        Send SMS
        """
        data = dict(shortcode=56,
                    to=1.2,
                    body='body_example',
                    method='method_example',
                    messagestatuscallback='messagestatuscallback_example')
        response = self.client.open(
            '/api/v3//dedicatedshortcode/sendsms.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_dedicatedshortcode_updateshortcode(self):
        """Test case for dedicatedshortcode_updateshortcode

        Update Shortcode
        """
        data = dict(Shortcode='Shortcode_example',
                    FriendlyName='FriendlyName_example',
                    CallbackMethod='CallbackMethod_example',
                    CallbackUrl='CallbackUrl_example',
                    FallbackMethod='FallbackMethod_example',
                    FallbackUrl='FallbackUrl_example')
        response = self.client.open(
            '/api/v3//dedicatedshortcode/updateshortcode.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_dedicatedshortcode_viewshortcode(self):
        """Test case for dedicatedshortcode_viewshortcode

        View SMS
        """
        data = dict(Shortcode='Shortcode_example')
        response = self.client.open(
            '/api/v3//dedicatedshortcode/viewshortcode.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_shortcode_listsms(self):
        """Test case for shortcode_listsms

        List SMS
        """
        data = dict(Shortcode='Shortcode_example',
                    To='To_example',
                    DateSent='DateSent_example',
                    Page=1,
                    PageSize=10)
        response = self.client.open(
            '/api/v3//shortcode/listsms.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_shortcode_viewsms(self):
        """Test case for shortcode_viewsms

        View SMS
        """
        data = dict(MessageSid='MessageSid_example')
        response = self.client.open(
            '/api/v3//shortcode/viewsms.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
