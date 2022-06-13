package be.ehb.examens.controller;

import be.ehb.examens.dao.AutoDao;
import be.ehb.examens.dao.VerhuurDao;
import be.ehb.examens.entities.Auto;
import be.ehb.examens.entities.Verhuur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class AutoController {
    private AutoDao autoDao;
    private VerhuurDao verhuurDao;

    @Autowired
    public AutoController(AutoDao autoDao, VerhuurDao verhuurDao) {
        this.autoDao = autoDao;
        this.verhuurDao = verhuurDao;
    }

    @GetMapping
    public Iterable<Auto> getAllCars() {
        return autoDao.findAll();
    }

    @GetMapping("/{fabrikant}")
    public Auto getCarByFabrikant(@PathVariable("fabrikant") String fabrikant) {
        Auto auto = autoDao.getAutoByFabrikant(fabrikant);
        return auto;
    }

    @GetMapping("/now")
    public Iterable<Auto> getAllHiredCars() {
        Iterable<Verhuur> verhuurs = verhuurDao.findAll();
        List<Auto> autos = new ArrayList<>();
        for (Verhuur verhuur : verhuurs) {
            int auto_id = verhuur.getAuto_id().getId();
            Auto auto = autoDao.findById(auto_id).get();
            autos.add(auto);
        }
        return autos;
    }

}
