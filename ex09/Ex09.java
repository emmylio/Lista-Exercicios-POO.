package ex09;

public class Ex09 {

    private String nome;
    private int anoDeNascimento;
    private int anoAtual = 2025;

    public Ex09(String nome, int anoDeNascimento) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;
    }


    public String getNome() {
        return nome;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }


    public String calcularEleitor(){
        int idade = (anoAtual - anoDeNascimento);

        if (idade < 16) {
            return "Não Eleitor";
        } else if (idade < 18 || idade > 65) {
            return "Eleitor Facultativo";
        } else {
            return "Eleitor Obrigatório";
        }
    }
}
