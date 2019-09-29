package Nasledovanie.BEST;

public class Dentist extends Doctor {

        public Dentist(String name, String surname, long education, long birthday, int experienceInField) {
                super(name, surname, education, birthday,experienceInField);
        }

        public void output(){ super.output(); }


        public static void main(String[] args) {
        Profession vasya = new Doctor("mark", "markov", 7, 1990, 3);
               vasya.output();
        }
}
