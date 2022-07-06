import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Anahi Salgado", "Pediatria");
        myDoctor.addAvailableAppointment(new Date(), "4 pm");
        myDoctor.addAvailableAppointment(new Date(), "10 am");
        myDoctor.addAvailableAppointment(new Date(), "1 pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        /*int i = 0;
        int b = 2;
        b = i;
        // b = 0
        String name = "Ann";


        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        Patient patient2 = new Patient("Anahi", "Anahi@mail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;
        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());*/


    }
}

