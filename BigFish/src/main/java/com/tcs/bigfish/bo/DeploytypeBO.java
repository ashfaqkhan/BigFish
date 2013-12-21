package com.tcs.bigfish.bo;

import com.tcs.bigfish.hibernate.Deploytype;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface DeploytypeBO {

	public void persist(Deploytype transientInstance);
	
	public void remove(Deploytype persistentInstance);

	public Deploytype merge(Deploytype detachedInstance);

	public Deploytype findById(int id);
}
