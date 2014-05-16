package exams.declare.practice.exam4.ex17;
class Electricity { int getCharge() { return 24; } }
public class Voltage extends Electricity {
  enum volts {twelve, twentyfour, oneten};
  public static void main(String[] args) {
    volts v = volts.twentyfour;
    switch (v) {
      case twelve:
        System.out.print("12 ");
      default:
        System.out.print(new Electricity().getCharge() + " ");
      case oneten:
        System.out.print("110 ");
} } }
