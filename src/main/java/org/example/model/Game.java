package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;


@Entity
@Table(name = "games")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "release_date")
    private Date releaseDate;
    @Column(name = "cost")
    private BigDecimal price;
    @Column(name = "rating")
    private BigDecimal rating;
    @Column(name = "description")
    private String description;
    @Column(name = "creation_date")
    private Date createdAt;
    @Column(name = "type")
    private String type;

}
