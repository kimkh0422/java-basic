package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] productOrders = new ProductOrder[n];
        for(int i=0; i< productOrders.length; i++){
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); //입력 버퍼를 지우기 위한 코드

            productOrders[i] = createOrder(productName, price, quantity);
        }





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