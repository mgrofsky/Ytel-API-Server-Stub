# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestEmailController(BaseTestCase):
    """EmailController integration test stubs"""

    def test_email_addunsubscribesemail(self):
        """Test case for email_addunsubscribesemail

        Add Email Unsubscribe
        """
        data = dict(email='email_example')
        response = self.client.open(
            '/api/v3//email/addunsubscribesemail.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_email_deleteblocksemail(self):
        """Test case for email_deleteblocksemail

        Remove Blocked Address
        """
        data = dict(Email='Email_example')
        response = self.client.open(
            '/api/v3//email/deleteblocksemail.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_email_deletebouncesemail(self):
        """Test case for email_deletebouncesemail

        Remove Bounced Email
        """
        data = dict(Email='Email_example')
        response = self.client.open(
            '/api/v3//email/deletebouncesemail.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_email_deleteinvalidemail(self):
        """Test case for email_deleteinvalidemail

        Remove Invalid Email
        """
        data = dict(Email='Email_example')
        response = self.client.open(
            '/api/v3//email/deleteinvalidemail.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_email_deletespamemail(self):
        """Test case for email_deletespamemail

        Remove Spam Address
        """
        data = dict(Email='Email_example')
        response = self.client.open(
            '/api/v3//email/deletespamemail.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_email_deleteunsubscribedemail(self):
        """Test case for email_deleteunsubscribedemail

        Remove Unsubscribed Email
        """
        data = dict(email='email_example')
        response = self.client.open(
            '/api/v3//email/deleteunsubscribedemail.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_email_listblockemail(self):
        """Test case for email_listblockemail

        Blocked Emails
        """
        data = dict(Offset='Offset_example',
                    Limit='Limit_example')
        response = self.client.open(
            '/api/v3//email/listblockemail.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_email_listbounceemail(self):
        """Test case for email_listbounceemail

        Bounced Emails
        """
        data = dict(Offset='Offset_example',
                    Limit='Limit_example')
        response = self.client.open(
            '/api/v3//email/listbounceemail.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_email_listinvalidemail(self):
        """Test case for email_listinvalidemail

        Invalid Emails
        """
        data = dict(Offset='Offset_example',
                    Limit='Limit_example')
        response = self.client.open(
            '/api/v3//email/listinvalidemail.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_email_listspamemail(self):
        """Test case for email_listspamemail

        Spam Emails
        """
        data = dict(Offset='Offset_example',
                    Limit='Limit_example')
        response = self.client.open(
            '/api/v3//email/listspamemail.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_email_listunsubscribedemail(self):
        """Test case for email_listunsubscribedemail

        List Unsubscribed Emails
        """
        data = dict(Offset='Offset_example',
                    Limit='Limit_example')
        response = self.client.open(
            '/api/v3//email/listunsubscribedemail.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_email_sendemails(self):
        """Test case for email_sendemails

        Send Email
        """
        data = dict(To='To_example',
                    Type='Type_example',
                    Subject='Subject_example',
                    Message='Message_example',
                    From='From_example',
                    Cc='Cc_example',
                    Bcc='Bcc_example',
                    Attachment='Attachment_example')
        response = self.client.open(
            '/api/v3//email/sendemails.json',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
