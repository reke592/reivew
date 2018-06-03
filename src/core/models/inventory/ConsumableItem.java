package core.models.inventory;

import java.util.Date;

public class ConsumableItem implements Consumable {
    private int id;
    private String name;
    private Date expiration;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Date getExpiration() {
        return expiration;
    }

    @Override
    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }
}
