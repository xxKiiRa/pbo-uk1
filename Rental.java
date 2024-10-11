
// Kelas Rental
class Rental {
    private Film film;
    private String namaPenyewa;
    private int durasiSewa;

    // Constructor Overloading
    public Rental(Film film, String namaPenyewa) {
        this.film = film;
        this.namaPenyewa = namaPenyewa;
        this.durasiSewa = 1; // Default durasi sewa 1 hari
    }

    public Rental(Film film, String namaPenyewa, int durasiSewa) {
        this.film = film;
        this.namaPenyewa = namaPenyewa;
        this.durasiSewa = durasiSewa;
    }

    // Getter dan Setter
    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public void setNamaPenyewa(String namaPenyewa) {
        this.namaPenyewa = namaPenyewa;
    }

    public int getDurasiSewa() {
        return durasiSewa;
    }

    public void setDurasiSewa(int durasiSewa) {
        this.durasiSewa = durasiSewa;
    }

    // Method untuk menampilkan detail rental
    public void detailRental() {
        System.out.println("Nama Penyewa: " + namaPenyewa);
        System.out.println("Durasi Sewa: " + durasiSewa + " hari");
        System.out.println("Detail Film yang Disewa:");
        film.infoFilm();
    }
}
