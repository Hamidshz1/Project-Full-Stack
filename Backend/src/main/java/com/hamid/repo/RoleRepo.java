package com.hamid.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamid.model.Role;


public interface RoleRepo extends JpaRepository<Role, Long> {

	public Role findRoleByName(String name);

}
