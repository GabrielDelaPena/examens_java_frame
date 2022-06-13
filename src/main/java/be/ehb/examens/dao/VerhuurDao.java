package be.ehb.examens.dao;

import be.ehb.examens.entities.Verhuur;
import org.springframework.data.repository.CrudRepository;

public interface VerhuurDao extends CrudRepository<Verhuur, Integer> {
}
