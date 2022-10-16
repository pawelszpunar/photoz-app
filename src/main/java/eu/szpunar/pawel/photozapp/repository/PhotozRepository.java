package eu.szpunar.pawel.photozapp.repository;

import eu.szpunar.pawel.photozapp.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {
}
