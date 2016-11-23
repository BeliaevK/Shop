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
        ArrayList<GoodsStock> buyerGoodsStockArray = Initialization.getInstance().initBuyerGoodsStockArray();
        for (int i = 0; i < shopGoodsStockArray.size(); i++) {
            System.out.println(shopGoodsStockArray.get(i));
        }
        while (true) {
            System.out.println("Введите запрос. Пример: \nc - создать запись, r - просмотреть список, u - " +
                    "обновить запись, d - удалить запись");
            StringReader.getInstance().orderRead(shopGoodsStockArray);
        }
    }
}
