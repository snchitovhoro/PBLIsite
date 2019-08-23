package za.co.pblinfrastructures.site.service;

import org.springframework.stereotype.Service;
import za.co.pblinfrastructures.site.model.Home;

import javax.persistence.Id;
import java.util.Optional;

@Service
public interface HomeService {
    public <S extends Home> S save(S entity);
    public <S extends Home> Iterable<S> saveAll(Iterable<S> entities);
    public Optional<Home> findById(Id id);
    public boolean existsById(Id id);
    public Iterable<Home> findAll();
    public Iterable<Home> findAllById(Iterable<Id> ids);
    public long count();
    public void deleteById(Id id);
    public void delete(Home entity);
    public void deleteAll(Iterable<? extends Home> entities);
    public void deleteAll();
}
