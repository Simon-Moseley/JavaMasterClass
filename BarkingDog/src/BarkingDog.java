public class BarkingDog {
       public static void main(String[] args) {

          if (shouldWakeUp(true, 19)) {
             System.out.println("WAKE UP");
          } else System.out.println("let it bark");
}
    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {

        if (!barking) {
            return false;
        } else if (hourOfTheDay > 24 || hourOfTheDay == -1) {
            return false;
        } else if (hourOfTheDay <= 7 || hourOfTheDay >= 23) {
            return true;
        } else if (hourOfTheDay > 8 || hourOfTheDay < 23) {
            return false;
        }
        return barking;
    }
}
