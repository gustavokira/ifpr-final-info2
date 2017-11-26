import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    int d = 3;
    int k = 0;
    while(k<d){
      Jogador j1 = new Jogador();
      Jogador j2 = new Jogador();
      
      Carta c1 = new Carta();
      c1.nome = "Hulk";
      c1.forca = 10;
      c1.velocidade = 7;
      c1.peso = 10;
      
      Carta c2 = new Carta();
      c2.nome = "Thor";
      c2.forca = 8;
      c2.velocidade = 8;
      c2.peso = 6;
      
      Carta c3 = new Carta();
      c3.nome = "Flash";
      c3.forca = 3;
      c3.velocidade = 10;
      c3.peso = 3;
      
      Carta[] cartas = new Carta[3];
      cartas[0] = c2;
      cartas[1] = c1;
      cartas[2] = c3;
      
      int c = 0;
      int e = 2;
      j1.carta = cartas[c];
      j2.carta = cartas[e];
      
      System.out.println("-- minha carta -----");
      System.out.println("nome "+j1.carta.nome);
      System.out.println("força "+j1.carta.forca);
      System.out.println("velocidade "+j1.carta.velocidade);
      System.out.println("peso "+j1.carta.peso);
      System.out.println("--------------------");
      System.out.println("");
      
      System.out.println("escolha um atributo:");
      System.out.println("1 - força");
      System.out.println("2 - velocidade");
      System.out.println("3 - peso");
      
      Scanner s = new Scanner(System.in);
      int escolha = s.nextInt();
      
      Regras re = new Regras();
      
      int i = 0;
      if(escolha == 1){
        i = re.compararForca(j1.carta.forca,j2.carta.forca);
      }
      if(escolha == 2){
        i = re.compararVelocidade(j1.carta.velocidade,j2.carta.velocidade);
      }
      if(escolha == 3){
        i = re.compararPeso(j1.carta.peso,j2.carta.peso);
      }
      
      if(i == -1){
        System.out.println("ganhei!");
      }
      else if(i == 1){
        System.out.println("perdi!");
      }
      else{
        System.out.println("empate!");
      }
      
      System.out.println("");
      System.out.println("");
      k++;
    }
  }
}

class Regras{
  
  public int compararForca(int i, int j){
    if(i > j){
      return -1;
    }
    if(i < j){
      return 1;
    }
    return 0;
    
  }
  
  public int compararVelocidade(int i, int j){
    if(i > j){
      return -1;
    }
    if(i < j){
      return 1;
    }
    return 0;
  }
  
  public int compararPeso(int i, int j){
    if(i < j){
      return -1;
    }
    if(i > j){
      return 1;
    }
    return 0;
  }
}

class Jogador{
  public Carta carta;
  public String nome;
  
  public Jogador(){
    
  }
}

class Carta{
  public String nome;
  public int forca;
  public int velocidade;
  public int peso;
  
  public Carta(){
    
  }
}