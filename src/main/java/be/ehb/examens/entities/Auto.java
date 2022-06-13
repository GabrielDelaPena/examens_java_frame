package be.ehb.examens.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    private int chassisnr;
    @NotBlank
    private String merk;
    @NotBlank
    private String fabrikant;
    @NotNull
    private int aantalDeuren;

    public Auto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChassisnr() {
        return chassisnr;
    }

    public void setChassisnr(int chassisnr) {
        this.chassisnr = chassisnr;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getFabrikant() {
        return fabrikant;
    }

    public void setFabrikant(String fabrikant) {
        this.fabrikant = fabrikant;
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public void setAantalDeuren(int aantalDeuren) {
        this.aantalDeuren = aantalDeuren;
    }
}
