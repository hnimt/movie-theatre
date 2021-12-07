package fpt.trainining.movietheatre.service.impl;

import fpt.trainining.movietheatre.dto.request.TypeRequest;
import fpt.trainining.movietheatre.dto.response.TypeResponse;
import fpt.trainining.movietheatre.entity.Type;
import fpt.trainining.movietheatre.repository.TypeRepository;
import fpt.trainining.movietheatre.service.TypeService;
import fpt.trainining.movietheatre.service.mapper.TypeMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TypeServiceImpl implements TypeService {
    private final TypeMapper mapper;
    private final TypeRepository repository;

    @Override
    public ResponseEntity<List<TypeResponse>> getAll() {
        List<Type> types = repository.findAll();

        List<TypeResponse> typeResponses = types.stream()
                .map(mapper::map)
                .collect(Collectors.toList());

        return ResponseEntity.ok(typeResponses);
    }

    @Override
    public ResponseEntity<TypeResponse> create(TypeRequest request) {
        Type type = mapper.map(request);

        repository.save(type);

        return ResponseEntity.ok(mapper.map(type));
    }
}