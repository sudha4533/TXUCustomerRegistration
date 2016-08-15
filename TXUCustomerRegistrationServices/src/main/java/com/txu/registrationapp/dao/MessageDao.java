package com.txu.registrationapp.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.txu.registrationapp.util.HibernateSessionManager;

public class MessageDao {

	public boolean saveSid(int sid, int cid) {

		Session session = HibernateSessionManager.getSessionFactory().openSession();

		if (session != null) {

			Transaction tx = session.beginTransaction();

			Query query = session.createQuery("update Customer set service_id = :msid" + " where id = :mcid");

			query.setParameter("msid", sid);

			query.setParameter("mcid", cid);

			if (query.executeUpdate() != 0) {

				tx.commit();

				session.close();

				return true;
			}

			return false;
		}

		return false;

	}

}
