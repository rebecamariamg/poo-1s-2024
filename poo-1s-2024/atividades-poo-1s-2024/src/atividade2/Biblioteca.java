package atividade2;

import java.util.ArrayList;
import java.util.Iterator;

public class Biblioteca {
   public ArrayList<Livro> livros = new ArrayList();

   public Biblioteca() {
   }

   public void cadastrarLivro(Livro var1) {
      this.livros.add(var1);
   }

   public String listarLivros() {
      String var1 = "";

      Livro var3;
      for(Iterator var2 = this.livros.iterator(); var2.hasNext(); var1 = var1 + var3.id + " - " + var3.titulo + "\n") {
         var3 = (Livro)var2.next();
      }

      return var1;
   }
}

