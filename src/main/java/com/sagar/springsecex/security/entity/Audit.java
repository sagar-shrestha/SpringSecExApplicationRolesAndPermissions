package com.sagar.springsecex.security.entity;

import com.sagar.springsecex.common.entity.AuditActiveAbstract;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(name = "users_unq_code", columnNames = {"code"}),
        @UniqueConstraint(name = "users_unq_username", columnNames = {"username"})
})
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Audit extends AuditActiveAbstract {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq_gen")
    @SequenceGenerator(name = "users_seq_gen", sequenceName = "users_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "require_password_change", columnDefinition = "default boolean true")
    private boolean requirePasswordChange = true;

    @Column(name = "password_updated_date_time")
    private LocalDateTime passwordUpdatedDateTime;
}
