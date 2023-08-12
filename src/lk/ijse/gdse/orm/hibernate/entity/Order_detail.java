package lk.ijse.gdse.orm.hibernate.entity;

import lk.ijse.gdse.orm.hibernate.embedded.OrderDetailPK;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "order_details")
public class Order_detail {

    @EmbeddedId
    private OrderDetailPK orderDetailPK ;

    @Column (name = "order_qty")
    private int qty;

    @Column (name = "order_price")
    private double price;


}
