
class Aluno {

    private String nomeAluno;

    private String dataNascimento;

    private String serie;

    //Método get e set do nome

    public void setNomeAluno (String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeAluno () {
        return nomeAluno;
    }

    //Método get e set da data de nascimento

    public void setDataNascimento (String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento () {
        return dataNascimento;
    }

    //Método get e set da série

    public void setSerie (String serie) {
        this.serie= serie;
    }

    public String getSerie () {
        return serie;
    }
}