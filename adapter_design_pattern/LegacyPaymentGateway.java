package adapter_design_pattern;

public class LegacyPaymentGateway {
    public void makePaymentInPaise(long amountInPaise) {
        System.out.println(
            "Legacy gateway charged " + amountInPaise + " paise"
        );
    }
}
