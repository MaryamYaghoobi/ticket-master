package com.system.ticket.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class generalDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "LONG", nullable = false, unique = true)
    public long id;
    @Column(columnDefinition = "BIT", length = 1)
    private Boolean disabled;
    @Column(columnDefinition = "BIT", length = 1)
    private Boolean active;
    @Version
    private Long version;
    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;
}
