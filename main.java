public class Main {
  public static void main(String[] args) {

    // Temperature
    // +5 wear super warm
    // +5 to +15 warm
    // +15 to +30 normal
    // +30 and more you need cooling

    var temperature = 5;

    if (temperature == 5) {
      System.out.println("Super warm!");
    }
    else if (temperature >= 5 & temperature <= 15) {
      System.out.println("Just warm!");
    }
    else if (temperature >= 15 & temperature <= 30) {
     System.out.println("It's normal!");
     }
    else if (temperature > 30) 
     System.out.println("Need cooling ASAP!");
  }

}
