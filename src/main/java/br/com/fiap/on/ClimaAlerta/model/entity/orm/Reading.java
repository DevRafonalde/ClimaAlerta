package br.com.fiap.on.ClimaAlerta.model.entity.orm;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Reading")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "station_id", nullable = false)
    private Station station;

    @Column(name = "rainfall_mm", nullable = false)
    private Double rainfallMm;

    @Column(name = "river_level", nullable = false)
    private Double riverLevel;

    @Column(nullable = false)
    private Double humidity;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}
