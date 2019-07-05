public class Hiaf {
  public static void main (String[] args) {
     double pii = 4.0;
     double i=3.0 ;
     while (i <1000000001) {
      pii = pii -(4/i) +(4/(i+2));
      i+=4;
      System.out.println(pii);
      }

  }
}
