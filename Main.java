class Lista{
  int [] elementos;
  int qtde;
  int cap;
  Lista(){
      elementos = new int [4];
      qtde = 0;
      cap = 4;
  }

  boolean estaCheia(){
    return qtde == cap;
    //return qtde == cap ? true:false;
  }
  
  void inserir (int e) {
    elementos[qtde] = e;
    qtde++;
  }
}


class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}