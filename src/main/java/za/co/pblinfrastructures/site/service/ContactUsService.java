package za.co.pblinfrastructures.site.service;

import org.springframework.stereotype.Service;

import za.co.pblinfrastructures.site.model.ContactUs;

import javax.persistence.Id;
import java.util.Optional;

@Service
public interface ContactUsService {
    public <S extends ContactUs> S save(S entity);
    public <S extends ContactUs> Iterable<S> saveAll(Iterable<S> entities);
    public Optional<ContactUs> findById(Id id);
    public boolean existsById(Id id);
    public Iterable<ContactUs> findAll();
    public Iterable<ContactUs> findAllById(Iterable<Id> ids);
    public long count();
    public void deleteById(Id id);
    public void delete(ContactUs entity);
    public void deleteAll(Iterable<? extends ContactUs> entities);
    public void deleteAll();
}
