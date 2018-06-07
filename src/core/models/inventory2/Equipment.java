package core.models.inventory2;

import java.util.Date;

public class Equipment {
    private int id;
    private String serial;
    private String name;
    private Date dtPurchase;
    private boolean inUsed;
    private InventoryItemType itemType;
    private EquipmentStatus status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDtPurchase() {
        return dtPurchase;
    }

    public void setDtPurchase(Date dtPurchase) {
        this.dtPurchase = dtPurchase;
    }

    public boolean isInUsed() {
        return inUsed;
    }

    public void setInUsed(boolean inUsed) {
        this.inUsed = inUsed;
    }

    public InventoryItemType getItemType() {
        return itemType;
    }

    public void setItemType(InventoryItemType itemType) {
        this.itemType = itemType;
    }

    public EquipmentStatus getStatus() {
        return status;
    }

    public void setStatus(EquipmentStatus status) {
        this.status = status;
    }
}
