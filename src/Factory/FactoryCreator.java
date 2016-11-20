package Factory;

import Factory.ItemFactory.AbstractGoodsFactory;

/**
 * Created by Scala on 20.11.2016.
 */
public class FactoryCreator {

    private AbstractGoodsFactory clothesFactory = new ClothesFactory();
    private AbstractGoodsFactory foodFactory = new FoodFactory();
    private AbstractGoodsFactory utilitiesFactory = new UtilitiesFactory();

    public AbstractGoodsFactory getFactory(Types purchasesTypes) {
        if(PurchasesTypes.CLOTHES.equals(purchasesTypes))
            return clothesFactory;
        else if(PurchasesTypes.FOOD.equals(purchasesTypes))
            return foodFactory;
        else if(PurchasesTypes.UTILITIES.equals(purchasesTypes))
            return utilitiesFactory;
        return null;
    }
}
