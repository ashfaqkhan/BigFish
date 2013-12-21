package com.tcs.bigfish.bo;


import com.tcs.bigfish.hibernate.Defectseverity;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface DefectseverityBO {

	public void persist(Defectseverity transientInstance);

	public void remove(Defectseverity persistentInstance);

	public Defectseverity merge(Defectseverity detachedInstance);

	public Defectseverity findById(int id);
}
