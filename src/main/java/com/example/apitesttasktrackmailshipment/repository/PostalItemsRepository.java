package com.example.apitesttasktrackmailshipment.repository;

import com.example.apitesttasktrackmailshipment.model.PostalItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostalItemsRepository extends JpaRepository<PostalItems, Long> {

}
