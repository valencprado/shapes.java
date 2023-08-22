class Quadrado extends Forma {
  int lado;
  
  void calcularArea() {
  area =  lado * lado;
    System.out.println("A área do quadrado é: " + area);
  }
}