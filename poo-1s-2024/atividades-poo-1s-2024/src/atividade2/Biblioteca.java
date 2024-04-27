package atividade2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
   
   private final List<Livro> livros = new ArrayList<>();

   public void cadastrarLivro(Livro var1) {
      this.livros.add(var1);
   }

   public String listarLivros() {
      StringBuffer sb = new StringBuffer();

      // Livro var3;
      //for(Iterator var2 = this.livros.iterator(); var2.hasNext(); var1 = var1 + var3.id + " - " + var3.titulo + "\n") {
      //   var3 = (Livro)var2.next();
      //}


      for(var livro : livros) {
         sb.append(livro.id + " - " + livro.titulo + "\n");
      }

      return sb.toString();
   }
}

