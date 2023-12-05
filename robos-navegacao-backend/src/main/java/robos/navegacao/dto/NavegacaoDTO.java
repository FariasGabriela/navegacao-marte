package robos.navegacao.dto;

/**
 * Objeto com dados de ID e imagem
 */
public class NavegacaoDTO {

    /**
     * ID
     */
    public Integer idNavegacao;

    /**
     * Link da imagem de marte
     */
    public String dsImage;

    public Integer getIdNavegacao() {
        return idNavegacao;
    }

    public void setIdNavegacao(Integer idNavegacao) {
        this.idNavegacao = idNavegacao;
    }

    public String getDsImage() {
        return dsImage;
    }

    public void setDsImage(String dsImage) {
        this.dsImage = dsImage;
    }
}
