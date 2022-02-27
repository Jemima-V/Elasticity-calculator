class Main {
  public static void main(String[] args) {
    double p1 = 95;
    double p2 = 105;
    double q1 = 400000;
    double q2 = 800000;

    System.out.println("\nPercent change Quantity:");
    System.out.println((q2-q1)/((q2+q1)/2));

    System.out.println("\nPercent change price:");
    System.out.println((p2-p1)/((p2+p1)/2));

    System.out.println("\nElasticity");
    System.out.println(((q2-q1)/((q2+q1)/2))/((p2-p1)/((p2+p1)/2)));
  }
}