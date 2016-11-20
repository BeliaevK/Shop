import Entities.GoodsStock;
import Utilities.Initialization;

import java.util.ArrayList;

/**
 * Created by Scala on 20.11.2016.
 */
public class main {
    public static void main(String[] args) {
        ArrayList<GoodsStock> shopGoodsStock = Initialization.getInstance().initShopGoodsStockArray();
        for (int i = 0; i < shopGoodsStock.size(); i++) {
            System.out.println(shopGoodsStock.get(i));
        }
    }
}
