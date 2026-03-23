package ie.atu.notificationservice.service;

import ie.atu.notificationservice.clients.ReservationClient;
import ie.atu.notificationservice.model.Reservation;
import org.springframework.stereotype.Service;

import javax.management.Notification;
import java.time.LocalDate;

@Service
public class NotifactionService {
    private final ReservationClient reservationClient;

    public NotifactionService(ReservationClient reservationClient) {
        this.reservationClient = reservationClient;
    }


    public Notification createNotification(Long reservationID)
    {
        Reservation reservation = reservationClient.getReservation(reservationID);
        Notification notification = new Notification();
        notification.setReservationId(reservationID);
        notification.setEquipmentTag(reservation.getEquipmentTag());
        notification.setStudentEmail(reservation.getStudentEmail());
        notification.setNotificationDate(LocalDate.now());
        return notification;
    }
}
