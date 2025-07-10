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
@Table(name = "permission")
public class Permission extends AuditActiveAbstract {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "permission_seq_gen")
    @SequenceGenerator(name = "permission_seq_gen", sequenceName = "permission_seq", allocationSize = 1)
    private Integer id;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "module_privilege_mapping_id",
            foreignKey = @ForeignKey(name = "FK_permission_module_privilege_id"))
    private ModulePrivilegeMapping modulePrivilegeMapping;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "role_id", foreignKey = @ForeignKey(name = "FK_permission_role_id"))
    private Roles roles;
}
