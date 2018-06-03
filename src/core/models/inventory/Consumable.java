package core.models.inventory;

import java.util.Date;

public interface Consumable extends InventoryItem {
    Date getExpiration();
    void setExpiration(Date d);
}
