package Factory.ItemFactory;

/**
 * Created by Scala on 20.11.2016.
 */
public interface AbstractGoodsFactory {

    AbstractPurchases createGoods(ProductType productType, CostTypes cost);
}
