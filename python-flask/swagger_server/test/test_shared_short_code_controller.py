# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestSharedShortCodeController(BaseTestCase):
    """SharedShortCodeController integration test stubs"""

    def test_keyword_lists(self):
        """Test case for keyword_lists

        List Keywords
        """
        data = dict(page=1,
                    pagesize=10,
                    Keyword='Keyword_example',
                    Shortcode=56)
        response = self.client.open(
            '/api/v3/keyword/lists.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_keyword_view(self):
        """Test case for keyword_view

        View Keyword
        """
        data = dict(Keywordid='Keywordid_example')
        response = self.client.open(
            '/api/v3/keyword/view.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_shortcode_getinboundsms(self):
        """Test case for shortcode_getinboundsms

        List Inbound SMS
        """
        query_string = [('Datecreated', 'Datecreated_example')]
        data = dict(page=1,
                    pagesize=10,
                    _from='_from_example',
                    Shortcode='Shortcode_example')
        response = self.client.open(
            '/api/v3/shortcode/getinboundsms.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_shortcode_listshortcode(self):
        """Test case for shortcode_listshortcode

        List Shortcodes
        """
        query_string = [('Shortcode', 'Shortcode_example')]
        data = dict(page=1,
                    pagesize=10)
        response = self.client.open(
            '/api/v3/shortcode/listshortcode.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_shortcode_sendsms(self):
        """Test case for shortcode_sendsms

        Send SMS
        """
        data = dict(shortcode='shortcode_example',
                    to='to_example',
                    templateid='templateid_example',
                    data='data_example',
                    Method='GET',
                    MessageStatusCallback='MessageStatusCallback_example')
        response = self.client.open(
            '/api/v3/shortcode/sendsms.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_shortcode_updateshortcode(self):
        """Test case for shortcode_updateshortcode

        Update Shortcode
        """
        data = dict(Shortcode='Shortcode_example',
                    FriendlyName='FriendlyName_example',
                    CallbackUrl='CallbackUrl_example',
                    CallbackMethod='CallbackMethod_example',
                    FallbackUrl='FallbackUrl_example',
                    FallbackUrlMethod='FallbackUrlMethod_example')
        response = self.client.open(
            '/api/v3/shortcode/updateshortcode.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_shortcode_viewshortcode(self):
        """Test case for shortcode_viewshortcode

        View Shortcode
        """
        data = dict(Shortcode='Shortcode_example')
        response = self.client.open(
            '/api/v3/shortcode/viewshortcode.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_template_lists(self):
        """Test case for template_lists

        List Templates
        """
        data = dict(type='authorization',
                    page=1,
                    pagesize=10,
                    Shortcode='Shortcode_example')
        response = self.client.open(
            '/api/v3/template/lists.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_template_view(self):
        """Test case for template_view

        View Template
        """
        data = dict(TemplateId='TemplateId_example')
        response = self.client.open(
            '/api/v3/template/view.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
