package model;


import javax.persistence.*;

@Entity
@Table(name = "GraphicsCard")
public class GrphicsCard {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "GraphicsCore")
    private String GraphicsCore;

    @Column(name = "Cores")
    private String Cores;

    @Column(name = "VRAM")
    private String VRAM;

    @Column(name = "Voltage")
    private String Voltage;

}
