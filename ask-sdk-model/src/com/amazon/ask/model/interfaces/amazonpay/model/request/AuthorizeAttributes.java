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


package com.amazon.ask.model.interfaces.amazonpay.model.request;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is an object to set the attributes specified in the AuthorizeAttributes table. See the “AuthorizationDetails” section of the Amazon Pay API reference guide for details about this object.
 */

@JsonDeserialize(builder = AuthorizeAttributes.Builder.class)
public final class AuthorizeAttributes extends com.amazon.ask.model.interfaces.amazonpay.model.request.BaseAmazonPayEntity {

  @JsonProperty("authorizationReferenceId")
  private String authorizationReferenceId = null;

  @JsonProperty("authorizationAmount")
  private com.amazon.ask.model.interfaces.amazonpay.model.request.Price authorizationAmount = null;

  @JsonProperty("transactionTimeout")
  private Integer transactionTimeout = null;

  @JsonProperty("sellerAuthorizationNote")
  private String sellerAuthorizationNote = null;

  @JsonProperty("softDescriptor")
  private String softDescriptor = null;

  public static Builder builder() {
    return new Builder();
  }

  private AuthorizeAttributes(Builder builder) {
    String discriminatorValue = "AuthorizeAttributes";

    this.authorizationReferenceId = builder.authorizationReferenceId;
    this.authorizationAmount = builder.authorizationAmount;
    this.transactionTimeout = builder.transactionTimeout;
    this.sellerAuthorizationNote = builder.sellerAuthorizationNote;
    this.softDescriptor = builder.softDescriptor;
    this.type = discriminatorValue;
    this.version = builder.version;
  }

  /**
    * This is 3P seller's identifier for this authorization transaction. This identifier must be unique for all of your authorization transactions.
  * @return authorizationReferenceId
  **/
  @JsonProperty("authorizationReferenceId")
  public String getAuthorizationReferenceId() {
    return authorizationReferenceId;
  }

  /**
    * Get authorizationAmount
  * @return authorizationAmount
  **/
  @JsonProperty("authorizationAmount")
  public com.amazon.ask.model.interfaces.amazonpay.model.request.Price getAuthorizationAmount() {
    return authorizationAmount;
  }

  /**
    * The maximum number of minutes allocated for the Authorize operation call to be processed. After this the authorization is automatically declined and you cannot capture funds against the authorization. The default value for Alexa transactions is 0. In order to speed up checkout time for voice users we recommend to not change this value.
  * @return transactionTimeout
  **/
  @JsonProperty("transactionTimeout")
  public Integer getTransactionTimeout() {
    return transactionTimeout;
  }

  /**
    * A description for the transaction that is included in emails to the user. Appears only when AuthorizeAndCapture is chosen.
  * @return sellerAuthorizationNote
  **/
  @JsonProperty("sellerAuthorizationNote")
  public String getSellerAuthorizationNote() {
    return sellerAuthorizationNote;
  }

  /**
    * The description to be shown on the user's payment instrument statement if AuthorizeAndCapture is chosen. Format of soft descriptor sent to the payment processor is \"AMZ* &lt;soft descriptor specified here&gt;\". Default is \"AMZ*&lt;SELLER_NAME&gt; amzn.com/ pmts WA\". Maximum length can be 16 characters.
  * @return softDescriptor
  **/
  @JsonProperty("softDescriptor")
  public String getSoftDescriptor() {
    return softDescriptor;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizeAttributes interfacesAmazonpayModelRequestAuthorizeAttributes = (AuthorizeAttributes) o;
    return Objects.equals(this.authorizationReferenceId, interfacesAmazonpayModelRequestAuthorizeAttributes.authorizationReferenceId) &&
        Objects.equals(this.authorizationAmount, interfacesAmazonpayModelRequestAuthorizeAttributes.authorizationAmount) &&
        Objects.equals(this.transactionTimeout, interfacesAmazonpayModelRequestAuthorizeAttributes.transactionTimeout) &&
        Objects.equals(this.sellerAuthorizationNote, interfacesAmazonpayModelRequestAuthorizeAttributes.sellerAuthorizationNote) &&
        Objects.equals(this.softDescriptor, interfacesAmazonpayModelRequestAuthorizeAttributes.softDescriptor) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationReferenceId, authorizationAmount, transactionTimeout, sellerAuthorizationNote, softDescriptor, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizeAttributes {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    authorizationReferenceId: ").append(toIndentedString(authorizationReferenceId)).append("\n");
    sb.append("    authorizationAmount: ").append(toIndentedString(authorizationAmount)).append("\n");
    sb.append("    transactionTimeout: ").append(toIndentedString(transactionTimeout)).append("\n");
    sb.append("    sellerAuthorizationNote: ").append(toIndentedString(sellerAuthorizationNote)).append("\n");
    sb.append("    softDescriptor: ").append(toIndentedString(softDescriptor)).append("\n");
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
    private String authorizationReferenceId;
    private com.amazon.ask.model.interfaces.amazonpay.model.request.Price authorizationAmount;
    private Integer transactionTimeout;
    private String sellerAuthorizationNote;
    private String softDescriptor;
    private String version;

    private Builder() { }

    @JsonProperty("authorizationReferenceId")
    public Builder withAuthorizationReferenceId(String authorizationReferenceId) {
        this.authorizationReferenceId = authorizationReferenceId;
        return this;
    }


    @JsonProperty("authorizationAmount")
    public Builder withAuthorizationAmount(com.amazon.ask.model.interfaces.amazonpay.model.request.Price authorizationAmount) {
        this.authorizationAmount = authorizationAmount;
        return this;
    }


    @JsonProperty("transactionTimeout")
    public Builder withTransactionTimeout(Integer transactionTimeout) {
        this.transactionTimeout = transactionTimeout;
        return this;
    }


    @JsonProperty("sellerAuthorizationNote")
    public Builder withSellerAuthorizationNote(String sellerAuthorizationNote) {
        this.sellerAuthorizationNote = sellerAuthorizationNote;
        return this;
    }


    @JsonProperty("softDescriptor")
    public Builder withSoftDescriptor(String softDescriptor) {
        this.softDescriptor = softDescriptor;
        return this;
    }


    @JsonProperty("@version")
    public Builder withVersion(String version) {
        this.version = version;
        return this;
    }


    public AuthorizeAttributes build() {
      return new AuthorizeAttributes(this);
    }
  }
}

