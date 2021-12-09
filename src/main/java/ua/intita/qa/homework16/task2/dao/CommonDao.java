package ua.intita.qa.homework16.task2.dao;

import ua.intita.qa.homework16.task2.entity.Ticket;

import java.util.Collection;

public interface CommonDao <T>{
    T save (T entity);

    T findById(String id);

    Collection<T> findAll();

    void delete(String id);
}
