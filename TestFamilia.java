//TestFmilia.java
public class TestFamilia{
  public static void main(String args[]){

       Humano adan = new Humano("Adan", "casta¤o", "negros");
       System.out.println("Padre de " + adan.perfil());

       Humano eva = new Humano("Eva", "rubio", "azules");
       System.out.println("Madre de " + eva.perfil());

       Humano abel = eva.engendrar(adan,"Abel");
       System.out.println("Hijo de " + abel.perfil());

  }
}
