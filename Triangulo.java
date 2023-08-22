class Triangulo extends Forma {
  int base; 
  int altura;
  void calcularArea() {
    area = base * altura / 2;
     System.out.println("A área do triângulo é: " + area);
  }
}