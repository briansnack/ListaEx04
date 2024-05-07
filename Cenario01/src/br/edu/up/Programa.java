import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Livro livro1 = new Livro("1598FHK", "Core Java 2", "Cay S. Horstmann e Gary Cornell", "0130819336", 2005);
        Livro livro2 = new Livro("9865PLO", "Java, Como programar", "Harvey Deitel", "0130341517", 2015);
       
        System.out.println("Informações do livro 01");
        System.out.println("Código: " + livro1.getCodigo());
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor(es): " + livro1.getAutores());
        System.out.println("ISBN: " + livro1.getIsbn());
        System.out.println("Ano: " + livro1.getAno());
        
        System.out.println();
        
        System.out.println("Informações do livro 02");
        System.out.println("Código: " + livro2.getCodigo());
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor(es): " + livro2.getAutores());
        System.out.println("ISBN: " + livro2.getIsbn());
        System.out.println("Ano: " + livro2.getAno());

        leitor.close();
    }
}
