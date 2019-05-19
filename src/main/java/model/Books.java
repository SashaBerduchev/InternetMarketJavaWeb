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

    @Column(name = "Cost")
    private Integer Cost;

    public Books(){

    }

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(final String name) {
        this.Name = name;
    }

    public String getAutor() {
        return this.Autor;
    }

    public void setAutor(final String autor) {
        this.Autor = autor;
    }

    public String getShop() {
        return this.Shop;
    }

    public void setShop(final String shop) {
        this.Shop = shop;
    }

    public Integer getCost() {
        return this.Cost;
    }

    public void setCost(final Integer cost) {
        this.Cost = cost;
    }
}
