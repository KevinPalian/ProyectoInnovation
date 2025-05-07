package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "FlashcardImg")
public class FlashcardImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFlashcardImg;

    @Column(name = "urlFlashcardImg",length = 100,nullable = false)
    private String urlFlashcardImg;

    @Column(name = "descFlashcardImg",length = 200,nullable = false)
    private String descFlashcardImg;

    @ManyToOne
    @JoinColumn(name = "idFlashcard")
    private Flashcard flashcard;
}
