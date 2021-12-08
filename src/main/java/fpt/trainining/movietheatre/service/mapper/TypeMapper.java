package fpt.trainining.movietheatre.service.mapper;

import fpt.trainining.movietheatre.dto.request.TypeRequest;
import fpt.trainining.movietheatre.dto.response.TypeResponse;
import fpt.trainining.movietheatre.entity.Type;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TypeMapper {
    private final ModelMapper mapper;

    public Type map(TypeRequest request) {
        return mapper.map(request, Type.class);
    }

    public TypeResponse map(Type type) {
        return mapper.map(type, TypeResponse.class);
    }
}
