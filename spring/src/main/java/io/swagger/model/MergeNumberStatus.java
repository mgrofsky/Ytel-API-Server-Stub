package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Choose sub account either merge or delete
 */
public enum MergeNumberStatus {
  
  NUMBER_0(0),
  
  NUMBER_1(1);

  private Integer value;

  MergeNumberStatus(Integer value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MergeNumberStatus fromValue(String text) {
    for (MergeNumberStatus b : MergeNumberStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

