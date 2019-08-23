package za.co.pblinfrastructures.site.service;

import org.springframework.stereotype.Service;
import za.co.pblinfrastructures.site.model.Services;

import javax.persistence.Id;
import java.util.Optional;

@Service
public interface ServicesService {
    public <S extends Services> S save(S entity);
    public <S extends Services> Iterable<S> saveAll(Iterable<S> entities);
    public Optional<Services> findById(Id id);
    public boolean existsById(Id id);
    public Iterable<Services> findAll();
    public Iterable<Services> findAllById(Iterable<Id> ids);
    public long count();
    public void deleteById(Id id);
    public void delete(Services entity);
    public void deleteAll(Iterable<? extends Services> entities);
    public void deleteAll();
}
