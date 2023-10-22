import javax.print.Doc;

public class Doctor {
    static int id = 0;
    String name;
    String speciality;

    Doctor() {
        System.out.println("Construyendo Objeto Doctor vacío");
    }

    Doctor(String name, String speciality) {
        System.out.println("Construyendo objeto Doctor con parametros");
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    public void showName() {
        System.out.println(name);
    }

}