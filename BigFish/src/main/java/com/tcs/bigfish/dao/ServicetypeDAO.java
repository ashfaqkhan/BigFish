package com.tcs.bigfish.dao;

import com.tcs.bigfish.hibernate.Servicetype;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface ServicetypeDAO {

	public void persist(Servicetype transientInstance);

	public void remove(Servicetype persistentInstance);

	public Servicetype merge(Servicetype detachedInstance);

	public Servicetype findById(int id);
}
