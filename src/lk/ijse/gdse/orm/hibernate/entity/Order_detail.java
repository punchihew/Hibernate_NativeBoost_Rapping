package lk.ijse.gdse.orm.hibernate.entity;

import lk.ijse.gdse.orm.hibernate.embedded.OrderDetailPK;

import javax.persistence.*;

@Entity
@Table(name = "order_details")
public class Order_detail {

    @EmbeddedId
    private OrderDetailPK orderDetailPK ;

    @Column (name = "order_qty")
    private int qty;

    @Column (name = "order_price")
    private double price;

    @ManyToOne
    @JoinColumn(name = "order_id",referencedColumnName = "order_id" ,
            insertable = false ,updatable = false)
    private Order order ;

    @OneToMany
    @JoinColumn(name = "iteam_id",referencedColumnName = "iteam_id",
            insertable = false,updatable = false)
    private Iteam iteam ;

    public Order_detail(){}

    public Order_detail(OrderDetailPK orderDetailPK, int qty, double price) {
        this.orderDetailPK = orderDetailPK;
        this.qty = qty;
        this.price = price;
    }

    public OrderDetailPK getOrderDetailPK() {
        return orderDetailPK;
    }

    public void setOrderDetailPK(OrderDetailPK orderDetailPK) {
        this.orderDetailPK = orderDetailPK;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order_detail{" +
                "orderDetailPK=" + orderDetailPK +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
