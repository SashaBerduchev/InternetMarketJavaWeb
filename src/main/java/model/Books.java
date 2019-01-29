package model;



import javax.naming.Name;
import javax.persistence.*;

@Entity
@Table(name = "Books")
public class Books {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Autor")
    private String Autor;

    @Column(name = "Shop")
    private String Shop;

    @Column(name = "Cosr")
    private Integer Cost;
}
