public class Customer {
    private String name;
    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n'+
                "Account number: " + account.getAccountNumber() + '\n' +
                "Card number: "+ account.getCreditCard().getCardNumber();
    }

    public double calCustomerBalance(Customer customer){
        return customer.getAccount().getCreditCard().getCredit();
    }
}
