package com.dpc.workoutkeeper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpc.workoutkeeper.beans.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
