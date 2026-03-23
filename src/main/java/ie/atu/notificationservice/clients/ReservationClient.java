package ie.atu.notificationservice.clients;

import ie.atu.notificationservice.model.Reservation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "reservation-service", url="http://localhost:8080")

public interface ReservationClient {

    @GetMapping("/{id}")
    Reservation getReservation(@PathVariable Long id);
}
