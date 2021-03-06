=begin
Ytel API V3

Ytel API version 3

OpenAPI spec version: 3.12

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end


class Error < ApplicationRecord
  validates_presence_of :code
  validates_presence_of :message
  validates_presence_of :more_info

  serialize :more_info, Array
end
