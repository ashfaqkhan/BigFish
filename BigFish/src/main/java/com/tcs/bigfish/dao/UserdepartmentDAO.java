package com.tcs.bigfish.dao;


import com.tcs.bigfish.hibernate.Userdepartment;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface UserdepartmentDAO {

	public void persist(Userdepartment transientInstance);

	public void remove(Userdepartment persistentInstance);

	public Userdepartment merge(Userdepartment detachedInstance);

	public Userdepartment findById(int id);
}
