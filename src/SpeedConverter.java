public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHours(1.5));
        System.out.println(toMilesPerHours(10.25));
        System.out.println(toMilesPerHours(-5.6));
        System.out.println(toMilesPerHours(25.42));
        System.out.println(toMilesPerHours(75.114));



    }

    public static long toMilesPerHours(double kilometersPerhour) {
    if (kilometersPerhour < 0) {
        return -1;
    } else {
        double milesPerHour = kilometersPerhour / 1.609;
            return Math.round(milesPerHour);

        }
    }


}
