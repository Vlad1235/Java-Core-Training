package ProhorenokBook;

/**
 * Важность return
 * 1. использование return это возвращение значения из метода. В таком случае указывается return И ВОЗРВАЩАЕМОЕ ЗНАЧЕНИЕ
 * 2. использование return если необходимо ДОСРОЧНО ПРЕРВАТЬ ВЫПОЛНЕНИЕ МЕТОДА. ПОСЛЕ ИСПОЛНЕНИЯ ЭТОГО ОПЕРАТОРА
 * ВЫПОЛНЕНИЕ ИНСТРУКЦИИ ВНУТРИ МЕТОДА ОСТАНОВИТСЯ И УПРАВЛЕНИЕ ВЕРНЕТСЯ ОБРАТНО В ТОЧКУ ОТКУДА ВЫЗВАН БЫЛ МЕТОД!!!
 *
 * не ПУТАТЬ С ОПЕРАТОРОМ break! Тот оператор имеено останавливаем инструкцию и переходит на начало точки откуда он была вызвана
 * Оператор return вообще выходит из метода НА ТОЧКУ ОТКУДА САМ МЕТОД БЫЛ ВЫЗВАН!!!
 *
 *
 * Также при использовании оператора return НЕЛЬЗЯ ЧТОБЫ БЫЛИ НЕОДНОЗНАЧНЫЕ СИТУАЦИИ (у меня были ошибки в этом)
 * СЛЕДУЕТ В КОНЦЕ ТЕЛА МЕТОДА ВСТАВИТЬ ОПЕРАТОР RETURN СО ЗНАЧЕНИЕМ ПО УМОЛЧАНИЮ
 */
public class Return_usage {
    //ВАЖНО!
    public static void test(){
        System.out.println("Тексе до оператора return");
        if (10>0) return ; // ВЫХОДИМ ИЗ МЕТОДА. НО возвратить ничего не удасться! Это просто ПРЕДОХРАНИТЕЛЬ ОТ ВЫПОЛНЕНИЯ МЕТОДА НА СЛУЧАЙ ОШИБОК. типо try/catch - в try тоже если ошибка дальнейшие инструкции внизу не выполняются и из блока try выбрасывается в блок catch
        System.out.println("Эта инструкция никогда не будет выполнена!!!!!");
    }

//    // с таким случаем НЕОДНОЗНАЧНОСТИ Я СТАЛКИВАЛСЯ, компилятор это воспринимает что возможны условия когда значение не будет возвращено.
//    // Когда х например будет меньше нуля
//    v
//        if (x>0){
//            return x+y;
//        }
//    }

    public static int test2(int x, int y) {
        if (x>0){
            return x+y;
        }
        return x; // вставляем значение по умолчанию
    }


    public static void main(String[] args) {
        Return_usage.test();
    }
}
/*
Тексе до оператора return
 */