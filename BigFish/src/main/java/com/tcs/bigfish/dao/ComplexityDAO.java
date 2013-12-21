package com.tcs.bigfish.dao;

import com.tcs.bigfish.hibernate.Complexity;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface ComplexityDAO {

	public void persist(Complexity transientInstance);

	public void remove(Complexity persistentInstance);

	public Complexity merge(Complexity detachedInstance);

	public Complexity findById(int id);
}
