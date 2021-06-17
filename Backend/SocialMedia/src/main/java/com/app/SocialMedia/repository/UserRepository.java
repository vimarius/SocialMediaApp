package com.app.SocialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.SocialMedia.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUserEmail(@Param("userEmail") String userEmail);

}