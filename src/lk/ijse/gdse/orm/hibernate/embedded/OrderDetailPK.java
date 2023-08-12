package lk.ijse.gdse.orm.hibernate.embedded;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class OrderDetailPK {

    @Column(name = "order_id")
    private int order_id;
    @Column(name = "item_id")
    private int item_id;

    public OrderDetailPK(){}

    public  OrderDetailPK(int order_id, int item_id) {
        this.order_id = order_id;
        this.item_id = item_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    @Override
    public String toString() {
        return "OrderDetailPK{" +
                "order_id=" + order_id +
                ", item_id=" + item_id +
                '}';
    }
}
