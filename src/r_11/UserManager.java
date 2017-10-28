package r_11;

public class UserManager {
    public static void main(String[] args)
    {
        User user = new User("Jan","Kowalski");

        System.out.println("Wybierz opcje:");
        System.out.println("0 - wyjscie z programu");
        System.out.println("1 - wyswietl uzytkownika");
        System.out.println("2 - modyfikuj uzytkownika");

        int option = 1;

        if(option==0)
        {
            System.out.println("Bye bye!");
        }
        else if(option==1)
        {
            System.out.println(user.getFirstName()+" "+user.getLastName());
        }
        else if(option==2)
        {
            user.setFirstName("Adam");
            user.setLastName("Nowak");
            System.out.println("Zmieniono dane na: "+user.getFirstName()+" "+user.getLastName());
        }
    }
}
