public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer(20,"Warmet Gaming X", 5000.0f);
        // To do: Panggillah Method Informasi dari class Komputer
        System.out.println("INFORMASI KOMPUTER :");
        komputer.Informasi();

        System.out.println("==================================");


        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP komputerVIP = new KomputerVIP(15, "Warnet Gaming X", 7000.0f, true);
        // To do: Panggillah Method Informasi dari class KomputerVIP
        System.out.println("INFORMASI KOMPUTER :");
        komputerVIP.Informasi();
        // To do: Panggillah Method Login
        komputerVIP.Login("Eliezer");
        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        komputerVIP.Bermain(2);
        komputerVIP.Bermain(2,3);

        System.out.println("==================================");


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium komputerPremium = new KomputerPremium(5, "Warnet Gaming X", 10000.0f, true);
        // To do: Panggillah Method Informasi dari class KomputerPremium
        System.out.println("INFORMASI KOMPUTER :");
        komputerPremium.Informasi();
        // To do: Panggillah Method Pesan
        komputerPremium.Pesan(5);
        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
        komputerPremium.TambahLayanan("Mie Goreng");
        komputerPremium.TambahLayanan("Mie Goreng","Es Teh");
    }
}