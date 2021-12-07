package fpt.trainining.movietheatre.service.impl;

import fpt.trainining.movietheatre.entity.Role;
import fpt.trainining.movietheatre.exception.ResourceNotFoundException;
import fpt.trainining.movietheatre.repository.RoleRepository;
import fpt.trainining.movietheatre.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class RoleService implements IRoleService {

    @Autowired private RoleRepository roleRepository;

    @Override
    public Collection<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findById(Object id) {
        return roleRepository.findById((Integer) id)
                .orElseThrow(() -> new ResourceNotFoundException("Cannot find role id: " + id));
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void remove(Object id) {
        roleRepository.deleteById((Integer) id);
    }
}
