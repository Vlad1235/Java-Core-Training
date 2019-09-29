package HeadFirstJava.Glava4;

class DogTestDrive{

         public static void main(String[] args) {

            Dog [] d = new Dog[3];

             d[0] = new Dog();
             d[1] = new Dog();
             d[2] = new Dog();

            d[0].size = 16;
            d[0].name = "Middle dog";

            d[1].size = 2;
            d[1].name = "Small dog";

            d[2].size = 70;
            d[2].name = "Big dog";

            int x =0;
            while(x<3) {
                System.out.print(d[x].name + "  ");
                d[x].bark();
                x++;
            }

        }
}

