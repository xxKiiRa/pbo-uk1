
// Kelas Anak (FilmAction)
class FilmAction extends Film {
    private String tingkatKekerasan;

    // Constructor
    public FilmAction(String judul, String genre, int tahunRilis, String tingkatKekerasan) {
        super(judul, genre, tahunRilis);
        this.tingkatKekerasan = tingkatKekerasan;
    }

    // Getter dan Setter
    public String getTingkatKekerasan() {
        return tingkatKekerasan;
    }

    public void setTingkatKekerasan(String tingkatKekerasan) {
        this.tingkatKekerasan = tingkatKekerasan;
    }

    // Overriding method infoFilm
    @Override
    public void infoFilm() {
        super.infoFilm();
        System.out.println("Tingkat Kekerasan: " + tingkatKekerasan);
    }
}
