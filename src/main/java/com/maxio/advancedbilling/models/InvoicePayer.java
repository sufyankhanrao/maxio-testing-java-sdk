/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for InvoicePayer type.
 */
public class InvoicePayer
        extends BaseModel {
    private Integer chargifyId;
    private String firstName;
    private String lastName;
    private OptionalNullable<String> organization;
    private String email;
    private OptionalNullable<String> vatNumber;

    /**
     * Default constructor.
     */
    public InvoicePayer() {
    }

    /**
     * Initialization constructor.
     * @param  chargifyId  Integer value for chargifyId.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  organization  String value for organization.
     * @param  email  String value for email.
     * @param  vatNumber  String value for vatNumber.
     */
    public InvoicePayer(
            Integer chargifyId,
            String firstName,
            String lastName,
            String organization,
            String email,
            String vatNumber) {
        this.chargifyId = chargifyId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.organization = OptionalNullable.of(organization);
        this.email = email;
        this.vatNumber = OptionalNullable.of(vatNumber);
    }

    /**
     * Initialization constructor.
     * @param  chargifyId  Integer value for chargifyId.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  organization  String value for organization.
     * @param  email  String value for email.
     * @param  vatNumber  String value for vatNumber.
     */

    protected InvoicePayer(Integer chargifyId, String firstName, String lastName,
            OptionalNullable<String> organization, String email,
            OptionalNullable<String> vatNumber) {
        this.chargifyId = chargifyId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.organization = organization;
        this.email = email;
        this.vatNumber = vatNumber;
    }

    /**
     * Getter for ChargifyId.
     * @return Returns the Integer
     */
    @JsonGetter("chargify_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getChargifyId() {
        return chargifyId;
    }

    /**
     * Setter for ChargifyId.
     * @param chargifyId Value for Integer
     */
    @JsonSetter("chargify_id")
    public void setChargifyId(Integer chargifyId) {
        this.chargifyId = chargifyId;
    }

    /**
     * Getter for FirstName.
     * @return Returns the String
     */
    @JsonGetter("first_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * @param firstName Value for String
     */
    @JsonSetter("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * @return Returns the String
     */
    @JsonGetter("last_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * @param lastName Value for String
     */
    @JsonSetter("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Internal Getter for Organization.
     * @return Returns the Internal String
     */
    @JsonGetter("organization")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetOrganization() {
        return this.organization;
    }

    /**
     * Getter for Organization.
     * @return Returns the String
     */
    public String getOrganization() {
        return OptionalNullable.getFrom(organization);
    }

    /**
     * Setter for Organization.
     * @param organization Value for String
     */
    @JsonSetter("organization")
    public void setOrganization(String organization) {
        this.organization = OptionalNullable.of(organization);
    }

    /**
     * UnSetter for Organization.
     */
    public void unsetOrganization() {
        organization = null;
    }

    /**
     * Getter for Email.
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Internal Getter for VatNumber.
     * @return Returns the Internal String
     */
    @JsonGetter("vat_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetVatNumber() {
        return this.vatNumber;
    }

    /**
     * Getter for VatNumber.
     * @return Returns the String
     */
    public String getVatNumber() {
        return OptionalNullable.getFrom(vatNumber);
    }

    /**
     * Setter for VatNumber.
     * @param vatNumber Value for String
     */
    @JsonSetter("vat_number")
    public void setVatNumber(String vatNumber) {
        this.vatNumber = OptionalNullable.of(vatNumber);
    }

    /**
     * UnSetter for VatNumber.
     */
    public void unsetVatNumber() {
        vatNumber = null;
    }

    /**
     * Converts this InvoicePayer into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoicePayer [" + "chargifyId=" + chargifyId + ", firstName=" + firstName
                + ", lastName=" + lastName + ", organization=" + organization + ", email=" + email
                + ", vatNumber=" + vatNumber + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link InvoicePayer.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoicePayer.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .chargifyId(getChargifyId())
                .firstName(getFirstName())
                .lastName(getLastName())
                .email(getEmail());
        builder.organization = internalGetOrganization();
        builder.vatNumber = internalGetVatNumber();
        return builder;
    }

    /**
     * Class to build instances of {@link InvoicePayer}.
     */
    public static class Builder {
        private Integer chargifyId;
        private String firstName;
        private String lastName;
        private OptionalNullable<String> organization;
        private String email;
        private OptionalNullable<String> vatNumber;



        /**
         * Setter for chargifyId.
         * @param  chargifyId  Integer value for chargifyId.
         * @return Builder
         */
        public Builder chargifyId(Integer chargifyId) {
            this.chargifyId = chargifyId;
            return this;
        }

        /**
         * Setter for firstName.
         * @param  firstName  String value for firstName.
         * @return Builder
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Setter for lastName.
         * @param  lastName  String value for lastName.
         * @return Builder
         */
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Setter for organization.
         * @param  organization  String value for organization.
         * @return Builder
         */
        public Builder organization(String organization) {
            this.organization = OptionalNullable.of(organization);
            return this;
        }

        /**
         * UnSetter for organization.
         * @return Builder
         */
        public Builder unsetOrganization() {
            organization = null;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Setter for vatNumber.
         * @param  vatNumber  String value for vatNumber.
         * @return Builder
         */
        public Builder vatNumber(String vatNumber) {
            this.vatNumber = OptionalNullable.of(vatNumber);
            return this;
        }

        /**
         * UnSetter for vatNumber.
         * @return Builder
         */
        public Builder unsetVatNumber() {
            vatNumber = null;
            return this;
        }

        /**
         * Builds a new {@link InvoicePayer} object using the set fields.
         * @return {@link InvoicePayer}
         */
        public InvoicePayer build() {
            return new InvoicePayer(chargifyId, firstName, lastName, organization, email,
                    vatNumber);
        }
    }
}
