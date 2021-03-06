# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class Status24(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    CANCELED = "canceled"
    COMPLETED = "completed"

    def __init__(self):  # noqa: E501
        """Status24 - a model defined in Swagger

        """
        self.swagger_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'Status24':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Status24 of this Status24.  # noqa: E501
        :rtype: Status24
        """
        return util.deserialize_model(dikt, cls)
