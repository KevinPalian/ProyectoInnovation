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
@Table(name = "FlashcardTheme")
public class FlashcardTheme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFlashcardTheme;

    @Column(name = "nameFlashcardTheme",length = 30,nullable = false)
    private String nameFlashcardTheme;

    @Column(name = "dateFlashcardTheme",nullable = false)
    private LocalDate dateFlashcardTheme;

    @ManyToOne
    @JoinColumn(name = "idFlashcard")
    private Flashcard flashcard;
}
