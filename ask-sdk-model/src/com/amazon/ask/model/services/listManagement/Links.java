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


package com.amazon.ask.model.services.listManagement;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Links
 */

@JsonDeserialize(builder = Links.Builder.class)
public final class Links{

  @JsonProperty("next")
  private String next = null;

  public static Builder builder() {
    return new Builder();
  }

  private Links(Builder builder) {
    this.next = builder.next;
  }

  /**
    * Get next
  * @return next
  **/
  @JsonProperty("next")
  public String getNext() {
    return next;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Links servicesListManagementLinks = (Links) o;
    return Objects.equals(this.next, servicesListManagementLinks.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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
    private String next;

    private Builder() { }

    @JsonProperty("next")
    public Builder withNext(String next) {
        this.next = next;
        return this;
    }


    public Links build() {
      return new Links(this);
    }
  }
}

