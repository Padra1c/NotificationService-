package ie.atu.notificationservice.clients;

import ie.atu.notificationservice.model.Reservation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ReservationClient {
    Reservation getReservation(@PathVariable Long id);
}
