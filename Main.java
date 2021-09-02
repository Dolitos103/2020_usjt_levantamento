import java.util.*;

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
    return qtde >= cap;
    //return qtde == cap ? true:false;
  }

  public void setQtde(int qtde){
    this.qtde = qtde;
  }

  void aumentar (){
    //alocar um novo vetor com o dobro de tamanho
    int [] aux = new int[this.cap*2];
    for(int i = 0; i < this.qtde; i++){
      aux [i] = elementos[i];
    }
    //dobra a capacidade
    this.cap *=2;
    //ajustar a variavel de referência
    elementos = aux;
  }
  
  void inserir (int e) {
    if(estaCheia())
      aumentar();
    elementos[qtde] = e;
    qtde++;
  }

  void exibir (){
    System.out.printf("***************\n");
    System.out.printf("Qtde: %d\n", qtde);
    System.out.printf("cap: %d\n", cap);
    for(int i = 0; i < this.qtde; i++){
      System.out.printf("%d ", this.elementos[i]);
    }
    System.out.printf("\n");
  }
}

class Main {
  public static void main(String[] args) {
    Random gerador = new Random();
    Lista umaLista = new Lista();
    for(int i = 0; i < 100; i++){
      int dado = gerador.nextInt(20) + 1;
      umaLista.inserir(dado);
      umaLista.exibir();
    }
  }
}