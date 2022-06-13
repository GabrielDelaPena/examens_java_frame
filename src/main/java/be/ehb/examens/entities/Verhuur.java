package be.ehb.examens.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Verhuur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    @OneToOne
    @JoinColumn(name = "auto_id", referencedColumnName = "id")
    private Auto auto_id;
    @NotNull
    @OneToOne
    @JoinColumn(name = "huurder_id", referencedColumnName = "id")
    private Huurder huurder_id;
    private LocalDate huur_start;
    private LocalDate huur_stop;

    public Verhuur() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Auto getAuto_id() {
        return auto_id;
    }

    public void setAuto_id(Auto auto_id) {
        this.auto_id = auto_id;
    }

    public Huurder getHuurder_id() {
        return huurder_id;
    }

    public void setHuurder_id(Huurder huurder_id) {
        this.huurder_id = huurder_id;
    }

    public LocalDate getHuur_start() {
        return huur_start;
    }

    public void setHuur_start(LocalDate huur_start) {
        this.huur_start = huur_start;
    }

    public LocalDate getHuur_stop() {
        return huur_stop;
    }

    public void setHuur_stop(LocalDate huur_stop) {
        this.huur_stop = huur_stop;
    }
}
