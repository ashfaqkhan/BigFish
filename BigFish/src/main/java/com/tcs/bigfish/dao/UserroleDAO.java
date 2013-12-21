package com.tcs.bigfish.dao;

import com.tcs.bigfish.hibernate.Userrole;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface UserroleDAO {

	public void persist(Userrole transientInstance);

	public void remove(Userrole persistentInstance);

	public Userrole merge(Userrole detachedInstance);

	public Userrole findById(int id);
}
