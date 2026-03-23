package ie.atu.notificationservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationID;

    @NotBlank(message = "equipmentTag is required")
    private String equipmentTag;

    @NotBlank(message = "studentEmail is required")
    @Email(message = "studentEmail must be a valid one")
    private String studentEmail;

    @NotNull(message = "reservastionDate required")
    private LocalDate reservastionDate;

    @Min(value = 0, message = "startHour must be between 1 and 23")
    @Max(value = 23, message = "startHour must be between 1 and 23")
    private int startHour;

    @Min(value = 1, message = "durationHour must be between 1 and 23")
    @Max(value = 24, message = "durationHour must be between 1 and 23")
    private int durationHour;

    private LocalDate notificationDate;
    private Boolean notificationStatus;
}
