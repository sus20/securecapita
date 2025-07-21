package at.ac.univie.securecapita.repository;

import at.ac.univie.securecapita.domain.User;

import java.util.Collection;

public interface UserRepository<T extends User> {

    /* Basic CRUD Operation */
    T create(T data);

    Collection<T> list(int page, int pageSize);

    T get(Long id);

    T update(T data);

    Boolean delete(Long id);

    /* more complex Operation */
}
