package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "Progress_flashcard")
public class Progress_flashcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProgress;

    @Column(name = "CorrectFlashcard", nullable = false)
    private int CorrectFlashcard;

    @Column(name = "IncorrectFlashcard", nullable = false)
    private int IncorrectFlashcard;

    @Column(name = "TimeSpentFlashcard", nullable = false)
    private int TimeSpentFlashcard;

    @Column(name = "StateFlashcard", nullable = false, length = 50)
    private String StateFlashcard;

    @OneToOne
    @JoinColumn(name = "IdFlashcard")
    private Flashcard flashcard;
}
