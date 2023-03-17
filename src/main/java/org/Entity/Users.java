package org.Entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "Users")
public class Users {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Num;

    @Basic
    @Column(length=30)
    private String Nom;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable=false)
    private Calendar Date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable=false)
    private Calendar Date_Update;

    // return name as uppercase in the model

}
