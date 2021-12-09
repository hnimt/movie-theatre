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

    @Override
    public void run(String... args) throws Exception {
        TypeRequest typeRequest = new TypeRequest();
        typeRequest.setTypeName("horror");
        typeService.create(typeRequest);
        typeRequest.setTypeName("action");
        typeService.create(typeRequest);
        typeRequest.setTypeName("comedy");
        typeService.create(typeRequest);

    }

}
