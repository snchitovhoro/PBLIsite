package za.co.pblinfrastructures.site.service;

import org.springframework.stereotype.Service;
import za.co.pblinfrastructures.site.model.Home;

import javax.persistence.Id;
import java.util.Optional;

@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public <S extends Home> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Home> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Home> findById(Id id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Id id) {
        return false;
    }

    @Override
    public Iterable<Home> findAll() {
        return null;
    }

    @Override
    public Iterable<Home> findAllById(Iterable<Id> ids) {
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
    public void delete(Home entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Home> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
