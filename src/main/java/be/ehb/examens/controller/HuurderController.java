package be.ehb.examens.controller;

import be.ehb.examens.dao.HuurderDao;
import be.ehb.examens.entities.Huurder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/customers")
public class HuurderController {

    private HuurderDao huurderDao;

    @Autowired
    public HuurderController(HuurderDao huurderDao) {
        this.huurderDao = huurderDao;
    }

    @GetMapping
    public Iterable<Huurder> getAllHuurders() {
        return huurderDao.findAll();
    }

    @PostMapping("/new")
    public HttpStatus addNewHuurder(
            @Valid @RequestParam("voornaam") String voornaam,
            @Valid @RequestParam("achternaam") String achternaam,
            @Valid @RequestParam("telefoonnr") long telefoonnr,
            @Valid @RequestParam("email") String email
    ) {
        Huurder huurder = new Huurder();
        huurder.setVoornaam(voornaam);
        huurder.setAchternaam(achternaam);
        huurder.setTelefoonnr(telefoonnr);
        huurder.setEmail(email);

        huurderDao.save(huurder);

        return HttpStatus.ACCEPTED;
    }
}
