public class Main {
    public static void main(String[] args) {
        Post person = new Post();
        person.name = "Ivan";
        person.passport = "4444 № 44444444";
        person.patronymic = "Ivanovich";
        person.phone = "+7 (999)-999-99-99";
        person.surname = "Ivanov";
        person.subscription = true;
        person.birthday = new FormDate();
        person.birthday.day = 13;
        person.birthday.month = 6;
        person.birthday.year = 299;
    }
}
