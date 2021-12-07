package fpt.trainining.movietheatre.service.mapper;

import fpt.trainining.movietheatre.dto.request.TypeRequest;
import fpt.trainining.movietheatre.dto.response.TypeResponse;
import fpt.trainining.movietheatre.entity.Type;
import org.springframework.stereotype.Component;

@Component
public class TypeMapper {
    public Type map(TypeRequest request) {
        Type type = new Type();

        type.setTypeName(request.getTypeName());
        return type;
    }

    public TypeResponse map(Type type) {
        TypeResponse response = new TypeResponse();

        response.setTypeId(type.getTypeId());
        response.setTypeName(type.getTypeName());

        return response;
    }
}
