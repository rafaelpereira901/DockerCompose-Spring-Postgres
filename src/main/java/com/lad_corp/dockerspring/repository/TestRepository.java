package com.lad_corp.dockerspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lad_corp.dockerspring.model.Test;

public interface TestRepository extends JpaRepository<Test, Long> {

}
