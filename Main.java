import java.util.ArrayList;

class Main {
  // quase um mister maker 🟦🔵📐
  public static void main(String[] args) {
    // criando formas
    Quadrado quadradinho = new Quadrado();
    quadradinho.cor = "Vermelho";
    quadradinho.lado = 2;
    Triangulo tri = new Triangulo();
    tri.cor = "Azul";
    tri.base = 3;
    tri.altura = 4;
    Circulo bolinha = new Circulo();
    bolinha.cor = "Amarelo";
    bolinha.raio = 6;

    // criando array e adicionando formas
    ArrayList<Forma> arrFormas = new ArrayList();
    arrFormas.add(quadradinho);
    arrFormas.add(tri);
    arrFormas.add(bolinha);
    System.out.println(arrFormas);

    // iteração
    for (int i = 0; i < arrFormas.size(); i++) {
      arrFormas.get(i).mostrarCor();
      arrFormas.get(i).calcularArea();
      // POO ADS IFSP-PTB
    }
  }
}