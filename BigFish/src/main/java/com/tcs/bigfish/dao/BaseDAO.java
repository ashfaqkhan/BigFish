package com.tcs.bigfish.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseDAO extends HibernateDaoSupport
{

	@Autowired
    public void setBigFishSessionFactory(SessionFactory sessionFactory)
    {
        setSessionFactory(sessionFactory);
    }
}
