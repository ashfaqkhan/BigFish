package com.tcs.bigfish.bo;

import com.tcs.bigfish.hibernate.Defecttype;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface DefecttypeBO {

	public void persist(Defecttype transientInstance);

	public void remove(Defecttype persistentInstance);

	public Defecttype merge(Defecttype detachedInstance);
	
	public Defecttype findById(int id);

}
