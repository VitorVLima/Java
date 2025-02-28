

public class Cliente {
    private String CPF;
    private String nome;
    private String profissao;

    Cliente(String CPF, String nome, String profissao){
        this.CPF = CPF;
        this.nome = nome;
        this.profissao = profissao;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public String getCPF(){
        return this.CPF;
    }

    public String getNome(){
        return this.nome;
    }

    public String getProfissao(){
        return this.profissao;
    }
}
