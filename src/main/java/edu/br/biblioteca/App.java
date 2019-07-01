package edu.br.biblioteca;

import edu.br.biblioteca.modelo.Livro;
import edu.br.biblioteca.modelo.Usuario;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Usuario usuario = new Usuario();
        usuario.setEmail("ana@oi.com");
        usuario.setMatricula("1235");
        usuario.setSenha("ana123");

        Livro livro = new Livro("Java", "tio");
        System.out.println(usuario.getEmail());
        System.out.println(usuario.getSenha());

    }
}
