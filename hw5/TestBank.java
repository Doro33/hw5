public class TestBank {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Reza Ahmadi",new Account("0123456789", new CreditCard("9876543210", 250000)));
        Branch branch=new Branch("Shz01","Shiraz",1);

        System.out.println("calCustomerBalance Testing:");
        System.out.println(customer1.calCustomerBalance(customer1));
        System.out.println("***");
        System.out.println("Customer.toString() Testing:");
        System.out.println(customer1.toString());
        System.out.println("***");
        System.out.println("Account.toString() Testing:");
        System.out.println(customer1.getAccount().toString());
        System.out.println("***");
        System.out.println("CreditCard.toString() Testing:");
        System.out.println(customer1.getAccount().getCreditCard().toString());
        System.out.println("***");
        System.out.println("Branch.toString() Testing:");
        System.out.println(branch.toString());
    }
}