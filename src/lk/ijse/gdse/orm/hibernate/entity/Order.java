package lk.ijse.gdse.orm.hibernate.entity;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "`order`")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int id;
    @Column(name = "order_date")
    private Timestamp Ordertimestamp;

    @ManyToOne
    @JoinColumn(name = "customer_Id")
    private Customer customer;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Iteam> iteams = new ArrayList<>();

    public Order(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getOrdertimestamp() {
        return Ordertimestamp;
    }

    public void setOrdertimestamp(Timestamp ordertimestamp) {
        Ordertimestamp = ordertimestamp;
    }

    public String getDiscribtion() {
        return discribtion;
    }

    public void setDiscribtion(String discribtion) {
        this.discribtion = discribtion;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", Ordertimestamp=" + Ordertimestamp +
                ", discribtion='" + discribtion + '\'' +
                '}';
    }

    @Column(name = "prder_dis")
    private String discribtion;

}
