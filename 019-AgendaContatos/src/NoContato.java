public class NoContato{
   public Contato dado;
   public NoContato prox;
   public NoContato ant;
   
   public NoContato(Contato c){
      dado = c;
      prox = null;
      ant = null;
   }
}