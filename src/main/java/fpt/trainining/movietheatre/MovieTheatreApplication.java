package fpt.trainining.movietheatre;

import fpt.trainining.movietheatre.service.*;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@AllArgsConstructor
public class MovieTheatreApplication {
    private final TypeService typeService;
    private final ShowDateService showDateService;
    private final ScheduleService scheduleService;

    private final RoleService roleService;
    private final AccountService accountService;

    public static void main(String[] args) {
        SpringApplication.run(MovieTheatreApplication.class, args);
    }

    @Bean
    public ApplicationStartupRunner schedulerRunner() {
        return new ApplicationStartupRunner(typeService, showDateService, scheduleService, roleService, accountService);
    }
}
