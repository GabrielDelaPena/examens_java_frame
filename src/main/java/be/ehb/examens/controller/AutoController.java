package be.ehb.examens.controller;

import be.ehb.examens.dao.AutoDao;
import be.ehb.examens.entities.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cars")
public class AutoController {
    private AutoDao autoDao;

    @Autowired
    public AutoController(AutoDao autoDao) {
        this.autoDao = autoDao;
    }

    @GetMapping
    public Iterable<Auto> getAllCars() {
        return autoDao.findAll();
    }
}
