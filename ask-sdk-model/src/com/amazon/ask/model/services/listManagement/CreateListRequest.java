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
 * CreateListRequest
 */

@JsonDeserialize(builder = CreateListRequest.Builder.class)
public final class CreateListRequest{

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("state")
  private com.amazon.ask.model.services.listManagement.ListState state = null;

  public static Builder builder() {
    return new Builder();
  }

  private CreateListRequest(Builder builder) {
    this.name = builder.name;
    this.state = builder.state;
  }

  /**
    * Get name
  * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
    * Get state
  * @return state
  **/
  @JsonProperty("state")
  public com.amazon.ask.model.services.listManagement.ListState getState() {
    return state;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateListRequest servicesListManagementCreateListRequest = (CreateListRequest) o;
    return Objects.equals(this.name, servicesListManagementCreateListRequest.name) &&
        Objects.equals(this.state, servicesListManagementCreateListRequest.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateListRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    private String name;
    private com.amazon.ask.model.services.listManagement.ListState state;

    private Builder() { }

    @JsonProperty("name")
    public Builder withName(String name) {
        this.name = name;
        return this;
    }


    @JsonProperty("state")
    public Builder withState(com.amazon.ask.model.services.listManagement.ListState state) {
        this.state = state;
        return this;
    }


    public CreateListRequest build() {
      return new CreateListRequest(this);
    }
  }
}

