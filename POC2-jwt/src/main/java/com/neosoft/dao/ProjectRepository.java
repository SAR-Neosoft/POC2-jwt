package com.neosoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.neosoft.model.Projectjwt;

public interface ProjectRepository extends JpaRepository<Projectjwt, Long> {

}
