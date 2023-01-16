package com.flapls.entity;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "coordinates")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@XmlRootElement
public class Coordinates {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull
    @XmlElement
    private Double x; //Поле не может быть null

    @NotNull
    @XmlElement
    private Integer y; //Поле не может быть null

}
