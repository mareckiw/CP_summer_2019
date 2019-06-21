public class Homework1 {

    public static void main(String[] args) {
        String email = "imie.nazwisk@ogmail.com";

        if (email.isEmpty()) System.out.println("podaj adres email");
        System.out.println(email + " is "+email.length()+" character long");
        if (email.indexOf('@') == -1) System.out.println("dodaj znak @");
        if (email.indexOf('@') > 1) System.out.println("podaj prawidłowy adres email - tylko jeden znak @");
//        if (email.indexOf('.') == -1) System.out.println("podaj prawidłowy adres email - dodaj kropkę");
        System.out.println(CheckEmail(email));

//        if (email.indexOf('.') > 1) System.out.println("podaj prawidłowy adres email - dodaj kropkę");
    }

    static boolean CheckEmail(String email) { /*zwraca true or false*/
        //konwertujemy email do tablicy stringów
        char ArrayOfEmail[] = email.toCharArray();

        int i = 0;//dodajemy zmienną, aby operować na kolejnosci wzglednej w stringu email

        //najpierw sprawdzmy stringa po znaku @
        if (ArrayOfEmail[i] == '@') {
            if (email.indexOf('@') == -1) System.out.println("dodaj znak @");
            int j = i++;
            //'.' can't be placed after @
            if(i < ArrayOfEmail.length && !Character.isAlphabetic(ArrayOfEmail[j])) {
                return false;
            }
            if (!Character.isAlphabetic(ArrayOfEmail[0])) { //jesli 1 znak nie jest alfanumeryczny to zwroc false
                return false;
            }
            else {
                return false;
            }
        }
        else {
            return true;
        }





    }
}
