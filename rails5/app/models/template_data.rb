=begin
Ytel API V3

Ytel API version 3

OpenAPI spec version: 3.12

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end


class TemplateData < ApplicationRecord
  validates_presence_of :companyname
  validates_presence_of :otpcode

end
