package codegym.service;

import java.util.Optional;

public interface IGernericService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    T save(T t);

    void remove(Long id);
}
