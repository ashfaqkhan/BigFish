package com.tcs.bigfish.bo;

import com.tcs.bigfish.hibernate.Defectentry;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface DefectentryBO {

	public void persist(Defectentry transientInstance);

	public void remove(Defectentry persistentInstance);

	public Defectentry merge(Defectentry detachedInstance);

	public Defectentry findById(int id);
}
