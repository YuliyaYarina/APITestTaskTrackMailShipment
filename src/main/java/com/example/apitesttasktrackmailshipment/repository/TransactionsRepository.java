package com.example.apitesttasktrackmailshipment.repository;

import com.example.apitesttasktrackmailshipment.model.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, Long> {
    @Query(value = "SELECT * FROM transactions WHERE postal_items_id = :id ORDER BY time DESC LIMIT 1", nativeQuery = true)
    Optional<Transactions> findLatestById(@Param("id") Long id);

 @Query(value = "SELECT * FROM transactions WHERE postal_items_id = :id", nativeQuery = true)
    Optional<Transactions> findAllById(@Param("id") Long id);

}
