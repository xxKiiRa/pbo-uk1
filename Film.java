
// Kelas Induk (Film)
class Film {
    private String judul;
    private String genre;
    private int tahunRilis;

    // Constructor
    public Film(String judul, String genre, int tahunRilis) {
        this.judul = judul;
        this.genre = genre;
        this.tahunRilis = tahunRilis;
    }

    // Getter dan Setter
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    // Method dasar yang bisa di-override
    public void infoFilm() {
        System.out.println("Judul: " + judul);
        System.out.println("Genre: " + genre);
        System.out.println("Tahun Rilis: " + tahunRilis);
    }
}
