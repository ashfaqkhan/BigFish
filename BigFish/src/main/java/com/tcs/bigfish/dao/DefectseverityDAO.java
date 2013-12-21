package com.tcs.bigfish.dao;


import com.tcs.bigfish.hibernate.Defectseverity;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface DefectseverityDAO {

	public void persist(Defectseverity transientInstance);

	public void remove(Defectseverity persistentInstance);

	public Defectseverity merge(Defectseverity detachedInstance);

	public Defectseverity findById(int id);
}
