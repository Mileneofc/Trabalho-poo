package br.com.mil.sistematizacao.entities;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.CreationTimestamp;

@Entity(name = "delivery_man")
@Table(name = "delivery_man")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class DeliveryMan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Vehicle vehicleId;

    @Column
    private String name;

    @Column(length = 14, unique = true)
    private String cpf;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime logicalExclusion;
}
