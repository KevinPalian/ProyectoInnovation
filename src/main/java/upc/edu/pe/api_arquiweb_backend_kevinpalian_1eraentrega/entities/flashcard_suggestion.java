package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name="flashcard_suggestion")
public class flashcard_suggestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFlashcard_suggestion;

    @Column(name="reason_suggestionSFlashcard", nullable=false)
    private String reason_suggestionSFlashcard;

    @Column(name="progress_basedSFlashcard",length = 150, nullable=false)
    private String progress_basedSFlashcard;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;

    @ManyToOne
    @JoinColumn(name = "idFlashcardTheme")
    private FlashcardTheme flashcardTheme;
}
