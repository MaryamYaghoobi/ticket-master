package com.system.ticket.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "CategoryElement")
@Table(name = "t_CategoryElement")
public class CategoryElement extends com.system.ticket.model.generalDomain {

    @Column(name = "c_name", columnDefinition = "VARCHAR(255)")
    private String name;

    @Column(name = "c_code", columnDefinition = "VARCHAR(255)")
    private String code;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<Category> category;
}
