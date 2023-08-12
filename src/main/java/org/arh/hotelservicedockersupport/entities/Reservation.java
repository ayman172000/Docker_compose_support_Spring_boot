package org.arh.hotelservicedockersupport.entities;

import jakarta.persistence.*;
import lombok.*;
import org.arh.hotelservicedockersupport.enums.ReservationStatus;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDateTime date;
    private double price;
    @Enumerated(EnumType.STRING)
    private ReservationStatus status;
}
