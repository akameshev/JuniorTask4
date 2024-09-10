package org.homework.models;

import java.util.Collection;

public interface Repository <T,TId>{
   void add(T human);

    void add(Person human);

    void update(T human);
    void delete(T human);
    T getByID(TId id);
    Collection<T> getAll();
}
