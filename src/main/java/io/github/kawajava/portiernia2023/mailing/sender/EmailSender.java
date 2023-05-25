package io.github.kawajava.portiernia2023.mailing.sender;

import io.github.kawajava.portiernia2023.admin.lecturehall.model.AdminLectureHall;
import io.github.kawajava.portiernia2023.admin.lecturehall.service.AdminLectureHallService;
import io.github.kawajava.portiernia2023.admin.lecturer.model.AdminLecturer;
import io.github.kawajava.portiernia2023.admin.lecturer.service.AdminLecturerService;
import io.github.kawajava.portiernia2023.mailing.service.EmailSenderService;
import io.github.kawajava.portiernia2023.user.rental.model.Rental;
import io.github.kawajava.portiernia2023.user.rental.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmailSender {
    @Autowired
    private EmailSenderService senderService;

    @Autowired
    private RentalService rentalService;

    @Autowired
    private AdminLecturerService adminLecturerService;

    @Autowired
    private AdminLectureHallService adminLectureHallService;

//    @Scheduled(fixedRate = 60000,initialDelay = 10000)
//    @EventListener(ApplicationReadyEvent.class)
//    public void sendMail(){
//
//        List<Rental> rentalsToSendEmail = rentalService.getRentalsToSendEmail();
//        for(int i = 0; i <rentalsToSendEmail.size(); i++) {
//
//            int lecturerId = rentalsToSendEmail.get(i).getLecturerId();
//            int lectureHallId = rentalsToSendEmail.get(i).getLectureHallId();
//
//            AdminLecturer adminLecturer = adminLecturerService.getLecturer((long) lecturerId);
//            AdminLectureHall adminLectureHall = adminLectureHallService.getLectureHall((long) lectureHallId);
//            String email = adminLecturer.getEmail();
//            String number = adminLectureHall.getNumber();
//
//            senderService.sendEmail(email,
//                    "Prośba o oddanie kluczy",
//                    "Witamy, \n" + "Uprzejmie prosimy o oddanie kluczy do sali " + number + ".\n" +
//                            "Pozdrawiamy,\n" + "Portiernia");
//
//            Rental rental = rentalsToSendEmail.get(i);
//
//            rental.setNotification(1);
//            rentalService.updateLRental(rental);
//        }
//    }
}
