package core.models.inventory;

import core.models.Person;

import java.util.List;

public class InventoryRequest {
    private int id;
    private List<InventoryItemRequest> items;
    private InventoryItemRequestStatus status;
    private Person whoRequest;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<InventoryItemRequest> getItems() {
        return items;
    }

    // setItems: use the entire list provided
    // pre-condition: list is NOT null
    // post-condition: this.list = items, items.each.whoRequest = this.whoRequest
    public void setItems(List<InventoryItemRequest> items) {
        if(items == null) return;
        items.forEach(item -> item.setWhoRequest(this.whoRequest));
        this.items = items;
    }

    // addItem: add one item in List<InventoryItemRequest>
    // pre-condition: itemRequest is NOT null
    // post-condition: add one itemRequest in list, itemRequest.whoRequest = this.whoRequest
    public void addItem(InventoryItemRequest itemRequest) {
        if(itemRequest == null) return;
        itemRequest.setWhoRequest(this.whoRequest);
        this.items.add(itemRequest);
    }

    // remove the itemRequest in list and return to caller
    public InventoryItemRequest removeItem(int index) {
        return this.items.remove(index);
    }

    public InventoryItemRequestStatus getStatus() {
        return status;
    }

    public void setStatus(InventoryItemRequestStatus status) {
        this.status = status;
    }

    public Person getWhoRequest() {
        return whoRequest;
    }

    public void setWhoRequest(Person whoRequest) {
        this.whoRequest = whoRequest;
    }
}
