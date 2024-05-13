package eu.epfc.java1888.catalog;

import java.util.Objects;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;


@Entity
public class Product{
    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    Product(){}

    public Product( String name, String role) {
        this.name = name;
        this.role = role;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (!(o instanceof Product))
            return false;
        Product product = (Product) o;
        return Objects.equals(this.id, product.id) && Objects.equals(this.name, product.name)
                && Objects.equals(this.role, product.role);
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.id, this.name, this.role);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

