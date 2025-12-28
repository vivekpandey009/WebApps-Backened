package in.co.vivekp.webapps.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String password;
    private int verificateCode;
    private LocalDateTime verificateExpiry;
    private boolean enabled;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
