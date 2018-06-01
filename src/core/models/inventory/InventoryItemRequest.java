package core.models.inventory;

public class InventoryItemRequest {
    private int count;
    private InventoryItem item;

    public InventoryItemRequest(InventoryItem item, int count) {
        this.item = item;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public InventoryItem getItem() {
        return item;
    }

}
