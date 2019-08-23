package za.co.pblinfrastructures.site.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.co.pblinfrastructures.site.model.Services;

import javax.persistence.Id;
import java.util.Optional;
@Repository
public class ServicesRepository implements CrudRepository<Services, Id> {
    @Override
    public <S extends Services> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Services> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Services> findById(Id id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Id id) {
        return false;
    }

    @Override
    public Iterable<Services> findAll() {
        return null;
    }

    @Override
    public Iterable<Services> findAllById(Iterable<Id> ids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Id id) {

    }

    @Override
    public void delete(Services entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Services> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
