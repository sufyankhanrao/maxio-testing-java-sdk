
# Prepayment Account Balance Changed

## Structure

`PrepaymentAccountBalanceChanged`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | `String` | Required | - | String getReason() | setReason(String reason) |
| `PrepaymentAccountBalanceInCents` | `long` | Required | - | long getPrepaymentAccountBalanceInCents() | setPrepaymentAccountBalanceInCents(long prepaymentAccountBalanceInCents) |
| `PrepaymentBalanceChangeInCents` | `long` | Required | - | long getPrepaymentBalanceChangeInCents() | setPrepaymentBalanceChangeInCents(long prepaymentBalanceChangeInCents) |
| `CurrencyCode` | `String` | Required | - | String getCurrencyCode() | setCurrencyCode(String currencyCode) |

## Example (as JSON)

```json
{
  "reason": "reason4",
  "prepayment_account_balance_in_cents": 182,
  "prepayment_balance_change_in_cents": 206,
  "currency_code": "currency_code4"
}
```

