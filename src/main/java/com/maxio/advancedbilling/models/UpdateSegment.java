/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for UpdateSegment type.
 */
public class UpdateSegment
        extends BaseModel {
    private PricingScheme pricingScheme;
    private List<CreateOrUpdateSegmentPrice> prices;

    /**
     * Default constructor.
     */
    public UpdateSegment() {
    }

    /**
     * Initialization constructor.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  prices  List of CreateOrUpdateSegmentPrice value for prices.
     */
    public UpdateSegment(
            PricingScheme pricingScheme,
            List<CreateOrUpdateSegmentPrice> prices) {
        this.pricingScheme = pricingScheme;
        this.prices = prices;
    }

    /**
     * Getter for PricingScheme.
     * The identifier for the pricing scheme. See [Product
     * Components](https://help.chargify.com/products/product-components.html) for an overview of
     * pricing schemes.
     * @return Returns the PricingScheme
     */
    @JsonGetter("pricing_scheme")
    public PricingScheme getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * The identifier for the pricing scheme. See [Product
     * Components](https://help.chargify.com/products/product-components.html) for an overview of
     * pricing schemes.
     * @param pricingScheme Value for PricingScheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(PricingScheme pricingScheme) {
        this.pricingScheme = pricingScheme;
    }

    /**
     * Getter for Prices.
     * @return Returns the List of CreateOrUpdateSegmentPrice
     */
    @JsonGetter("prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CreateOrUpdateSegmentPrice> getPrices() {
        return prices;
    }

    /**
     * Setter for Prices.
     * @param prices Value for List of CreateOrUpdateSegmentPrice
     */
    @JsonSetter("prices")
    public void setPrices(List<CreateOrUpdateSegmentPrice> prices) {
        this.prices = prices;
    }

    /**
     * Converts this UpdateSegment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateSegment [" + "pricingScheme=" + pricingScheme + ", prices=" + prices
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link UpdateSegment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateSegment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricingScheme)
                .prices(getPrices());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateSegment}.
     */
    public static class Builder {
        private PricingScheme pricingScheme;
        private List<CreateOrUpdateSegmentPrice> prices;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricingScheme  PricingScheme value for pricingScheme.
         */
        public Builder(PricingScheme pricingScheme) {
            this.pricingScheme = pricingScheme;
        }

        /**
         * Setter for pricingScheme.
         * @param  pricingScheme  PricingScheme value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(PricingScheme pricingScheme) {
            this.pricingScheme = pricingScheme;
            return this;
        }

        /**
         * Setter for prices.
         * @param  prices  List of CreateOrUpdateSegmentPrice value for prices.
         * @return Builder
         */
        public Builder prices(List<CreateOrUpdateSegmentPrice> prices) {
            this.prices = prices;
            return this;
        }

        /**
         * Builds a new {@link UpdateSegment} object using the set fields.
         * @return {@link UpdateSegment}
         */
        public UpdateSegment build() {
            return new UpdateSegment(pricingScheme, prices);
        }
    }
}
