public class SaloonRunner {
    public static void main(String[] args) {

        User user = new User("Julia", new Account(1000));

        Specialist specialist1 = new Specialist(FullName.IVANOVA_IVANA, Profession.HAIRDRESSER, new Rating());
        user.addMark(specialist1, 5);

        
    }
}
