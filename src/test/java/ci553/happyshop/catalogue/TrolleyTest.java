package ci553.happyshop.catalogue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrolleyTest {

    @Test
    void addProduct() {
        Product p1 = new Product("0001", "TV", 300.45);
        Product p3 = new Product("0003", "Toaster", 30.45);

        Trolley trolley = new Trolley();

        trolley.addProduct(p1);
        trolley.addProduct(p1);
        trolley.addProduct(p3);
        trolley.addProduct(p3);
        trolley.addProduct(p1);

        assertEquals(2, trolley.getProducts().size()); /*as there are only two different types of items*/
        assertEquals(3, trolley.getProducts().get(0).getOrderedQuantity()); /*as there are 3 lots of p1, 0 = trolley order*/
        assertEquals(2, trolley.getProducts().get(1).getOrderedQuantity()); /*as there are 2 lots of p3*/
    }
}