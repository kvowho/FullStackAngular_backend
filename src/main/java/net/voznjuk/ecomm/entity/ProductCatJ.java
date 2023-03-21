package net.voznjuk.ecomm.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
//@Data
@Table(name="product_cat_j")
@Getter
@Setter
public class ProductCatJ {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="cat_name")
    private StringBuffer categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<ProductJ> products;



}
