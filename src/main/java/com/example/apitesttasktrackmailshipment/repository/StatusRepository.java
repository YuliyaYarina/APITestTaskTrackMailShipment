package com.example.apitesttasktrackmailshipment.repository;

import com.example.apitesttasktrackmailshipment.model.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<Transactions, Long> {

}
