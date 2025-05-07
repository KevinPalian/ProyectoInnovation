package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "Session_Rating")
public class Session_rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdSessionRating;

    @Column(name = "ScoreSessionRating", nullable = false)
    private int ScoreSessionRating;

    @Column(name = "comentSessionRating", nullable = false, length = 50)
    private String comentSessionRating;

    @Column(name = "DateSessionrating", nullable = false)
    private LocalDate DateSessionrating;

    @OneToOne
    @JoinColumn(name = "Idsession")
    private Session session;
}
