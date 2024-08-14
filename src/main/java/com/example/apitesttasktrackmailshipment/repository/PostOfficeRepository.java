package com.example.apitesttasktrackmailshipment.repository;

import com.example.apitesttasktrackmailshipment.model.PostOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostOfficeRepository extends JpaRepository<PostOffice, Long> {

}
