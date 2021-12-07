package fpt.trainining.movietheatre.service.mapper;

import fpt.trainining.movietheatre.dto.request.ShowDateRequest;
import fpt.trainining.movietheatre.dto.response.ShowDateResponse;
import fpt.trainining.movietheatre.entity.ShowDate;
import org.springframework.stereotype.Component;

@Component
public class ShowDateMapper {
    public ShowDate map(ShowDateRequest request) {
        ShowDate showDate = new ShowDate();

        showDate.setShowDate(request.getShowDate());
        showDate.setDayName(request.getShowDate().getDayOfWeek().toString());

        return showDate;
    }

    public ShowDateResponse map(ShowDate showDate) {
        ShowDateResponse response = new ShowDateResponse();

        response.setShowDateId(showDate.getShowDateId());
        response.setShowDate(showDate.getShowDate());
        response.setDayName(showDate.getDayName());
        response.setMovies(showDate.getMovies());

        return response;
    }
}
