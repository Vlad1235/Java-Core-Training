package Nasledovanie.BEST;

public class Builder extends Engineer {

        public Builder(String name, String surname, long education, long birthday, int experienceInField){
            super(name,surname,education,birthday,experienceInField);
        }

    public void output(){ super.output(); }

    public static void main(String[] args) {
        Builder ilya = new Builder("Ilya","Iliev",5,1990,5);
        ilya.output();
    }





}
