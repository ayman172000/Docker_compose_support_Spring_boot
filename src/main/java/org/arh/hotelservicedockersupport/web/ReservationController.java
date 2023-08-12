package org.arh.hotelservicedockersupport.web;

import lombok.AllArgsConstructor;
import org.arh.hotelservicedockersupport.entities.Reservation;
import org.arh.hotelservicedockersupport.repository.ReservationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationController {
    private ReservationRepository reservationRepository;

    @GetMapping("reservations")
    public List<Reservation> getAll()
    {
        return reservationRepository.findAll();
    }
}
