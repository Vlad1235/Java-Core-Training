package Nasledovanie.BEST;

public class Surgeon extends Doctor {

    public Surgeon(String name, String surname, long education, long birthday, int experienceInField) {
        super(name, surname, education, birthday,experienceInField);
    }
    public void output(){ super.output(); }

    public static void main(String[] args) {
        Profession Zhenya = new Surgeon("mark", "markov", 7, 1990, 3);
        Zhenya.output();
    }


}
