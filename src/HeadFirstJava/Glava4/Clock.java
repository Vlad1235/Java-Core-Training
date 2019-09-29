package HeadFirstJava.Glava4;

public class Clock {

        private String time;

        public void setTime(String t) {
            time = t;
        }

        public String getTime(){
            return time;
        }

         public static void main(String[] args) {
            Clock c = new Clock();
            c.setTime("12:55");
            String tod = c.getTime();
            System.out.println("время: " + tod);
        }
}
/*
Время: 12:55
 */