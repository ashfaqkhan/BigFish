package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.UserdepartmentBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Userdepartment;

/**
 * Home object for domain model class Userdepartment.
 * @see com.tcs.bigfish.hibernate.Userdepartment
 * @author Hibernate Tools
 */

public class UserdepartmentDAOImpl extends BaseDAO  implements UserdepartmentBO {

	private static final Log log = LogFactory.getLog(UserdepartmentDAOImpl.class);

	public void persist(Userdepartment transientInstance) {
		log.debug("persisting Userdepartment instance");
		getHibernateTemplate().save(transientInstance);
	}

	public void remove(Userdepartment persistentInstance) {
		log.debug("removing Userdepartment instance");
		getHibernateTemplate().delete(persistentInstance);
	}

	public Userdepartment merge(Userdepartment detachedInstance) {
		log.debug("merging Userdepartment instance");
		Userdepartment result = getHibernateTemplate().merge(detachedInstance);
		return result;
    }

	@SuppressWarnings("unchecked")
	public Userdepartment findById(int id) {
		log.debug("getting Userdepartment instance with id: " + id);
		List<Userdepartment> list = getHibernateTemplate().find("from Userdepartment where departmentId=", id);
		Userdepartment instance = list.get(0);
		return instance;
	}
}
