package com.daniel.bootplay.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by dipengfei on 16/05/2017.
 */
@Entity
@NoArgsConstructor
@Data
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    @Column
    private String year;

    @Column
    private Integer tracks;

    @Column
    private String genre;

}
