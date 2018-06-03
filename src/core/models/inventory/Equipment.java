package core.models.inventory;

import java.util.Date;

public interface Equipment extends InventoryItem {
    String getSerialNumber();
    void setSerialNumber(String serial);
    InventoryItemStatus getStatus();
    void setStatus(InventoryItemStatus status);
    Date getDateOfPurchase();
    void setDateOfPurchase(Date d);
}
