package com.example.buensaboruno.domain.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder
//@Audited
public class Empresa extends Base{

    private String nombre;
    private String razonSocial;
    private Integer cuil;
    private String logo;

    @OneToMany(mappedBy = "empresa",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @ToString.Exclude
    @Builder.Default
    @JsonManagedReference
    private Set<Sucursal> sucursales= new HashSet<>();
}
