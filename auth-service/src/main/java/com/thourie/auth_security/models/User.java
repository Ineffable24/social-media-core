package com.thourie.auth_security.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String login;

    private String password;

    private String email;

    private String name;

    private String surname;

    private String secondname;

    private String country;

    private String town;

    private Date bithday;

    private List<Role> roles;

    @Column(name="create_at")
    private LocalDateTime ctreatedAt;

    @Column(name="updated_at")
    private LocalDateTime updatedAt;

    @Column(name="last_logon")
    private LocalDateTime lastLogon;

}
