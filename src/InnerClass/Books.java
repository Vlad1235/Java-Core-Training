package InnerClass;

public class Books {
    private String title;
    private String author;

    class BooksTestDrive {

        public void insideOne() {
            Books[] myBooks = new Books[3];
            //создаем новые объекты и присваиваем им ссылочные перменные массива!!!!
            myBooks[0] = new Books();
            myBooks[1] = new Books();
            myBooks[2] = new Books();
            // после присвоения уже можно вызывать выражения и методы от присвоеных объектов
            myBooks[0].title = "Плоды Java";
            myBooks[1].title = "Java Гетсби";
            myBooks[2].title = "Сборник рецептов по Java";

            myBooks[0].author = "Боб";
            myBooks[1].author = "Сью";
            myBooks[2].author = "Ян";

            int x = 0;
            while (x < 3) {
                System.out.print(myBooks[x].title);
                System.out.print(" ,автор ");
                System.out.println(myBooks[x].author);
                x = x + 1;
            }
        }
    }

}

/*
Плоды Java ,автор Боб
Java Гетсби ,автор Сью
Сборник рецептов по Java ,автор Ян
 */