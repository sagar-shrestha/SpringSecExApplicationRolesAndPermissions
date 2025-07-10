package com.sagar.springsecex.entity;

import com.sagar.springsecex.common.entity.AuditActiveAbstract;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "privilege", uniqueConstraints = {
        @UniqueConstraint(name = "privilege_unq_code", columnNames = {"code"})
})
public class Privilege extends AuditActiveAbstract {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "privilege_seq_gen")
    @SequenceGenerator(name = "privilege_seq_gen", sequenceName = "privilege_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "code")
    private String code;
}
