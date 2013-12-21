package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.BigfishuserBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Bigfishuser;

/**
 * Home object for domain model class Bigfishuser.
 * @see com.tcs.bigfish.hibernate.Bigfishuser
 * @author Hibernate Tools
 */

public class BigfishuserDAOImpl extends BaseDAO  implements BigfishuserBO {

	private static final Log log = LogFactory.getLog(BigfishuserDAOImpl.class);

	public void persist(Bigfishuser transientInstance) {
		log.debug("persisting Bigfishuser instance");
		getHibernateTemplate().save(transientInstance);
	}

	public void remove(Bigfishuser persistentInstance) {
		log.debug("removing Bigfishuser instance");
		getHibernateTemplate().delete(persistentInstance);
	}

	public Bigfishuser merge(Bigfishuser detachedInstance) {
		log.debug("merging Bigfishuser instance");
		Bigfishuser result = getHibernateTemplate().merge(detachedInstance);
		return result;
	}

	@SuppressWarnings("unchecked")
	public Bigfishuser findById(int id) {
		log.debug("getting Bigfishuser instance with id: " + id);
		List<Bigfishuser> list = getHibernateTemplate().find("from Bigfishuser where userId=",id);
		Bigfishuser instance = list.get(0);
		return instance;
	}
}
