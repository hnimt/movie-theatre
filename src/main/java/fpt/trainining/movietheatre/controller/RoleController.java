package fpt.trainining.movietheatre.controller;

import fpt.trainining.movietheatre.dto.ResponseHandler;
import fpt.trainining.movietheatre.dto.role.RoleCreateReq;
import fpt.trainining.movietheatre.entity.Role;
import fpt.trainining.movietheatre.service.RoleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/role")
public class RoleController {

    @Autowired private RoleService roleService;
    @Autowired private ModelMapper mapper;

    @GetMapping
    public ResponseEntity findAll() {
        Collection<Role> res = roleService.findAll();
        return ResponseHandler.generateResponse("Find all roles!", HttpStatus.OK, res);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody RoleCreateReq roleCreateReq) {
        Role role = mapper.map(roleCreateReq, Role.class);
        Role res = roleService.save(role);
        return ResponseHandler.generateResponse("Create role successfully!", HttpStatus.CREATED, res);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteRoleById(@PathVariable Integer id) {
        roleService.remove(id);
        return ResponseHandler.generateResponse("Delete role successfully!", HttpStatus.OK, null);
    }
}
