package org.Entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "Direction")
public class Direction {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id_direction;

    @Basic
    @Column(length=30)
    private String code;

    @Basic
    @Column(length=30)
    private String Libelle;


    // return name as uppercase in the model

}
