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
@Table(name = "module_privilege_mapping")
public class ModulePrivilegeMapping extends AuditActiveAbstract {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "module_privilege_mapping_seq_gen")
    @SequenceGenerator(name = "module_privilege_mapping_seq_gen",
            sequenceName = "module_privilege_mapping_seq", allocationSize = 1)
    private Integer id;



}
