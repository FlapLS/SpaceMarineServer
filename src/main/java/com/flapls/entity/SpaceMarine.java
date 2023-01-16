package com.flapls.entity;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "spacemarines")
@Getter
@XmlRootElement
public class SpaceMarine {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotBlank
    @XmlElement
    private String name; //Поле не может быть null, Строка не может быть пустой

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @XmlElement
    private Coordinates coordinates; //Поле не может быть null

    @NotNull
    @XmlElement
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически

    private double health; //Значение поля должно быть больше 0

    @Enumerated(EnumType.STRING)
    @NotNull
    @XmlElement
    private AstartesCategory category; //Поле может быть null

    @Enumerated(EnumType.STRING)
    @NotNull
    @XmlElement
    private Weapon weaponType; //Поле не может быть null

    @Enumerated(EnumType.STRING)
    @NotNull
    @XmlElement
    private MeleeWeapon meleeWeapon; //Поле не может быть null

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @XmlElement
    private Chapter chapter; //Поле не может быть null


}
