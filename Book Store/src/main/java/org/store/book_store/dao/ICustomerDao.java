package org.store.book_store.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.store.book_store.entities.CustomerInfo;

public interface ICustomerDao extends JpaRepository<CustomerInfo, Integer> {




}
