package Factory.ItemFactory;

/**
 * Created by Scala on 21.11.2016.
 */
public class ClothesFactory {

    @Override
    public AbstractPurchases createProduct(ProductType productType, CostTypes cost) {
        if(ProductType.JACKET.equals(productType))
            return new Jacket(cost);
        else if(ProductType.JEANS.equals(productType))
            return  new Jeans(cost);
        else if(ProductType.SHOES.equals(productType))
            return new Shoes(cost);
        else return null;
    }
}
