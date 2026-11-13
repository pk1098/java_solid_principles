package adapter_design_pattern;

public class CheckoutFacade {
    private final InventoryService inventoryService;
    private final PaymentProcessor paymentProcessor;
    private final ConfirmationService confirmationService;

    public CheckoutFacade(PaymentProcessor paymentProcessor) {
        this.inventoryService = new InventoryService();
        this.paymentProcessor = paymentProcessor;
        this.confirmationService = new ConfirmationService();
    }

    public void checkout(String productId, int amountInRupees) {
        if (!inventoryService.isInStock(productId)) {
            throw new IllegalStateException("Product is out of stock");
        }
        paymentProcessor.pay(amountInRupees);
        confirmationService.sendConfirmation(productId);
    }
}
