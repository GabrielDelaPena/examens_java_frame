package be.ehb.examens.dao;

import be.ehb.examens.entities.Auto;
import org.springframework.data.repository.CrudRepository;

public interface AutoDao extends CrudRepository<Auto, Integer> {

    public Auto getAutoByFabrikant(String fabrikant);

}
