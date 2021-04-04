package com.warehouse.service;
import java.util.List;

public interface GeneralService<T, K> {

    T getById(K id);

    List<T> getAll();

    T add(T object);

    T update(K id, T object);

    void delete(K id);

}
