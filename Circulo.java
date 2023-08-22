class Circulo extends Forma {
  int raio;
  void calcularArea() {
    area =  3.14 * (raio * raio);
     System.out.println("A área do círculo é: " + area);
  }
}