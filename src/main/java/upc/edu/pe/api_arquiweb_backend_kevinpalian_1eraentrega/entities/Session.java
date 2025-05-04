package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;


import jakarta.persistence.*;

@Entity
@Table(name="Sesion")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSession;

    @Column(name = "titlesession", nullable = false, length = 50)
    private String titlesession;

    @Column(name = "descriptionsession", nullable = false, length = 50)
    private String descriptionsession;

    @Column(name = "pricesession", nullable = false)
    private double  pricesession;

    @Column(name = "durationsession", nullable = false)
    private int durationsession;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;

    public Session() {
    }

    public Session(int idSession, int durationsession, double pricesession, String descriptionsession, String titlesession, User user) {

        this.idSession = idSession;
        this.durationsession = durationsession;
        this.pricesession = pricesession;
        this.descriptionsession = descriptionsession;
        this.titlesession = titlesession;
        this.user = user;
    }
    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public int getDurationsession() {
        return durationsession;
    }

    public void setDurationsession(int durationsession) {
        this.durationsession = durationsession;
    }

    public double getPricesession() {
        return pricesession;
    }

    public void setPricesession(double pricesession) {
        this.pricesession = pricesession;
    }

    public String getTitlesession() {
        return titlesession;
    }

    public void setTitlesession(String titlesession) {
        this.titlesession = titlesession;
    }

    public String getDescriptionsession() {
        return descriptionsession;
    }

    public void setDescriptionsession(String descriptionsession) {
        this.descriptionsession = descriptionsession;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}





















