package hw5;

public class MainApp {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("Ivanov Oleg", "Football player", "oleg19@mai.ru", 232332323, 10000000, 38);
        person[1] = new Person("Andrey Talalaev", "coach", "dwdw@mail.ru", 7770789, 200000, 48);
        person[2] = new Person("SIA", "singer","sia@gmail.com",56888765, 456879998, 42);
        person[3] = new Person("Hamzat Chimaev", "fighter", "ham@gmail.com", 2344323, 456000987, 26);
        person[4] = new Person("Amruddy Embaev","builder", "embaev94@gmail.com", 928887079, 27000, 27);

        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge()>40){
                person[i].info();
            }
        }


        }


    }


