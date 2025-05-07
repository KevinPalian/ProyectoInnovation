package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "Colors") //Esto es un cambio de Gitbash
public class Colors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idColors;
    @Column(name = "nameColors",length = 50,nullable = false)
    private String nameColors;
    @Column(name = "ColorsPrimary",length = 50,nullable = false)
    private String ColorsPrimary;
    @Column(name = "nameColorsSecundary",length = 50,nullable = false)
    private String nameColorsSecundary;
    @Column(name = "ColorsBackground",length = 50,nullable = false)
    private String ColorsBackground;

    @ManyToOne
    @JoinColumn(name = "idFlashcard")
    private Flashcard flashcard;

    @ManyToOne
    @JoinColumn(name = "IdTeacherProfile")
    private Teacher_profile teacher_profile;
}
