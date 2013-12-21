package com.tcs.bigfish.bo;

import com.tcs.bigfish.hibernate.Defectcause;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface DefectcauseBO {

	public void persist(Defectcause transientInstance);

	public void remove(Defectcause persistentInstance);

	public Defectcause merge(Defectcause detachedInstance);

	public Defectcause findById(int id);
}
