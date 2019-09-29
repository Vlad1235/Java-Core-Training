package job4j.BooleanLogic.logic2;

public class OperatorSwitchCase {
//Условный оператор switch — case удобен в тех случаях, когда количество вариантов очень много и писать для каждого if-else очень долго.
// switch работает с такими примитивными типами данных как: byte, short, char, и int.
// Также с типами Enum,  классом String и несколькими специальными классами-оболочками примитивных типов: Character, Byte, Short, Integer.
//Выражение в круглых скобках после switch сравнивается со значениями, указанными после слова case, и, в случае совпадения, управление  передается соответствующему блоку кода.
// Если выражение не совпадает ни с одним вариантом case, то управление передается блоку default, который не является обязательным.
// После выполнения соответствующего блока, оператор break вызывает завершение выполнения оператора switch.
// Если break отсутствует, то управление передается  следующему блоку за только что выполненным.

    //В следующем примере,  для целочисленного значения, представляющего день недели, определяется его название в виде строки.
// Для значения 3, переменная dayString примет значение «Среда».

    public void dnyNedely() {

        int day = 3;
        String daySting;
        switch (day) {
            case 1:
                daySting = "Monday";
                break;
            case 2:
                daySting = "Tuesday";
                break;
            case 3:
                daySting = "Wendsday";
                break;
            case 4:
                daySting = "Thursday";
                break;
            case 5:
                daySting = "Friday";
                break;
            case 6:
                daySting = "Saturday";
                break;
            case 7:
                daySting = "Sunday";
                break;
            default:
                daySting = "Oshibka";
                break;
        }
        System.out.println(daySting);
    }
}

//В вашем случае break не нужен, потому что вы используете return и в вашем случае код break (прерывание дальнейшей проверки условий) никогда не сможет быть достигнут,
// потому что перед ним стоит return, который уже сам по себе прерывает switch оператор, возвращая определенное значение.