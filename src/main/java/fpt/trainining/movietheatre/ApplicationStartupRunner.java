package fpt.trainining.movietheatre;

import fpt.trainining.movietheatre.dto.account.AccountRegisterReq;
import fpt.trainining.movietheatre.dto.request.ScheduleRequest;
import fpt.trainining.movietheatre.dto.request.ShowDateRequest;
import fpt.trainining.movietheatre.dto.request.TypeRequest;
import fpt.trainining.movietheatre.dto.role.RoleCreateReq;
import fpt.trainining.movietheatre.service.*;
import lombok.AllArgsConstructor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
public class ApplicationStartupRunner implements CommandLineRunner {
    private final TypeService typeService;
    private final ShowDateService showDateService;
    private final ScheduleService scheduleService;

    @Override
    public void run(String... args) throws Exception {
        TypeRequest typeRequest = new TypeRequest();
        typeRequest.setTypeName("horror");
        typeService.create(typeRequest);
        typeRequest.setTypeName("action");
        typeService.create(typeRequest);
        typeRequest.setTypeName("comedy");
        typeService.create(typeRequest);

        ShowDateRequest showDateRequest = new ShowDateRequest();
        showDateRequest.setShowDate(LocalDate.of(2021, 12, 10));
        showDateService.create(showDateRequest);
        showDateRequest.setShowDate(LocalDate.of(2021, 12, 11));
        showDateService.create(showDateRequest);
        showDateRequest.setShowDate(LocalDate.of(2021, 12, 12));
        showDateService.create(showDateRequest);

        ScheduleRequest scheduleRequest = new ScheduleRequest();
        scheduleRequest.setScheduleTime(LocalTime.of(9, 0));
        scheduleService.create(scheduleRequest);
        scheduleRequest.setScheduleTime(LocalTime.of(11, 30));
        scheduleService.create(scheduleRequest);
        scheduleRequest.setScheduleTime(LocalTime.of(14, 0));
        scheduleService.create(scheduleRequest);
        scheduleRequest.setScheduleTime(LocalTime.of(20, 40));
        scheduleService.create(scheduleRequest);
    }

}
