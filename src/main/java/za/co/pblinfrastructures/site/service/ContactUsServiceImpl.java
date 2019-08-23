package za.co.pblinfrastructures.site.service;

import org.springframework.stereotype.Service;
import za.co.pblinfrastructures.site.model.ContactUs;

import javax.persistence.Id;
import java.util.Optional;

@Service
public class ContactUsServiceImpl implements ContactUsService {
    @Override
    public <S extends ContactUs> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ContactUs> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ContactUs> findById(Id id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Id id) {
        return false;
    }

    @Override
    public Iterable<ContactUs> findAll() {
        return null;
    }

    @Override
    public Iterable<ContactUs> findAllById(Iterable<Id> ids) {
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
    public void delete(ContactUs entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends ContactUs> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
