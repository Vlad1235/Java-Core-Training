package job4j.BooleanLogic.logic1;

public class KolichMaksChisel {
    //Вывести на консоль количество максимальных чисел среди этих четырех.
    public void maksChisel() {
        byte x = 8;
        byte y = 7;
        byte z = 8;
        byte h = 2;
        int kolMaks;
        int maksvivod;


        if (x >= y) {
            kolMaks = x;
        } else if (x >= z) {
            kolMaks = x;
        } else if (x >= h) {
            kolMaks = x;
        } else {
            kolMaks = h;
        }
            System.out.println(kolMaks);



        if (kolMaks == x) {
            maksvivod = (kolMaks + kolMaks) / kolMaks;
            System.out.println(maksvivod);
        } else if (kolMaks == y) {
            maksvivod = (kolMaks + kolMaks) / kolMaks;
            System.out.println(maksvivod);
        } else if (kolMaks == z) {
            maksvivod = (kolMaks + kolMaks) / kolMaks;
            System.out.println(maksvivod);
        } else if (kolMaks == h) {
            maksvivod = (kolMaks + kolMaks) / kolMaks;
            System.out.println(maksvivod);

        }
    }
}


// Другой способ через счетчик

//public class Name {
//public static void main(String[] args) {
//int a = 1;
//int b = 5;
// int c = 4;
     //   int d = 6;

     //   int max;
     //   int numberOfMax = 0;

  //      if(a > b)
     //       max = a;
      //  else
     //       max = b;

     //   if(max < c)
 //           max = c;

   //     if(max < d)
    //        max = d;

   //     System.out.println("Maximum is " + max);

  //      if(max == a)
   //         numberOfMax ++;

   //     if(max == b)
   //         numberOfMax ++;

   //     if(max == c)
    //        numberOfMax ++;

 //       if(max == d)
  //          numberOfMax ++;

 //       System.out.println("Number of max = " + numberOfMax);
 //   }

//}



// Это способ от самого автора проекта:
//public static void main(String[] args) {
 //   int a = 4;
  //  int b = 2;
  //  int c = 2;
  //  int d = 4;
   // int max;
  //  int numberOfMax = 1;

 //   if(a > b)
  //      max = a;
  //  else if (a == b){
 //       max = a;
 //       numberOfMax++;}
  //  else
 //       max = b;

 //   if(max < c){
 //       max = c;
 //       numberOfMax = 1;}
 //   else if (max == c) {
 //       numberOfMax++;
  //  }

//    if(max < d){
 //       max = d;
  //      numberOfMax = 1;
  //  }
 //   else if (max == d) {
 //       numberOfMax++;
  //  }

  //  System.out.println("Maximum is " + max);
 //   System.out.println("Number of max = " + numberOfMax);
//}