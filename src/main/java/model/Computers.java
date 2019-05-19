package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Computers {

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
    @Column(name = "Ram")
    private String RAM;
    @Column(name = "VRAM")
    private String VRAM;
    @Column(name = "Graphics")
    private String Graphics;

    public Computers(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
