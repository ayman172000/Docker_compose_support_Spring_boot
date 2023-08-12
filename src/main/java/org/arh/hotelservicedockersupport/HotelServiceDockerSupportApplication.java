package org.arh.hotelservicedockersupport;

import org.arh.hotelservicedockersupport.entities.Reservation;
import org.arh.hotelservicedockersupport.enums.ReservationStatus;
import org.arh.hotelservicedockersupport.repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class HotelServiceDockerSupportApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelServiceDockerSupportApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ReservationRepository reservationRepository) {
        return args -> {
            reservationRepository.save(Reservation.builder()
                    .date(LocalDateTime.now())
                    .price(15)
                    .title("Res 1")
                    .status(ReservationStatus.CREATED)
                    .build());
            reservationRepository.save(Reservation.builder()
                    .date(LocalDateTime.now())
                    .price(150)
                    .title("Res 2")
                    .status(ReservationStatus.CONFIRMED)
                    .build());
            reservationRepository.save(Reservation.builder()
                    .date(LocalDateTime.now())
                    .price(150)
                    .title("Res 3")
                    .status(ReservationStatus.CANCELED)
                    .build());
        };
    }
}
