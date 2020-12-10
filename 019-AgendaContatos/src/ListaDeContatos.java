public class ListaDeContatos {
   private NoContato inicio,fim;

   public ListaDeContatos(){
      inicio = null;
      fim = null;
   }
 
   public boolean vazia(){
      return inicio==null;
   }

   public void adiciona(Contato c){
       if(vazia()){
            inicio = new NoContato(c);
            fim = inicio;
       } else {
         NoContato aux1=inicio, aux2=null;
         while (aux1!=null && 
                aux1.dado.getNome().compareTo(c.getNome())<0)
         {
             aux2=aux1;
             aux1=aux1.prox;
          }
         NoContato novo = new NoContato(c);
         novo.prox=aux1;
         if (aux2 != null){
             if (aux1!=null)
                 aux1.ant =novo;
            aux2.prox=novo;
         } else{
                 novo.prox = inicio;
                 inicio.ant = novo;
                 inicio = novo;
         }
    }
 }
 
 public Contato remove (String nome){
    Contato resp = null;

    if(vazia()){
       System.out.println("ERRO! LISTA VAZIA");
    } else {
      NoContato aux1=inicio, aux2=inicio;
      while (aux1 != null && !aux1.dado.getNome().equals(nome)){
         aux2=aux1;
         aux1=aux1.prox;
      }
      if (aux1 == inicio){
         inicio = inicio.prox;
      }
      if (aux1!=null){
         resp = aux1.dado;
         if (aux1.dado.getNome().equals(nome)){
            aux2.prox=aux1.prox;
         }
       }
    }
 return resp;
 }
 
 public String percorre(){
   String resp="";
   NoContato aux = inicio;
   while (aux!=null){
         resp = resp + "\n"+aux.dado.toString();
         aux=aux.prox;
   }
  return resp;
 }
}
