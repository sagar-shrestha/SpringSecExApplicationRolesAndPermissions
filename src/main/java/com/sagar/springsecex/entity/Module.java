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
@Table(name = "module")
public class Module extends AuditActiveAbstract {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "module_seq_gen")
    @SequenceGenerator(name = "module_seq_gen", sequenceName = "module_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "name")
private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "code")
    private String code;

}
