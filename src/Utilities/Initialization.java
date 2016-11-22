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
        shopGoodsStockArray.add(new GoodsStock(IdGenerator.nextId(), "Батон 'Нарезной'" , GoodsStock.TypeGoods.PRODUCTS, GoodsStock.CategoriesGoods.BREAD,20));
        shopGoodsStockArray.add(new GoodsStock(IdGenerator.nextId(), "Молоко" , GoodsStock.TypeGoods.PRODUCTS, GoodsStock.CategoriesGoods.MILK,30));
        shopGoodsStockArray.add(new GoodsStock(IdGenerator.nextId(), "Куртка" , GoodsStock.TypeGoods.CLOTHES, GoodsStock.CategoriesGoods.OUTERWEAR,5500));
        shopGoodsStockArray.add(new GoodsStock(IdGenerator.nextId(), "Nintendo" , GoodsStock.TypeGoods.ELECTRONICS,GoodsStock.CategoriesGoods.CONSOLE, 3600));
        shopGoodsStockArray.add(new GoodsStock(IdGenerator.nextId(), "Sony PlayStation" , GoodsStock.TypeGoods.ELECTRONICS, GoodsStock.CategoriesGoods.CONSOLE, 30000));
        shopGoodsStockArray.add(new GoodsStock(IdGenerator.nextId(), "Пицца 'Пепперони'" , GoodsStock.TypeGoods.PRODUCTS, GoodsStock.CategoriesGoods.PIZZA,500));
        shopGoodsStockArray.add(new GoodsStock(IdGenerator.nextId(), "Футболка" , GoodsStock.TypeGoods.CLOTHES, GoodsStock.CategoriesGoods.TSHIRT,400));
        shopGoodsStockArray.add(new GoodsStock(IdGenerator.nextId(), "Шорты" , GoodsStock.TypeGoods.CLOTHES, GoodsStock.CategoriesGoods.SHORTS,1250));
        shopGoodsStockArray.add(new GoodsStock(IdGenerator.nextId(), "Телевизор" , GoodsStock.TypeGoods.CLOTHES, GoodsStock.CategoriesGoods.TV,1250));
        return shopGoodsStockArray;
    }

}
