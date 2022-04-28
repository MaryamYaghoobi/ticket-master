package com.system.ticket.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;
import java.util.List;

@Entity(name = "User")
@Table(name = "t_User")
@Getter
@Setter
@SelectBeforeUpdate
public class User extends com.system.ticket.model.generalDomain {

    @Column(name = "c_firstName", columnDefinition = "VARCHAR(255)")
    private String firstName;
    @Column(name = "c_lastName", columnDefinition = "VARCHAR(255)")
    private String lastName;
    @Column(name = "c_email", columnDefinition = "VARCHAR(255)")
    private String email;

    @Column(name = "c_username", columnDefinition = "VARCHAR(255)")
    private String username;
    @Column(name = "c_password", columnDefinition = "VARCHAR(255)")
    private String password;

    @ManyToOne()
    @JoinColumn(name = "c_manager")
    private User manager;
    @OneToMany(mappedBy = "manager", cascade = CascadeType.ALL)
    private List<User> users;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "c_role")
    private CategoryElement role;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "c_userId")
    private List<Issue> issueList;
    @OneToMany()
    @JoinColumn(name = "c_sentIssueId")
    private List<Issue> sentIssues;
}
