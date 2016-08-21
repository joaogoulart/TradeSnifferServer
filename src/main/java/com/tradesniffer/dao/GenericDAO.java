package com.tradesniffer.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by Headtrap on 20-Aug-16.
 */

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;


public interface GenericDAO<T, TID> {

    public void create(T entity) throws Exception;

    public T createWithReturn(T entity) throws Exception;

    public T find(TID id) throws Exception;

    public T update(T entity) throws Exception;

    public void remove(T entity) throws Exception;

    public void removeById(TID id) throws Exception;

    public List<T> findAll() throws Exception;

    public void setSessionFactory(SessionFactory sessionFactory);

    public Session getSession();

    public SessionFactory getSessionFactory();

    public void removeAll(List<T> list);
}


