package fpt.trainining.movietheatre.service.impl;

import fpt.trainining.movietheatre.dto.request.ShowDateRequest;
import fpt.trainining.movietheatre.dto.response.ShowDateResponse;
import fpt.trainining.movietheatre.entity.ShowDate;
import fpt.trainining.movietheatre.repository.ShowDateRepository;
import fpt.trainining.movietheatre.service.ShowDateService;
import fpt.trainining.movietheatre.service.mapper.ShowDateMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ShowDateServiceImpl implements ShowDateService {
    private final ShowDateMapper mapper;
    private final ShowDateRepository repository;

    @Override
    public ResponseEntity<List<ShowDateResponse>> getAll() {
        List<ShowDate> showDates = repository.findAll();

        List<ShowDateResponse> responses = showDates.stream()
                .map(mapper::map)
                .collect(Collectors.toList());

        return ResponseEntity.ok(responses);
    }

    @Override
    public ResponseEntity<List<ShowDateResponse>> getByShowDate(LocalDate showDate) {
        List<ShowDate> showDates = repository.getShowDateByShowDate(showDate);

        List<ShowDateResponse> responses = showDates.stream()
                .map(mapper::map)
                .collect(Collectors.toList());

        return ResponseEntity.ok(responses);
    }

    @Override
    public ResponseEntity<ShowDateResponse> create(ShowDateRequest request) {
        ShowDate showDate = mapper.map(request);

        repository.save(showDate);

        return ResponseEntity.ok(mapper.map(showDate));
    }
}
