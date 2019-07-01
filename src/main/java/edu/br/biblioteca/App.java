package edu.br.biblioteca;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Usuario user = new Usuario("465", "ze@oi.com");
        Livro livro = new Livro("Java", "tio");
        System.out.println(user.getEmail());
        System.out.println(user.getSenha());
    }
}
