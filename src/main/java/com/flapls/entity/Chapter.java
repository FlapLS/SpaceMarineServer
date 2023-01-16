package com.flapls.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@XmlRootElement
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotBlank
    @XmlElement
    private String name; //Поле не может быть null, Строка не может быть пустой

    @XmlElement
    private String parentLegion;

    @XmlElement
    private long marinesCount; //Значение поля должно быть больше 0, Максимальное значение поля: 1000

    @NotNull
    @XmlElement
    private String world; //Поле не может быть null

}
