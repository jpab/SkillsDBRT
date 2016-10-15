package com.jpabrandao.skillsdbrt.repository;

import com.jpabrandao.skillsdbrt.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
