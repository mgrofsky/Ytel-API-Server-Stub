package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets GroupConfirmFile
 */
public enum GroupConfirmFile {
  
  MP3("mp3"),
  
  WAV("wav");

  private String value;

  GroupConfirmFile(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GroupConfirmFile fromValue(String text) {
    for (GroupConfirmFile b : GroupConfirmFile.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

