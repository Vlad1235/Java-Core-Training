package Nasledovanie.BEST;

public class Programmer extends Engineer {

    public Programmer(String name, String surname, long education, long birthday, int experienceInField){
        super(name,surname,education,birthday,experienceInField);
    }

    public void output(){ super.output();}

    public static void main(String[] args) {
        Profession mark = new Programmer("mark","markov",5,1990,7);
        mark.output();
    }




}
