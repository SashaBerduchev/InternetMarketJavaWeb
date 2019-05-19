package model;


import javax.persistence.*;

@Entity
@Table(name = "Phones")
public class Phones {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Firm")
    private String Firm;

    @Column(name = "Model")
    private String Model;

    @Column(name = "Quantity")
    private String Quantity;

    @Column(name = "Cost")
    private String Cost;

    @Column(name = "Processor")
    private String Processor;

    @Column(name = "RAM")
    private String RAM;

    @Column(name = "Battery")
    private String Battery;

    public Phones(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
