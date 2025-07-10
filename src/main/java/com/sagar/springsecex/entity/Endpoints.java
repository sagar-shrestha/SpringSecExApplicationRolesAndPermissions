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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "endpoints")
public class Endpoints extends AuditActiveAbstract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "endpoints_seq_gen")
    @SequenceGenerator(name = "endpoints_seq_gen", sequenceName = "endpoints_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "url", nullable = false, columnDefinition = "LONGTEXT")
    private String url;

    @Column(name = "url", nullable = false, columnDefinition = "LONGTEXT")
    private String method;
}
