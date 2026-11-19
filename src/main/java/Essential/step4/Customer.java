package Essential.step4;

public class Customer {
    private String customerName;
    private String email;
    private String membership;

    public Customer (String customerName, String email, String membership) {
        this.customerName = customerName;
        this.email = email;
        this.membership = membership;
    }

    public String getCustomerName () {
        return this.customerName;
    }
    public String getEmail () {
        return this.email;
    }
    public String getMembership () {
        return this.membership;
    }
}
