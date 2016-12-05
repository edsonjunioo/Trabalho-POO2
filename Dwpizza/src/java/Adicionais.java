
/*
nome:Edson Junio Sousa matricula:11521BSI238
 */
public abstract class Adicionais extends Pizza{
    
    protected Pizza decorarPizza;
    
    public Adicionais(Pizza pizza){
        decorarPizza =  pizza;
    }
    
    
    public double getCusto(){ return decorarPizza.getCusto() + this.custo; }
    public String getDescricao() { return  decorarPizza.getDescricao() + " com " + this.descricao; }
}
