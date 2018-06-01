package core.models.inventory;

import core.models.Employee;

import java.util.Date;

public class EquipmentItemImpl implements Equipment, InventoryItem {
    private int id;
    private String name;
    private Date dateOfPurchase;
    private EquipmentStatus status;
    private Employee careOf;
    private String serialNum;

    @Override
    public Date getDatePurchase() {
        return this.dateOfPurchase;
    }

    @Override
    public void setDatePurchase(Date d) {
        this.dateOfPurchase = d;
    }

    @Override
    public String getSerialNumber() {
        return this.serialNum;
    }

    @Override
    public void setSerialNumber(String s) {
        this.serialNum = s;
    }

    @Override
    public String getStatus() {
        return this.status.name();
    }

    @Override
    public void setStatus(EquipmentStatus status) {
        this.status = status;
    }

    @Override
    public Employee getCareOf() {
        return this.careOf;
    }

    // pre-condition: e is NOT null
    // post-condition: equipment will be added in employee inventory equipment-care-of
    @Override
    public void setCareOf(Employee e) {
        this.careOf = e;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
