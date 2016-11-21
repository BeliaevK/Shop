package Entities;

/**
 * Created by Scala on 21.11.2016.
 */
public abstract class AbstractGoods {
    private int id;
    protected Enum cost;
    protected String name;
    private Date payDate;


    public AbstractPurchases(Enum cost) {
        id = IdGenerator.nextId();
        this.cost = cost;
        payDate = new Date();
    }

    public void toUse() {
        System.out.println("I'm a " + name + " and I'm very useful.");
    }

    public Enum getCost() {
        return cost;
    }
}
