package Factory.ItemFactory;

import Entities.AbstractGoods;
import Entities.GoodsStock;

/**
 * Created by Scala on 21.11.2016.
 */
public class ProductsFactory implements AbstractGoodsFactory {
    @Override
    public AbstractGoods createGoods(GoodsStock.TypeGoods typeGoods, GoodsStock.CategoriesGoods categoriesGoods) {
        return null;
    }
}
