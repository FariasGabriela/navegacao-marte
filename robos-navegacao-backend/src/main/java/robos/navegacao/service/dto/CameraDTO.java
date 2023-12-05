package robos.navegacao.service.dto;

/**
 * Dto do endpoint de integração com a nasa, objeto da Camera
 */
public class CameraDTO {

    /**
     * ID
     */
    private Integer id;

    /**
     * Nome
     */
    private String name;

    /**
     * Id do robo
     */
    private Integer rover_id;

    /**
     * Nome completo
     */
    private String full_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRover_id() {
        return rover_id;
    }

    public void setRover_id(Integer rover_id) {
        this.rover_id = rover_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
}
