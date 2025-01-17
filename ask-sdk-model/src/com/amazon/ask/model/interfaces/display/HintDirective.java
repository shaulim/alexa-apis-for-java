/*
* Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
* except in compliance with the License. A copy of the License is located at
*
* http://aws.amazon.com/apache2.0/
*
* or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
* the specific language governing permissions and limitations under the License.
*/


package com.amazon.ask.model.interfaces.display;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HintDirective
 */

@JsonDeserialize(builder = HintDirective.Builder.class)
public final class HintDirective extends com.amazon.ask.model.Directive {

  @JsonProperty("hint")
  private com.amazon.ask.model.interfaces.display.Hint hint = null;

  public static Builder builder() {
    return new Builder();
  }

  private HintDirective(Builder builder) {
    String discriminatorValue = "Hint";

    this.type = discriminatorValue;
    this.hint = builder.hint;
  }

  /**
    * Get hint
  * @return hint
  **/
  @JsonProperty("hint")
  public com.amazon.ask.model.interfaces.display.Hint getHint() {
    return hint;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HintDirective interfacesDisplayHintDirective = (HintDirective) o;
    return Objects.equals(this.hint, interfacesDisplayHintDirective.hint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HintDirective {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static class Builder {
    private com.amazon.ask.model.interfaces.display.Hint hint;

    private Builder() { }

    @JsonProperty("hint")
    public Builder withHint(com.amazon.ask.model.interfaces.display.Hint hint) {
        this.hint = hint;
        return this;
    }


    public HintDirective build() {
      return new HintDirective(this);
    }
  }
}

