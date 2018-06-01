package core.models.inventory;

public interface Consumable {
    void replenish(int n);
    int getStock();
}
