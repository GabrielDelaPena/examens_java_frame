package be.ehb.examens.controller;

import be.ehb.examens.dao.VerhuurDao;
import be.ehb.examens.entities.Verhuur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/locations")
public class VerhuurController {

    private VerhuurDao verhuurDao;

    @Autowired
    public VerhuurController(VerhuurDao verhuurDao) {
        this.verhuurDao = verhuurDao;
    }

    @GetMapping
    public Iterable<Verhuur> getAllVerhuren() {
        return verhuurDao.findAll();
    }
}
