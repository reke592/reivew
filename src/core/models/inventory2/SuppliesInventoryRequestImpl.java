package core.models.inventory2;

import core.models.Person;

import java.util.Date;

public class SuppliesInventoryRequestImpl implements InventoryRequest {

    private int id;
    private Supplies item;
    private int count;
    private Person issuer;
    private Person requestor;
    private Date dtRelease;
    private RequestStatus status;

    @Override
    public void setRequestStatus(RequestStatus status) {
        this.status = status;
    }

    @Override
    public RequestStatus getRequestStatus() {
        return this.status;
    }
}
