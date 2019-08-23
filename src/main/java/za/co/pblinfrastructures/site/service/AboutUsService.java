package za.co.pblinfrastructures.site.service;

import org.springframework.stereotype.Service;
import za.co.pblinfrastructures.site.model.AboutUs;

import javax.persistence.Id;
import java.util.Optional;

@Service
public interface AboutUsService {

    public <S extends AboutUs> S save(S entity);
    public <S extends AboutUs> Iterable<S> saveAll(Iterable<S> entities);
    public Optional<AboutUs> findById(Id id);
    public boolean existsById(Id id);
    public Iterable<AboutUs> findAll();
    public Iterable<AboutUs> findAllById(Iterable<Id> ids);
    public long count();
    public void deleteById(Id id);
    public void delete(AboutUs entity);
    public void deleteAll(Iterable<? extends AboutUs> entities);

    public void deleteAll();
}
