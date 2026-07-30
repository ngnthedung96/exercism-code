import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription,parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime timeNow = LocalDateTime.now();
        return timeNow.isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >=12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("'on' EEEE, MMMM d, yyyy, 'at' h:mm a");
        String date = appointmentDate.format(parser);
        return String.format("You have an appointment %s.", date);
    }

    public LocalDate getAnniversaryDate() {
        LocalDateTime timeNow = LocalDateTime.now();
        return LocalDate.of(LocalDateTime.now().getYear(), 9, 15);
    }
}
