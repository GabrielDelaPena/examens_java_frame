package be.ehb.examens.dao;

import be.ehb.examens.entities.Huurder;
import org.springframework.data.repository.CrudRepository;

public interface HuurderDao extends CrudRepository<Huurder, Integer> {
}
