
# Subscription Component Subscription

An optional object, will be returned if provided `include=subscription` query param.

## Structure

`SubscriptionComponentSubscription`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `State` | [`SubscriptionState`](../../doc/models/subscription-state.md) | Optional | The state of a subscription.<br><br>* **Live States**<br>  * `active` - A normal, active subscription. It is not in a trial and is paid and up to date.<br>  * `assessing` - An internal (transient) state that indicates a subscription is in the middle of periodic assessment. Do not base any access decisions in your app on this state, as it may not always be exposed.<br>  * `pending` - An internal (transient) state that indicates a subscription is in the creation process. Do not base any access decisions in your app on this state, as it may not always be exposed.<br>  * `trialing` - A subscription in trialing state has a valid trial subscription. This type of subscription may transition to active once payment is received when the trial has ended. Otherwise, it may go to a Problem or End of Life state.<br>  * `paused` - An internal state that indicates that your account with Advanced Billing is in arrears.<br>* **Problem States**<br>  * `past_due` - Indicates that the most recent payment has failed, and payment is past due for this subscription. If you have enabled our automated dunning, this subscription will be in the dunning process (additional status and callbacks from the dunning process will be available in the future). If you are handling dunning and payment updates yourself, you will want to use this state to initiate a payment update from your customers.<br>  * `soft_failure` - Indicates that normal assessment/processing of the subscription has failed for a reason that cannot be fixed by the Customer. For example, a Soft Fail may result from a timeout at the gateway or incorrect credentials on your part. The subscriptions should be retried automatically. An interface is being built for you to review problems resulting from these events to take manual action when needed.<br>  * `unpaid` - Indicates an unpaid subscription. A subscription is marked unpaid if the retry period expires and you have configured your [Dunning](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405505141005) settings to have a Final Action of `mark the subscription unpaid`.<br>* **End of Life States**<br>  * `canceled` - Indicates a canceled subscription. This may happen at your request (via the API or the web interface) or due to the expiration of the [Dunning](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405505141005) process without payment. See the [Reactivation](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404559291021) documentation for info on how to restart a canceled subscription.<br>    While a subscription is canceled, its period will not advance, it will not accrue any new charges, and Advanced Billing will not attempt to collect the overdue balance.<br>  * `expired` - Indicates a subscription that has expired due to running its normal life cycle. Some products may be configured to have an expiration period. An expired subscription then is one that stayed active until it fulfilled its full period.<br>  * `failed_to_create` - Indicates that signup has failed. (You may see this state in a signup_failure webhook.)<br>  * `on_hold` - Indicates that a subscription’s billing has been temporarily stopped. While it is expected that the subscription will resume and return to active status, this is still treated as an “End of Life” state because the customer is not paying for services during this time.<br>  * `suspended` - Indicates that a prepaid subscription has used up all their prepayment balance. If a prepayment is applied, it will return to an active state.<br>  * `trial_ended` - A subscription in a trial_ended state is a subscription that completed a no-obligation trial and did not have a card on file at the expiration of the trial period. See [Product Pricing – No Obligation Trials](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405246782221) for more details.<br><br>See [Subscription States](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404222005773) for more info about subscription states and state transitions. | SubscriptionState getState() | setState(SubscriptionState state) |
| `UpdatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getUpdatedAt() | setUpdatedAt(ZonedDateTime updatedAt) |

## Example (as JSON)

```json
{
  "state": "paused",
  "updated_at": "2016-03-13T12:52:32.123Z"
}
```
