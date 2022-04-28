package com.system.ticket.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Category")
@Table(name = "t_Category")
@Getter
@Setter
public class Category extends com.system.ticket.model.generalDomain {

    @Column(name = "c_name", columnDefinition = "VARCHAR(255)")
    private String name;

}
