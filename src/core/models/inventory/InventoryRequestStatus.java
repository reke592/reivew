package core.models.inventory;

public enum InventoryRequestStatus {
    RECEIVED,
    SEEN,
    IN_PROCESS,
    READY_FOR_PICKUP,
    TRANSACTION_CANCELLED,
    TRANSACTION_CLOSED
}
