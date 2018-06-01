package core.models.inventory;

import core.models.Employee;

import java.util.Date;

public interface Equipment {
    Date getDatePurchase();
    void setDatePurchase(Date d);
    String getSerialNumber();
    void setSerialNumber(String s);
    String getStatus();
    void setStatus(EquipmentStatus status);
    Employee getCareOf();
    void setCareOf(Employee e);
}
