package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 1000;
        productOrder2.quantity = 3;

        ProductOrder[] productOrders = new ProductOrder[]{productOrder1, productOrder2};

        int totalAmount = 0;
        for(int i=0; i<productOrders.length; i++){
            System.out.println("상품명:"+productOrders[i].productName+ " 가격:" +productOrders[i].price+ " 수량"+productOrders[i].quantity);
           totalAmount += productOrders[i].price*productOrders[i].quantity;
        }
        System.out.println("총 결제 금액:" +totalAmount);
    }
}
