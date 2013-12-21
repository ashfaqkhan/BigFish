package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.ComplexityBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Complexity;

/**
 * Home object for domain model class Complexity.
 * @see com.tcs.bigfish.hibernate.Complexity
 * @author Hibernate Tools
 */

public class ComplexityDAOImpl extends BaseDAO implements ComplexityBO {

	private static final Log log = LogFactory.getLog(ComplexityDAOImpl.class);

	public void persist(Complexity transientInstance) {
		log.debug("persisting Complexity instance");
		getHibernateTemplate().save(transientInstance);
	}

	public void remove(Complexity persistentInstance) {
		log.debug("removing Complexity instance");
		getHibernateTemplate().delete(persistentInstance);
	}

	public Complexity merge(Complexity detachedInstance) {
		log.debug("merging Complexity instance");
		Complexity result = getHibernateTemplate().merge(detachedInstance);
		return result;
	}

	@SuppressWarnings("unchecked")
	public Complexity findById(int id) {
		log.debug("getting Complexity instance with id: " + id);
		List<Complexity> list = getHibernateTemplate().find("from Complexity where complexityId= ", id);
		Complexity instance = list.get(0);
		return instance;
    }
}
