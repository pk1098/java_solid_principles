package complicated_examples.FoodDeliveryOrderSystem;

public class Order {
    private final String customerName;
    private final String foodType;
    private final int quantity;
    private final String deliveryAddress;
    private final boolean extraCheese;
    private final boolean extraSauce;

    private Order(Builder builder) {
        if(builder.customerName == null || builder.customerName.isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be null or empty");
        }
        if(builder.foodType == null || builder.foodType.isEmpty()) {
            throw new IllegalArgumentException("Food type cannot be null or empty");
        }
        if(builder.quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }
        if(builder.deliveryAddress == null || builder.deliveryAddress.isEmpty()) {
            throw new IllegalArgumentException("Delivery address cannot be null or empty");
        }
        this.customerName = builder.customerName;
        this.foodType = builder.foodType;
        this.quantity = builder.quantity;
        this.deliveryAddress = builder.deliveryAddress;
        this.extraCheese = builder.extraCheese;
        this.extraSauce = builder.extraSauce;
    }

    public String getFoodType() {
        return foodType;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean hasExtraCheese() {
        return extraCheese;
    }

    public boolean hasExtraSauce() {
        return extraSauce;
    }

    public static class Builder {
        private String customerName;
        private String foodType;
        private int quantity;
        private String deliveryAddress;
        private boolean extraCheese = false; // default
        private boolean extraSauce = false;  // default

        public Builder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder setFoodType(String foodType) {
            this.foodType = foodType;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        public Builder setExtraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public Builder setExtraSauce(boolean extraSauce) {
            this.extraSauce = extraSauce;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
