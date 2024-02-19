package app.view;

import app.entitis.ProductEntiti;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class AppView {
    public void getAllItems(Map<Integer, ProductEntiti> map) {
        AtomicInteger atomicInteger = new AtomicInteger();
        map.forEach((key, value) ->
                System.out.println(atomicInteger.incrementAndGet() + " ) " + "Id " + key + " " + value)

        );
    }

    public void getOneItem(ProductEntiti product) {
        System.out.println(product.toString());
    }

    public String getMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                """
                        Menu:
                            1-get all items
                            2-get by Id
                            3-exit
                        """);
        return scanner.next();
    }

    public int getIndex() {
        System.out.println("Enter index of item");
        return new Scanner(System.in).nextInt();
    }

}
