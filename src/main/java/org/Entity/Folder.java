package org.Entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "Folder")
public class Folder {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id;

    @Basic
    @Column(length=30)
    private String Libelle;

    @Basic
    @Column(length=30)
    private String Statut;

    @Basic
    @Column(length=30)
    private String Target;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable=false)
    private Calendar Date_new;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable=false)
    private Calendar Date_Update_folder;
    // return name as uppercase in the model

}
