package fpt.trainining.movietheatre.controller;

import fpt.trainining.movietheatre.dto.ResponseHandler;
import fpt.trainining.movietheatre.dto.role.RoleCreateDTO;
import fpt.trainining.movietheatre.entity.Role;
import fpt.trainining.movietheatre.service.IRoleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired private IRoleService roleService;
    @Autowired private ModelMapper mapper;

    @GetMapping
    public ResponseEntity findAll() {
        Collection<Role> res = roleService.findAll();
        return ResponseHandler.generateResponse("Find all roles!", HttpStatus.OK, res);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody RoleCreateDTO roleCreateDTO) {
        Role role = mapper.map(roleCreateDTO, Role.class);
        Role res = roleService.save(role);
        return ResponseHandler.generateResponse("Create role successfully!", HttpStatus.CREATED, res);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteRoleById(@PathVariable Integer id) {
        roleService.remove(id);
        return ResponseHandler.generateResponse("Delete role successfully!", HttpStatus.OK, null);
    }
}
