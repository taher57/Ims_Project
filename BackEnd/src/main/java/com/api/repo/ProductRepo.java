package com.api.repo;

import com.api.entity.FileDB;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<FileDB,String> {

}
  