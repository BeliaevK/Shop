import Entities.GoodsStock;
import Utilities.Initialization;
import Utilities.StringReader;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Scala on 20.11.2016.
 */
public class main {
    public static void main(String[] args) throws IOException {
        ArrayList<GoodsStock> shopGoodsStockArray = Initialization.getInstance().initShopGoodsStockArray();
        ArrayList<GoodsStock> basketGoodsStockArray = Initialization.getInstance().initBasketGoodsStockArray();


/*        for (int i = 0; i < shopGoodsStockArray.size(); i++) {
            System.out.println(shopGoodsStockArray.get(i));
        }*/
        while (true) {
            System.out.println("Введите запрос. Пример: \nb - купить товар, r - просмотреть список товаров,с - добавить " +
                    "товар, u - обновить информацию о товаре, d - удалить товар");
            StringReader.getInstance().orderRead(shopGoodsStockArray, basketGoodsStockArray);
        }
    }
}