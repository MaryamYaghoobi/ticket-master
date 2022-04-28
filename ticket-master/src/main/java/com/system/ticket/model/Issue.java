package com.system.ticket.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Issue")
@Table(name = "t_Issue")
@Getter
@Setter
public class Issue extends com.system.ticket.model.generalDomain {
    @Column(name = "c_context", columnDefinition = "VARCHAR(255)")
    private String context;
    @Column(name = "c_subject", columnDefinition = "VARCHAR(255)")
    private String subject;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "c_issueType")
    private CategoryElement issueType;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "c_issueStatus")
    private CategoryElement issueStatus;

    @OneToMany()
    @JoinTable(name = "mm_UserIssue",
            joinColumns = {@JoinColumn(name = "c_receiveIssueId")},
            inverseJoinColumns = {@JoinColumn(name = "c_receiverId")})
    private List<User> receiveIssues;
}
