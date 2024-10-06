package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {

        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = createOrder("두부", 2000, 2);
        productOrders[1] = createOrder("김치", 5000, 1);
        productOrders[2] = createOrder("콜라", 1500, 2);

        printOrder(productOrders);
       int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 상품 금액:" +totalAmount);



    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;

    }

    static void printOrder(ProductOrder[] productOrders){
        for(int i=0; i<productOrders.length; i++) {
            System.out.println("상품명:" + productOrders[i].productName + " 가격:" + productOrders[i].price + " 수량:" + productOrders[i].quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] productOrders){
        int totalAmount = 0;
        for (ProductOrder productOrder : productOrders) {
            totalAmount += productOrder.price * productOrder.quantity;
        }
        return totalAmount;
    }
}