package com.sagar.springsecex.entity;

import com.sagar.springsecex.common.entity.AuditActiveAbstract;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "roles", uniqueConstraints = {
        @UniqueConstraint(name = "roles_unq_name", columnNames = {"name"}),
        @UniqueConstraint(name = "roles_unq_code", columnNames = {"code"})
})
public class Roles extends AuditActiveAbstract {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roles_seq_gen")
    @SequenceGenerator(name = "roles_seq_gen", sequenceName = "roles_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "role")
    private List<UserRolesAssociation> userRolesAssociations;
}
