public class OrderTest {
    public static void main(String[] args) {

        Order order = new OrderAction();
        InvoiceGenerator invoiceGenerator = new InvoiceGeneratorImpl();
        EmailNotifier emailNotifier = new EmailNotifierImpl();

        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        invoiceGenerator.generateInvoice("order_123.pdf");
        emailNotifier.sendEmailNotification("johndoe@example.com");
    }
}