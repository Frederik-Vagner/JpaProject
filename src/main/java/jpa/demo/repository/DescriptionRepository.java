package jpa.demo.repository;

import jpa.demo.model.Description;
import org.springframework.data.repository.CrudRepository;

public interface DescriptionRepository extends CrudRepository<Description, Long> {
}
