package farmacia;

public enum Sintomas {

    DOR_DE_CABEÇA(1, "Dor de cabeça"),
    DOR_DE_ESTOMAGO(2, "Dor de estomâgo"),
    ENJOO(3, "Enjôo"),
    ALERGIA(4, "Alergia");

    private int codigo;
    private String descricao;

    Sintomas(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}