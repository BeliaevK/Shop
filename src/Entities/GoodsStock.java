package Entities;

/**
 * Created by Scala on 20.11.2016.
 */
public class GoodsStock {
    private int id;
    private String name;
    private TypeGoods typeGoods;
    private int sum;

    public enum TypeGoods {
        PRODUCTS , CLOTHES , ELECTRONICS;
    }

    public GoodsStock(int id, String name, TypeGoods typeGoods, int sum) {
        this.setId(id);
        this.setName(name);
        this.setTypeGoods(typeGoods);
        this.setSum(sum);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public TypeGoods getTypeGoods() {
        return typeGoods;
    }

    public void setTypeGoods(TypeGoods typeGoods) {
        this.typeGoods = typeGoods;
    }

    @Override
    public String toString() {
        return this.id + ", Наименование: " + this.name + ", тип: " + this.typeGoods + ", цена: " + this.sum;
    }

}
