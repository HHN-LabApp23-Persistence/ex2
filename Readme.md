### Persistence in Android

# Exercise 2: Solution

This is our solution for exercise 2. You can use it as a reference and compare it to your own solution.

## What code was originally provided?

The provided code contained an example Customer-Relationship-Management (CRM) app. The app consisted of two areas that were accessed via a navigation drawer: _Customers_ and _Invoices_. Both of these areas showed a list of customers or invoices respectively. The list items could be clicked to edit the customer/invoice.

However, persistence was only implemented for adding new customers and listing them ((C)reate and (R)ead in CRUD).

## What was the assignment?

- Implement persistence for editing customers (that's the (U)pdate in CRUD). You can find the relevant code in `components/customers/CustomerDetails.kt` and `viewmodel/CustomerDetailsViewModel.kt`.
- Prepare persistence for invoices by creating an _Entity_ and a _DAO_ for invoices. Insert your code/files in places that make sense.
- Implement persistence to adding invoices (that's the (C)reate in CRUD). You can find the relevant code in `components/invoices/InvoiceDetails.kt` and `viewmodel/InvoiceDetailsViewModel.kt`.
- Make the list of invoices be loaded from the database. You can find the relevant code in `components/invoices/InvoicesOverview.kt` and `viewmodel/InvoicesOverviewViewModel.kt`.

## Grading

| Task                               | Points |
| ---------------------------------- | ------ |
| Persistence for updating customers | 1.0    |
| Invoices entity                    | 0.5    |
| Invoices DAO                       | 0.5    |
| Persistence for adding invoices    | 0.5    |
| Loading invoices from database     | 0.5    |
| _Total_                            | 3.0    |
