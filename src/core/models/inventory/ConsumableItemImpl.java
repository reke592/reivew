package core.models.inventory;

public class ConsumableItemImpl implements Consumable, InventoryItem {
    private int id;
    private String name;
    private int stock;

    // pre-condition: non-zero value for parameter n
    // post-condition: stock += n
    @Override
    public void replenish(int n) {
        // get the absolute value of n
        // return updated stock
        this.stock += Math.abs(n);
    }

    @Override
    public int getStock() {
        return this.stock;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
