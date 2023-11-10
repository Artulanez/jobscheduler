package br.com.exemplos.springbatch.jobs;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;

@Service
public class MyJob {

    //@Scheduled(cron = "${interval-in-cron}")
    @Scheduled(fixedDelayString = "${interval}")
    public void JobOne() throws Exception {
        Random random = new Random();
        System.out.println(LocalDateTime.now());
    }

}
