package core.models.inventory;

public interface InventoryStock {
    void replenish(Consumable item, int n);
    void addNew(Consumable item);
    void addNew(Equipment item);
}
