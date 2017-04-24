class ex1 {
  public static void main(String[] args) {
    int x = 2;
    while (x < 11) {
      if (x > 3) {
        System.out.println("big x");
      }
      if (x <= 3){
        System.out.println("little x");
      }
      if (x == 10) {
        System.out.println("JACKPOT");
      }
      x = x + 1;
    }
  }
}
