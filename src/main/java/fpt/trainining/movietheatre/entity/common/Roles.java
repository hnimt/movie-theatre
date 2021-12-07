package fpt.trainining.movietheatre.entity.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Roles {
    CUSTOMER("CUSTOMER"), MEMBER("CUSTOMER"), EMPLOYEE("EMPLOYEE"), ADMIN("ADMIN");
    private String roleName;
}
