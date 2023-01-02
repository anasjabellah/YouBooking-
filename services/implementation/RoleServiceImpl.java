package com.example.bookingmt.services.implementation;

import com.example.bookingmt.entities.Role;
import com.example.bookingmt.repositories.RoleRepository;
import com.example.bookingmt.services.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void addRole(Role role) {
        roleRepository.save(role);
    }

    @Override
    public void updateRole(Role role) {
        roleRepository.save(role);
    }

    @Override
    public Boolean DeleteRole(Long id) {
        return Boolean.TRUE;
    }

    @Override
    public List<Role> GetAllRoles() {
        return roleRepository.findAll();
    }
}
