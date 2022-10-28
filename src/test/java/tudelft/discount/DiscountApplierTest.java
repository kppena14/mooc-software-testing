package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest
{
    @Test
    void ApplierTest()
    {
        Product suit = new Product("Suit", 100, "BUSINESS");
        Product blender = new Product("Blender", 50, "HOME");

        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> results = Arrays.asList(suit, blender);
        Mockito.when(dao.all()).thenReturn(results);

        DiscountApplier applier = new DiscountApplier(dao);
        List<Product> result = applier.setNewPrices();

        Assertions.assertEquals(110.00000000000001, suit.getPrice());
        Assertions.assertEquals(45, blender.getPrice());

    }

}
