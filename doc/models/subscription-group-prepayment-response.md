
# Subscription Group Prepayment Response

## Structure

`SubscriptionGroupPrepaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `AmountInCents` | `Long` | Optional | The amount in cents of the entry. | Long getAmountInCents() | setAmountInCents(Long amountInCents) |
| `EndingBalanceInCents` | `Long` | Optional | The ending balance in cents of the account. | Long getEndingBalanceInCents() | setEndingBalanceInCents(Long endingBalanceInCents) |
| `EntryType` | [`ServiceCreditType`](../../doc/models/service-credit-type.md) | Optional | The type of entry | ServiceCreditType getEntryType() | setEntryType(ServiceCreditType entryType) |
| `Memo` | `String` | Optional | A memo attached to the entry. | String getMemo() | setMemo(String memo) |

## Example (as JSON)

```json
{
  "id": 110,
  "amount_in_cents": 196,
  "ending_balance_in_cents": 236,
  "entry_type": "Credit",
  "memo": "memo2"
}
```

