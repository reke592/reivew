package core.models.inventory2;

public interface InventoryRequest {
    void setRequestStatus(RequestStatus status);
    RequestStatus getRequestStatus();
}
