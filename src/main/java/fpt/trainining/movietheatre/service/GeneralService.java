package fpt.trainining.movietheatre.service;

import java.util.Collection;
import java.util.Objects;

public interface GeneralService<T> {
    Collection<T> findAll();

    T findById(Object id);

    T save(T t);

    void remove(Object id);
}
