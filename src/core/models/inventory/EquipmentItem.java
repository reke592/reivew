package core.models.inventory;

import java.util.Date;

public class EquipmentItem implements Equipment {
    private int id;
    private String name;
    private String serialNumber;
    private Date dateOfPurchase;
    private InventoryItemStatus status;

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    @Override
    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    @Override
    public InventoryItemStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(InventoryItemStatus status) {
        this.status = status;
    }
}
