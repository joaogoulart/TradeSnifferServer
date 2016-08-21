package com.tradesniffer.dao.impl;

/**
 * Created by Headtrap on 20-Aug-16.
 */

import com.tradesniffer.dao.GenericDAO;
import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ClassUtils;
import java.io.Serializable;
import java.util.List;

@Repository
@Transactional
@EnableTransactionManagement
public class GenericDAOImpl<T, TID> implements GenericDAO<T, TID> {

    protected Session session;

    @Autowired
    private SessionFactory sessionFactory;

    private Class<T> clazz;

    public GenericDAOImpl() {
    }

    public GenericDAOImpl(Class clazz) {
        this.clazz = clazz;
    }

    @Override
    public void create(T entity) throws Exception {
        try {
            getSession().save(entity);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
            throw new Exception();
        }
    }

    @Override
    public T createWithReturn(T entity) throws Exception {
        try {
            getSession().persist(entity);
            getSession().flush();
            return entity;
        } catch (Exception e) {
            System.out.println(e);
            throw new Exception();
        }
    }

    @Override
    public T find(TID id) throws Exception {
        return (T) getSession().get(this.clazz, (Serializable) id);
    }

    @Override
    public T update(T entity) throws Exception {
        getSession().merge(entity);
        getSession().flush();
        return entity;
    }

    @Override
    public void remove(T entity) throws Exception {
        try {
            getSession().delete(entity);
            getSession().flush();
        } catch (Exception e) {
            getSession().delete(update(entity));
            getSession().flush();
        }
    }

    @Override
    public void removeById(TID id) throws Exception {
        getSession().delete(clazz.getName(), id);
    }

    @Override
    public List<T> findAll() throws Exception {
        Query query = getSession().createQuery("from " + ClassUtils.getShortName(clazz));
        List<T> list = query.list();
        return list;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public Session getSession() {
        if (sessionFactory != null) {
            session = sessionFactory.getCurrentSession();
        }
        if (session == null) {
            throw new RuntimeException("Hibernate session is null");
        }
        sessionFactory.getCurrentSession().setFlushMode(FlushMode.MANUAL);
        return session;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void removeAll(List<T> list) {
        if (list != null && list.size() > 0) {
            for (T t : list) {
                try {
                    getSession().delete(update(t));
                    getSession().flush();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
