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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * AlexaListMetadata
 */

@JsonDeserialize(builder = AlexaListMetadata.Builder.class)
public final class AlexaListMetadata{

  @JsonProperty("listId")
  private String listId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("state")
  private com.amazon.ask.model.services.listManagement.ListState state = null;

  @JsonProperty("version")
  private Long version = null;

  @JsonProperty("statusMap")
  private List<com.amazon.ask.model.services.listManagement.Status> statusMap = new ArrayList<com.amazon.ask.model.services.listManagement.Status>();

  public static Builder builder() {
    return new Builder();
  }

  private AlexaListMetadata(Builder builder) {
    this.listId = builder.listId;
    this.name = builder.name;
    this.state = builder.state;
    this.version = builder.version;
    this.statusMap = builder.statusMap;
  }

  /**
    * Get listId
  * @return listId
  **/
  @JsonProperty("listId")
  public String getListId() {
    return listId;
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

  /**
    * Get version
  * @return version
  **/
  @JsonProperty("version")
  public Long getVersion() {
    return version;
  }

  /**
    * Get statusMap
  * @return statusMap
  **/
  @JsonProperty("statusMap")
  public List<com.amazon.ask.model.services.listManagement.Status> getStatusMap() {
    return statusMap;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlexaListMetadata servicesListManagementAlexaListMetadata = (AlexaListMetadata) o;
    return Objects.equals(this.listId, servicesListManagementAlexaListMetadata.listId) &&
        Objects.equals(this.name, servicesListManagementAlexaListMetadata.name) &&
        Objects.equals(this.state, servicesListManagementAlexaListMetadata.state) &&
        Objects.equals(this.version, servicesListManagementAlexaListMetadata.version) &&
        Objects.equals(this.statusMap, servicesListManagementAlexaListMetadata.statusMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listId, name, state, version, statusMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlexaListMetadata {\n");
    
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    statusMap: ").append(toIndentedString(statusMap)).append("\n");
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
    private String listId;
    private String name;
    private com.amazon.ask.model.services.listManagement.ListState state;
    private Long version;
    private List<com.amazon.ask.model.services.listManagement.Status> statusMap;

    private Builder() { }

    @JsonProperty("listId")
    public Builder withListId(String listId) {
        this.listId = listId;
        return this;
    }


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


    @JsonProperty("version")
    public Builder withVersion(Long version) {
        this.version = version;
        return this;
    }


    @JsonProperty("statusMap")
    public Builder withStatusMap(List<com.amazon.ask.model.services.listManagement.Status> statusMap) {
        this.statusMap = statusMap;
        return this;
    }

    public Builder addStatusMapItem(com.amazon.ask.model.services.listManagement.Status statusMapItem) {
      if (this.statusMap == null) {
        this.statusMap = new ArrayList<com.amazon.ask.model.services.listManagement.Status>();
      }
      this.statusMap.add(statusMapItem);
      return this;
    }

    public AlexaListMetadata build() {
      return new AlexaListMetadata(this);
    }
  }
}

