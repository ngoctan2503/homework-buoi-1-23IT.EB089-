import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date, double serviceExpense, double productExpense) {
        this.customer = customer;
        this.date = date;
        this.serviceExpense = serviceExpense;
        this.productExpense = productExpense;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getDate() {
        return date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        double discountService = 0.0;
        double discountProduct = DiscountRate.PRODUCT_DISCOUNT_PREMIUM;

        if (customer.isMember()) {
            discountService = DiscountRate.getServiceDiscountRate(customer.getMemberType());
            discountProduct = DiscountRate.getProductDiscountRate(customer.getMemberType());
        }

        return serviceExpense * (1 - discountService) + productExpense * (1 - discountProduct);
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                ", totalExpense=" + getTotalExpense() +
                '}';
    }
}
