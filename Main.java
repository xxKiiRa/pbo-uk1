// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat objek FilmAction
        FilmAction filmAction = new FilmAction("Avengers: Endgame", "Action", 2019, "Tinggi");

        // Membuat objek FilmDrama
        FilmDrama filmDrama = new FilmDrama("The Pursuit of Happyness", "Drama", 2006, "Sangat Emosional");

        // Membuat rental untuk film action dengan durasi sewa default
        Rental rental1 = new Rental(filmAction, "John Doe");
        rental1.detailRental();

        System.out.println();

        // Membuat rental untuk film drama dengan durasi sewa 3 hari
        Rental rental2 = new Rental(filmDrama, "Jane Smith", 3);
        rental2.detailRental();
    }
}
