package io.getarrays.securecapita.repository;

import io.getarrays.securecapita.domain.User;

import java.util.Collection;

public interface UserRepository<T extends User> {

    /* Basic CRUD Operations */
    T create(T data);
    Collection<T> list(int page, int pageSize);
    T get(Long id);
    T update(T data);
    Boolean delete(Long id);
    /* More Complex Operations */

}
