public class Company {
    public static void main(String[] args) {

        Employee pracownik1 = new Employee();
        pracownik1.name = "Jan";
        pracownik1.surname = "Kowalski";
        pracownik1.birthDate = 1980;
        pracownik1.workYears =5;
        Employee pracownik2 = new Employee();
        pracownik2.name = "Jan";
        pracownik2.surname = "Nowak";
        pracownik2.birthDate = 1985;
        pracownik2.workYears =2;
        Employee pracownik3 = new Employee();
        pracownik3.name = "Jan";
        pracownik3.surname = "Nieznany";
        pracownik3.birthDate = 1990;
        pracownik3.workYears =1;

        System.out.println("Pracownik nr 1 :"+pracownik1.name+" "+pracownik1.surname+ " urodzony w roku: "+pracownik1.birthDate+" pracuje w firmie lat:"+pracownik1.workYears);
        System.out.println("Pracownik nr 2 :"+pracownik2.name+" "+pracownik2.surname+ " urodzony w roku: "+pracownik2.birthDate+" pracuje w firmie lat:"+pracownik2.workYears);
        System.out.println("Pracownik nr 3 :"+pracownik3.name+" "+pracownik3.surname+ " urodzony w roku: "+pracownik3.birthDate+" pracuje w firmie lat:"+pracownik3.workYears);

    }
}
