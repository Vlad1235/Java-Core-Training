package job4j.BooleanLogic.logic1;

public class ChisloMesatsa {

        //Дано число месяца (тип int).
        //Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.

        int mesyatz = 7;

        public void mesatz() {

            String vremyaGoda = new String();

            switch (mesyatz) {
                case 1:
                    vremyaGoda = "January";
                    System.out.println(vremyaGoda + "Winter");
                    break;
                case 2:
                    vremyaGoda = "February";
                    System.out.println(vremyaGoda + "Winter");
                    break;
                case 3:
                    vremyaGoda = "March";
                    System.out.println(vremyaGoda + "Spring");
                    break;
                case 4:
                    vremyaGoda = "April";
                    System.out.println(vremyaGoda + "Spring");
                    break;
                case 5:
                    vremyaGoda = "May";
                    System.out.println(vremyaGoda + "Spring");
                    break;
                case 6:
                    vremyaGoda = "June";
                    System.out.println(vremyaGoda + "Summer");
                    break;
                case 7:
                    vremyaGoda = "July";
                    System.out.println(vremyaGoda + "Summer");
                    break;
                case 8:
                    vremyaGoda = "August";
                    System.out.println(vremyaGoda + "Summer");
                    break;
                case 9:
                    vremyaGoda = "September";
                    System.out.println(vremyaGoda + "Autumn");
                    break;
                case 10:
                    vremyaGoda = "October";
                    System.out.println(vremyaGoda + "Autumn");
                    break;
                case 11:
                    vremyaGoda = "November";
                    System.out.println(vremyaGoda + "Winter");
                    break;
                case 12:
                    vremyaGoda = "December";
                    System.out.println(vremyaGoda + "Winter");
                    break;
                default:
                    vremyaGoda = "Oshibka";
                    break;
            }

            }

    }
        //в операторе switch имеется ключевое слово default, к которому перейдет программа, в случае,
    // если ни одно из условий case не выполнится. Тоесть у меня переменная во всех случаях
    // будет инициализована, прежде чем будет выведена на консоль.