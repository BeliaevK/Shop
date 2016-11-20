package Utilities;

import Entities.GoodsStock;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Scala on 20.11.2016.
 */
public class Initialization {
    private static Initialization instance;

    public static Initialization getInstance() {
        if (instance == null) {
            instance = new Initialization();
        }
        return instance;
    }

    public static ArrayList<GoodsStock> initShopGoodsStockArray() {
        ArrayList<GoodsStock> shopGoodsStockArray = new ArrayList<>();
        shopGoodsStockArray.add(new GoodsStock(UUID.randomUUID(), "Хлеб" , GoodsStock.TypeGoods.PRODUCTS,20));
        shopGoodsStockArray.add(new GoodsStock(UUID.randomUUID(), "Молоко" , GoodsStock.TypeGoods.PRODUCTS,30));
        shopGoodsStockArray.add(new GoodsStock(UUID.randomUUID(), "Куртка" , GoodsStock.TypeGoods.CLOTHES,5500));
        shopGoodsStockArray.add(new GoodsStock(UUID.randomUUID(), "Nintendo" , GoodsStock.TypeGoods.ELECTRONICS,3600));
        shopGoodsStockArray.add(new GoodsStock(UUID.randomUUID(), "Sony PlayStation" , GoodsStock.TypeGoods.ELECTRONICS,30000));
        shopGoodsStockArray.add(new GoodsStock(UUID.randomUUID(), "Пицца" , GoodsStock.TypeGoods.PRODUCTS,500));
        shopGoodsStockArray.add(new GoodsStock(UUID.randomUUID(), "Футболка" , GoodsStock.TypeGoods.CLOTHES,400));
        shopGoodsStockArray.add(new GoodsStock(UUID.randomUUID(), "Джинсы" , GoodsStock.TypeGoods.CLOTHES,1250));
        return shopGoodsStockArray;
    }

}
