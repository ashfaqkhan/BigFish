package com.tcs.bigfish.dao;

import com.tcs.bigfish.hibernate.Application;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.dao
 * @author Ashfaq
 */
public interface ApplicationDAO {

	public void persist(Application transientInstance);
	
	public void remove(Application persistentInstance);
	
	public Application merge(Application detachedInstance);

	public Application findById(int id);
}
