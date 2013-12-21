package com.tcs.bigfish.dao;

import com.tcs.bigfish.hibernate.Deploystage;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface DeploystageDAO {

	public void persist(Deploystage transientInstance); 

	public void remove(Deploystage persistentInstance);

	public Deploystage merge(Deploystage detachedInstance);

	public Deploystage findById(int id);
}
