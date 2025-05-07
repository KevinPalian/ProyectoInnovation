package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "Flashcard")
public class Flashcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFlashcard;

    @Column(name = "descriptionFlashcard", length = 255, nullable = false)
    private String descriptionFlashcard;

    @Column(name ="type_contentFlashcard", length = 255, nullable = false)
    private String type_contentFlashcard;

    @Column(name = "difficultyFlashcard", length = 100, nullable = false)
    private String difficultyFlashcard;

    @Column(name = "editableFlashcard", nullable = false)
    private Boolean editableFlashcard;

    @Column(name = "creation_dateFlashcard", nullable = false)
    private LocalDate creation_dateFlashcard;

    @Column(name = "voice_languageFlashcard", length = 50 ,nullable = false)
    private String voice_languageFlashcard;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;
}
