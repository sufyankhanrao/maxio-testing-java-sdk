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
import java.util.List;

/**
 * This is a model class for FullSubscriptionGroupResponse type.
 */
public class FullSubscriptionGroupResponse
        extends BaseModel {
    private String uid;
    private Integer scheme;
    private Integer customerId;
    private Integer paymentProfileId;
    private List<Integer> subscriptionIds;
    private Integer primarySubscriptionId;
    private ZonedDateTime nextAssessmentAt;
    private String state;
    private Boolean cancelAtEndOfPeriod;
    private Long currentBillingAmountInCents;
    private SubscriptionGroupCustomer customer;
    private SubscriptionGroupBalances accountBalances;

    /**
     * Default constructor.
     */
    public FullSubscriptionGroupResponse() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  scheme  Integer value for scheme.
     * @param  customerId  Integer value for customerId.
     * @param  paymentProfileId  Integer value for paymentProfileId.
     * @param  subscriptionIds  List of Integer value for subscriptionIds.
     * @param  primarySubscriptionId  Integer value for primarySubscriptionId.
     * @param  nextAssessmentAt  ZonedDateTime value for nextAssessmentAt.
     * @param  state  String value for state.
     * @param  cancelAtEndOfPeriod  Boolean value for cancelAtEndOfPeriod.
     * @param  currentBillingAmountInCents  Long value for currentBillingAmountInCents.
     * @param  customer  SubscriptionGroupCustomer value for customer.
     * @param  accountBalances  SubscriptionGroupBalances value for accountBalances.
     */
    public FullSubscriptionGroupResponse(
            String uid,
            Integer scheme,
            Integer customerId,
            Integer paymentProfileId,
            List<Integer> subscriptionIds,
            Integer primarySubscriptionId,
            ZonedDateTime nextAssessmentAt,
            String state,
            Boolean cancelAtEndOfPeriod,
            Long currentBillingAmountInCents,
            SubscriptionGroupCustomer customer,
            SubscriptionGroupBalances accountBalances) {
        this.uid = uid;
        this.scheme = scheme;
        this.customerId = customerId;
        this.paymentProfileId = paymentProfileId;
        this.subscriptionIds = subscriptionIds;
        this.primarySubscriptionId = primarySubscriptionId;
        this.nextAssessmentAt = nextAssessmentAt;
        this.state = state;
        this.cancelAtEndOfPeriod = cancelAtEndOfPeriod;
        this.currentBillingAmountInCents = currentBillingAmountInCents;
        this.customer = customer;
        this.accountBalances = accountBalances;
    }

    /**
     * Getter for Uid.
     * @return Returns the String
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Getter for Scheme.
     * @return Returns the Integer
     */
    @JsonGetter("scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getScheme() {
        return scheme;
    }

    /**
     * Setter for Scheme.
     * @param scheme Value for Integer
     */
    @JsonSetter("scheme")
    public void setScheme(Integer scheme) {
        this.scheme = scheme;
    }

    /**
     * Getter for CustomerId.
     * @return Returns the Integer
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * @param customerId Value for Integer
     */
    @JsonSetter("customer_id")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for PaymentProfileId.
     * @return Returns the Integer
     */
    @JsonGetter("payment_profile_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPaymentProfileId() {
        return paymentProfileId;
    }

    /**
     * Setter for PaymentProfileId.
     * @param paymentProfileId Value for Integer
     */
    @JsonSetter("payment_profile_id")
    public void setPaymentProfileId(Integer paymentProfileId) {
        this.paymentProfileId = paymentProfileId;
    }

    /**
     * Getter for SubscriptionIds.
     * @return Returns the List of Integer
     */
    @JsonGetter("subscription_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getSubscriptionIds() {
        return subscriptionIds;
    }

    /**
     * Setter for SubscriptionIds.
     * @param subscriptionIds Value for List of Integer
     */
    @JsonSetter("subscription_ids")
    public void setSubscriptionIds(List<Integer> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
    }

    /**
     * Getter for PrimarySubscriptionId.
     * @return Returns the Integer
     */
    @JsonGetter("primary_subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPrimarySubscriptionId() {
        return primarySubscriptionId;
    }

    /**
     * Setter for PrimarySubscriptionId.
     * @param primarySubscriptionId Value for Integer
     */
    @JsonSetter("primary_subscription_id")
    public void setPrimarySubscriptionId(Integer primarySubscriptionId) {
        this.primarySubscriptionId = primarySubscriptionId;
    }

    /**
     * Getter for NextAssessmentAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("next_assessment_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getNextAssessmentAt() {
        return nextAssessmentAt;
    }

    /**
     * Setter for NextAssessmentAt.
     * @param nextAssessmentAt Value for ZonedDateTime
     */
    @JsonSetter("next_assessment_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setNextAssessmentAt(ZonedDateTime nextAssessmentAt) {
        this.nextAssessmentAt = nextAssessmentAt;
    }

    /**
     * Getter for State.
     * @return Returns the String
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter for CancelAtEndOfPeriod.
     * @return Returns the Boolean
     */
    @JsonGetter("cancel_at_end_of_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCancelAtEndOfPeriod() {
        return cancelAtEndOfPeriod;
    }

    /**
     * Setter for CancelAtEndOfPeriod.
     * @param cancelAtEndOfPeriod Value for Boolean
     */
    @JsonSetter("cancel_at_end_of_period")
    public void setCancelAtEndOfPeriod(Boolean cancelAtEndOfPeriod) {
        this.cancelAtEndOfPeriod = cancelAtEndOfPeriod;
    }

    /**
     * Getter for CurrentBillingAmountInCents.
     * @return Returns the Long
     */
    @JsonGetter("current_billing_amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getCurrentBillingAmountInCents() {
        return currentBillingAmountInCents;
    }

    /**
     * Setter for CurrentBillingAmountInCents.
     * @param currentBillingAmountInCents Value for Long
     */
    @JsonSetter("current_billing_amount_in_cents")
    public void setCurrentBillingAmountInCents(Long currentBillingAmountInCents) {
        this.currentBillingAmountInCents = currentBillingAmountInCents;
    }

    /**
     * Getter for Customer.
     * @return Returns the SubscriptionGroupCustomer
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionGroupCustomer getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * @param customer Value for SubscriptionGroupCustomer
     */
    @JsonSetter("customer")
    public void setCustomer(SubscriptionGroupCustomer customer) {
        this.customer = customer;
    }

    /**
     * Getter for AccountBalances.
     * @return Returns the SubscriptionGroupBalances
     */
    @JsonGetter("account_balances")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionGroupBalances getAccountBalances() {
        return accountBalances;
    }

    /**
     * Setter for AccountBalances.
     * @param accountBalances Value for SubscriptionGroupBalances
     */
    @JsonSetter("account_balances")
    public void setAccountBalances(SubscriptionGroupBalances accountBalances) {
        this.accountBalances = accountBalances;
    }

    /**
     * Converts this FullSubscriptionGroupResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FullSubscriptionGroupResponse [" + "uid=" + uid + ", scheme=" + scheme
                + ", customerId=" + customerId + ", paymentProfileId=" + paymentProfileId
                + ", subscriptionIds=" + subscriptionIds + ", primarySubscriptionId="
                + primarySubscriptionId + ", nextAssessmentAt=" + nextAssessmentAt + ", state="
                + state + ", cancelAtEndOfPeriod=" + cancelAtEndOfPeriod
                + ", currentBillingAmountInCents=" + currentBillingAmountInCents + ", customer="
                + customer + ", accountBalances=" + accountBalances + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link FullSubscriptionGroupResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FullSubscriptionGroupResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .scheme(getScheme())
                .customerId(getCustomerId())
                .paymentProfileId(getPaymentProfileId())
                .subscriptionIds(getSubscriptionIds())
                .primarySubscriptionId(getPrimarySubscriptionId())
                .nextAssessmentAt(getNextAssessmentAt())
                .state(getState())
                .cancelAtEndOfPeriod(getCancelAtEndOfPeriod())
                .currentBillingAmountInCents(getCurrentBillingAmountInCents())
                .customer(getCustomer())
                .accountBalances(getAccountBalances());
        return builder;
    }

    /**
     * Class to build instances of {@link FullSubscriptionGroupResponse}.
     */
    public static class Builder {
        private String uid;
        private Integer scheme;
        private Integer customerId;
        private Integer paymentProfileId;
        private List<Integer> subscriptionIds;
        private Integer primarySubscriptionId;
        private ZonedDateTime nextAssessmentAt;
        private String state;
        private Boolean cancelAtEndOfPeriod;
        private Long currentBillingAmountInCents;
        private SubscriptionGroupCustomer customer;
        private SubscriptionGroupBalances accountBalances;



        /**
         * Setter for uid.
         * @param  uid  String value for uid.
         * @return Builder
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Setter for scheme.
         * @param  scheme  Integer value for scheme.
         * @return Builder
         */
        public Builder scheme(Integer scheme) {
            this.scheme = scheme;
            return this;
        }

        /**
         * Setter for customerId.
         * @param  customerId  Integer value for customerId.
         * @return Builder
         */
        public Builder customerId(Integer customerId) {
            this.customerId = customerId;
            return this;
        }

        /**
         * Setter for paymentProfileId.
         * @param  paymentProfileId  Integer value for paymentProfileId.
         * @return Builder
         */
        public Builder paymentProfileId(Integer paymentProfileId) {
            this.paymentProfileId = paymentProfileId;
            return this;
        }

        /**
         * Setter for subscriptionIds.
         * @param  subscriptionIds  List of Integer value for subscriptionIds.
         * @return Builder
         */
        public Builder subscriptionIds(List<Integer> subscriptionIds) {
            this.subscriptionIds = subscriptionIds;
            return this;
        }

        /**
         * Setter for primarySubscriptionId.
         * @param  primarySubscriptionId  Integer value for primarySubscriptionId.
         * @return Builder
         */
        public Builder primarySubscriptionId(Integer primarySubscriptionId) {
            this.primarySubscriptionId = primarySubscriptionId;
            return this;
        }

        /**
         * Setter for nextAssessmentAt.
         * @param  nextAssessmentAt  ZonedDateTime value for nextAssessmentAt.
         * @return Builder
         */
        public Builder nextAssessmentAt(ZonedDateTime nextAssessmentAt) {
            this.nextAssessmentAt = nextAssessmentAt;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for cancelAtEndOfPeriod.
         * @param  cancelAtEndOfPeriod  Boolean value for cancelAtEndOfPeriod.
         * @return Builder
         */
        public Builder cancelAtEndOfPeriod(Boolean cancelAtEndOfPeriod) {
            this.cancelAtEndOfPeriod = cancelAtEndOfPeriod;
            return this;
        }

        /**
         * Setter for currentBillingAmountInCents.
         * @param  currentBillingAmountInCents  Long value for currentBillingAmountInCents.
         * @return Builder
         */
        public Builder currentBillingAmountInCents(Long currentBillingAmountInCents) {
            this.currentBillingAmountInCents = currentBillingAmountInCents;
            return this;
        }

        /**
         * Setter for customer.
         * @param  customer  SubscriptionGroupCustomer value for customer.
         * @return Builder
         */
        public Builder customer(SubscriptionGroupCustomer customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for accountBalances.
         * @param  accountBalances  SubscriptionGroupBalances value for accountBalances.
         * @return Builder
         */
        public Builder accountBalances(SubscriptionGroupBalances accountBalances) {
            this.accountBalances = accountBalances;
            return this;
        }

        /**
         * Builds a new {@link FullSubscriptionGroupResponse} object using the set fields.
         * @return {@link FullSubscriptionGroupResponse}
         */
        public FullSubscriptionGroupResponse build() {
            return new FullSubscriptionGroupResponse(uid, scheme, customerId, paymentProfileId,
                    subscriptionIds, primarySubscriptionId, nextAssessmentAt, state,
                    cancelAtEndOfPeriod, currentBillingAmountInCents, customer, accountBalances);
        }
    }
}
