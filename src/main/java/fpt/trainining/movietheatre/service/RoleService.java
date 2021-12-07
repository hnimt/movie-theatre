package fpt.trainining.movietheatre.service;

import fpt.trainining.movietheatre.entity.Role;

public interface RoleService extends GeneralService<Role> {

    Role findByRoleName(String roleName);
}
