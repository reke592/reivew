package core.models.inventory;

import core.models.Person;

public class InventoryItemRequest {
    private int requestId;
    private int count;
    private InventoryItem item;
    private Person whoRequest;
    private InventoryItemRequestStatus reqStatus;

    // returns the parent InventoryRequest id
    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getCount() {
        return count;
    }

    // pre-condition: count MUST be non-negative value AND not-greater-than 100
    // post-condition: this.count = count
    public void setCount(int count) {
        if(count > 0 && count <= 100) {
            this.count = count;
        }
    }

    public InventoryItem getItem() {
        return item;
    }

    public void setItem(InventoryItem item) {
        this.item = item;
    }

    public Person getWhoRequest() {
        return whoRequest;
    }

    public void setWhoRequest(Person whoRequest) {
        this.whoRequest = whoRequest;
    }

    public InventoryItemRequestStatus getReqStatus() {
        return reqStatus;
    }

    public void setReqStatus(InventoryItemRequestStatus reqStatus) {
        this.reqStatus = reqStatus;
    }
}
