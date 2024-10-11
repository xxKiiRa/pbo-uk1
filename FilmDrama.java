
// Kelas Anak (FilmDrama)
class FilmDrama extends Film {
    private String ratingEmosi;

    // Constructor
    public FilmDrama(String judul, String genre, int tahunRilis, String ratingEmosi) {
        super(judul, genre, tahunRilis);
        this.ratingEmosi = ratingEmosi;
    }

    // Getter dan Setter
    public String getRatingEmosi() {
        return ratingEmosi;
    }

    public void setRatingEmosi(String ratingEmosi) {
        this.ratingEmosi = ratingEmosi;
    }

    // Overriding method infoFilm
    @Override
    public void infoFilm() {
        super.infoFilm();
        System.out.println("Rating Emosi: " + ratingEmosi);
    }
}
