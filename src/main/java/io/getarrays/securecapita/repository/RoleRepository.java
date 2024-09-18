package io.getarrays.securecapita.repository;

import io.getarrays.securecapita.domain.Role;

import java.util.Collection;

public interface RoleRepository <T extends Role> {

    /* Basic CRUD Operations */
    T create(T data);
    Collection<T> list(int page, int pageSize);
    T get(Long id);
    T update(T data);
    Boolean delete(Long id);

    /* More Complex Operations */
    void addRoleToUser(Long userId, String roleName);

}
