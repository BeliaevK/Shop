import Entities.GoodsStock;
import Utilities.Initialization;
import Utilities.StringReader;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Scala on 20.11.2016.
 */
public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<GoodsStock> shopGoodsStockArray = Initialization.getInstance().initShopGoodsStockArray();
        ArrayList<GoodsStock> basketGoodsStockArray = Initialization.getInstance().initBasketGoodsStockArray();
/*        for (int i = 0; i < shopGoodsStockArray.size(); i++) {
            System.out.println(shopGoodsStockArray.get(i));
        }*/
        String basket = "basker.txt";
       try {
           FileOutputStream outputStream = new FileOutputStream(basket);
           ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
           objectOutputStream.writeObject(basketGoodsStockArray);


           objectOutputStream.reset();
           objectOutputStream.close();
           outputStream.close();

           FileInputStream inputStream = new FileInputStream(basket);
           ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
           while (inputStream.available() > 0) {
               ArrayList<GoodsStock> basketGoodsStockArray1 = (ArrayList<GoodsStock>) objectInputStream.readObject();
           }
       }catch (ClassNotFoundException | IOException e){
           e.printStackTrace();
       }
        while (true) {
            System.out.println("Введите запрос. Пример: \nb - купить товар, r - просмотреть список товаров,с - добавить " +
                    "товар, u - обновить информацию о товаре, d - удалить товар");
            StringReader.getInstance().orderRead(shopGoodsStockArray, basketGoodsStockArray);
        }
    }
}