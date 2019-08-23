package za.co.pblinfrastructures.site.service;

import org.springframework.stereotype.Service;
import za.co.pblinfrastructures.site.model.AboutUs;

import javax.persistence.Id;
import java.util.Optional;

@Service
public class AboutUsServiceImpl implements AboutUsService {
    @Override
    public <S extends AboutUs> S save(S entity) {
        return null;
    }

    @Override
    public <S extends AboutUs> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<AboutUs> findById(Id id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Id id) {
        return false;
    }

    @Override
    public Iterable<AboutUs> findAll() {
        return null;
    }

    @Override
    public Iterable<AboutUs> findAllById(Iterable<Id> ids) {
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
    public void delete(AboutUs entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends AboutUs> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
