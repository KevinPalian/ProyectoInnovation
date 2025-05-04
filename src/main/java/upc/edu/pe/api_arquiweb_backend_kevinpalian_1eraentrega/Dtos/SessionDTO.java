package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.User;

public class SessionDTO {
    private int idSession;
    private String titlesession;
    private String descriptionsession;
    private double  pricesession;
    private int durationsession;
    private User user;

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

    public String getDescriptionsession() {
        return descriptionsession;
    }

    public void setDescriptionsession(String descriptionsession) {
        this.descriptionsession = descriptionsession;
    }

    public String getTitlesession() {
        return titlesession;
    }

    public void setTitlesession(String titlesession) {
        this.titlesession = titlesession;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
