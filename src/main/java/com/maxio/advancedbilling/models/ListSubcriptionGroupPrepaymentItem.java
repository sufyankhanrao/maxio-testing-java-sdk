/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.ZonedDateTime;

/**
 * This is a model class for ListSubcriptionGroupPrepaymentItem type.
 */
public class ListSubcriptionGroupPrepaymentItem
        extends BaseModel {
    private Integer id;
    private String subscriptionGroupUid;
    private Long amountInCents;
    private Long remainingAmountInCents;
    private String details;
    private Boolean external;
    private String memo;
    private PrepaymentMethod paymentType;
    private ZonedDateTime createdAt;

    /**
     * Default constructor.
     */
    public ListSubcriptionGroupPrepaymentItem() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  subscriptionGroupUid  String value for subscriptionGroupUid.
     * @param  amountInCents  Long value for amountInCents.
     * @param  remainingAmountInCents  Long value for remainingAmountInCents.
     * @param  details  String value for details.
     * @param  external  Boolean value for external.
     * @param  memo  String value for memo.
     * @param  paymentType  PrepaymentMethod value for paymentType.
     * @param  createdAt  ZonedDateTime value for createdAt.
     */
    public ListSubcriptionGroupPrepaymentItem(
            Integer id,
            String subscriptionGroupUid,
            Long amountInCents,
            Long remainingAmountInCents,
            String details,
            Boolean external,
            String memo,
            PrepaymentMethod paymentType,
            ZonedDateTime createdAt) {
        this.id = id;
        this.subscriptionGroupUid = subscriptionGroupUid;
        this.amountInCents = amountInCents;
        this.remainingAmountInCents = remainingAmountInCents;
        this.details = details;
        this.external = external;
        this.memo = memo;
        this.paymentType = paymentType;
        this.createdAt = createdAt;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for SubscriptionGroupUid.
     * @return Returns the String
     */
    @JsonGetter("subscription_group_uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubscriptionGroupUid() {
        return subscriptionGroupUid;
    }

    /**
     * Setter for SubscriptionGroupUid.
     * @param subscriptionGroupUid Value for String
     */
    @JsonSetter("subscription_group_uid")
    public void setSubscriptionGroupUid(String subscriptionGroupUid) {
        this.subscriptionGroupUid = subscriptionGroupUid;
    }

    /**
     * Getter for AmountInCents.
     * @return Returns the Long
     */
    @JsonGetter("amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getAmountInCents() {
        return amountInCents;
    }

    /**
     * Setter for AmountInCents.
     * @param amountInCents Value for Long
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(Long amountInCents) {
        this.amountInCents = amountInCents;
    }

    /**
     * Getter for RemainingAmountInCents.
     * @return Returns the Long
     */
    @JsonGetter("remaining_amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getRemainingAmountInCents() {
        return remainingAmountInCents;
    }

    /**
     * Setter for RemainingAmountInCents.
     * @param remainingAmountInCents Value for Long
     */
    @JsonSetter("remaining_amount_in_cents")
    public void setRemainingAmountInCents(Long remainingAmountInCents) {
        this.remainingAmountInCents = remainingAmountInCents;
    }

    /**
     * Getter for Details.
     * @return Returns the String
     */
    @JsonGetter("details")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDetails() {
        return details;
    }

    /**
     * Setter for Details.
     * @param details Value for String
     */
    @JsonSetter("details")
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * Getter for External.
     * @return Returns the Boolean
     */
    @JsonGetter("external")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getExternal() {
        return external;
    }

    /**
     * Setter for External.
     * @param external Value for Boolean
     */
    @JsonSetter("external")
    public void setExternal(Boolean external) {
        this.external = external;
    }

    /**
     * Getter for Memo.
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for PaymentType.
     * @return Returns the PrepaymentMethod
     */
    @JsonGetter("payment_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PrepaymentMethod getPaymentType() {
        return paymentType;
    }

    /**
     * Setter for PaymentType.
     * @param paymentType Value for PrepaymentMethod
     */
    @JsonSetter("payment_type")
    public void setPaymentType(PrepaymentMethod paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for ZonedDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Converts this ListSubcriptionGroupPrepaymentItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubcriptionGroupPrepaymentItem [" + "id=" + id + ", subscriptionGroupUid="
                + subscriptionGroupUid + ", amountInCents=" + amountInCents
                + ", remainingAmountInCents=" + remainingAmountInCents + ", details=" + details
                + ", external=" + external + ", memo=" + memo + ", paymentType=" + paymentType
                + ", createdAt=" + createdAt + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link ListSubcriptionGroupPrepaymentItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSubcriptionGroupPrepaymentItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .subscriptionGroupUid(getSubscriptionGroupUid())
                .amountInCents(getAmountInCents())
                .remainingAmountInCents(getRemainingAmountInCents())
                .details(getDetails())
                .external(getExternal())
                .memo(getMemo())
                .paymentType(getPaymentType())
                .createdAt(getCreatedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubcriptionGroupPrepaymentItem}.
     */
    public static class Builder {
        private Integer id;
        private String subscriptionGroupUid;
        private Long amountInCents;
        private Long remainingAmountInCents;
        private String details;
        private Boolean external;
        private String memo;
        private PrepaymentMethod paymentType;
        private ZonedDateTime createdAt;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for subscriptionGroupUid.
         * @param  subscriptionGroupUid  String value for subscriptionGroupUid.
         * @return Builder
         */
        public Builder subscriptionGroupUid(String subscriptionGroupUid) {
            this.subscriptionGroupUid = subscriptionGroupUid;
            return this;
        }

        /**
         * Setter for amountInCents.
         * @param  amountInCents  Long value for amountInCents.
         * @return Builder
         */
        public Builder amountInCents(Long amountInCents) {
            this.amountInCents = amountInCents;
            return this;
        }

        /**
         * Setter for remainingAmountInCents.
         * @param  remainingAmountInCents  Long value for remainingAmountInCents.
         * @return Builder
         */
        public Builder remainingAmountInCents(Long remainingAmountInCents) {
            this.remainingAmountInCents = remainingAmountInCents;
            return this;
        }

        /**
         * Setter for details.
         * @param  details  String value for details.
         * @return Builder
         */
        public Builder details(String details) {
            this.details = details;
            return this;
        }

        /**
         * Setter for external.
         * @param  external  Boolean value for external.
         * @return Builder
         */
        public Builder external(Boolean external) {
            this.external = external;
            return this;
        }

        /**
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * Setter for paymentType.
         * @param  paymentType  PrepaymentMethod value for paymentType.
         * @return Builder
         */
        public Builder paymentType(PrepaymentMethod paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Builds a new {@link ListSubcriptionGroupPrepaymentItem} object using the set fields.
         * @return {@link ListSubcriptionGroupPrepaymentItem}
         */
        public ListSubcriptionGroupPrepaymentItem build() {
            return new ListSubcriptionGroupPrepaymentItem(id, subscriptionGroupUid, amountInCents,
                    remainingAmountInCents, details, external, memo, paymentType, createdAt);
        }
    }
}
