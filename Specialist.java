public class Specialist {
    private FullName fullName;
    private Profession profession;
    private Rating rating = new Rating();

    public Specialist(FullName fullName, Profession profession, Rating rating) {
        this.fullName = fullName;
        this.profession = profession;
        this.rating = rating;
    }

    public FullName getFullName() {
        return fullName;
    }

    public Profession getProfession() {
        return profession;
    }

    public int getRating() {
        return rating.averageRating();
    }

    public void addMark(int mark) {
        rating.addMark(mark);
    }

    @Override
    public String toString() {
        return "Specialist{" +
                "fullName=" + fullName +
                ", profession=" + profession +
                ", rating=" + rating +
                '}';
    }
}
