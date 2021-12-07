package fpt.trainining.movietheatre.entity.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Roles {
    CUSTOMER("CUSTOMER"), MEMBER("MEMBER"), EMPLOYEE("EMPLOYEE"), ADMIN("ADMIN");
    private String roleName;
}
