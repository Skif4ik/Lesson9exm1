import model.Flat;
import model.Person;



public class Main {
    public static void main(String[] args) {

        Flat flat1 = new Flat("Sovetskaya 1"); //flat1 - ссылка на квартиру
        //пример агрегации - нежесткая связь между объектами
        //объект квартира относится к двум людям, и может существовать отдельно от них
        Person person1 = new Person("Misha", flat1); // передаем при создании человека в параметр ссылку flat1
        Person person2 = new Person("Masha", flat1);

        System.out.println(person1);
        System.out.println(person2);
        person1 = null;
        person2 = null;
        System.out.println(flat1);

        Person person3 = new Person("Vasya", flat1);
        System.out.println(person3);
        System.out.println(person3.getRegFlat().getAddress()); //Sovetskaya 1

    }
}
