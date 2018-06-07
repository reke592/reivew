package core.models.inventory2;

import core.models.Person;

import java.util.Date;

public class EquipmentInventoryRequestImpl implements InventoryRequest{

    private int id;
    private Equipment item;
    private Person issuer;
    private Person requester;
    private Date dtRelease;
    private Date dtReturned;
    private RequestStatus status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Equipment getItem() {
        return item;
    }

    public void setItem(Equipment item) {
        this.item = item;
    }

    public Person getIssuer() {
        return issuer;
    }

    public void setIssuer(Person issuer) {
        this.issuer = issuer;
    }

    public Person getRequester() {
        return requester;
    }

    public void setRequester(Person requester) {
        this.requester = requester;
    }

    public Date getDtRelease() {
        return dtRelease;
    }

    public void setDtRelease(Date dtRelease) {
        this.dtRelease = dtRelease;
    }

    public Date getDtReturned() {
        return dtReturned;
    }

    public void setDtReturned(Date dtReturned) {
        this.dtReturned = dtReturned;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    @Override
    public void setRequestStatus(RequestStatus status) {
        this.status = status;
    }

    @Override
    public RequestStatus getRequestStatus() {
        return this.status;
    }
}
