package lk.ijse.gdse.orm.hibernate.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "Iteam")
public class Iteam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iteam_id")
     private int id;
    @Column(name ="iteam_name")
     private String name;
    @Column(name = "qty")
     private int qty;
    @Column(name = "unit_price")
     private double unitPrize;

//    @ManyToMany(mappedBy = "iteams")
//    private List<Order> orders = new ArrayList<>();

    @OneToMany (cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "iteam")
    private List<Order_detail> orderDetails = new ArrayList<>();

    private Iteam(){}

    public Iteam(String name, int id, int qty, double unitPrize) {
        this.name = name;
        this.id = id;
        this.qty = qty;
        this.unitPrize = unitPrize;
    }

    @Override
    public String toString() {
        return "iteam{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", qty=" + qty +
                ", unitPrize=" + unitPrize +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrize() {
        return unitPrize;
    }

    public void setUnitPrize(double unitPrize) {
        this.unitPrize = unitPrize;
    }
}
