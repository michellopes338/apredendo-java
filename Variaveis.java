import java.text.MessageFormat;

public class Variaveis {
  public static void main(String[] args) {
    short anoDeNascimento = 2001;
    int anoAtual = java.time.LocalDate.now().getYear();
    int idade = anoAtual - anoDeNascimento;
    String nome = "Michel";
    String mensagem = MessageFormat.format("Olá, meu nome é {0} e eu tenho {1} anos de idade", nome, idade);
    System.out.println(mensagem);
  }
}