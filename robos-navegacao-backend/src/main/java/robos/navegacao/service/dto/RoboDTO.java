package robos.navegacao.service.dto;

/**
 * Dto do endpoint de integração com a nasa, objeto do Robo
 */
public class RoboDTO {

    /**
     * ID
     */
    private Integer id;

    /**
     * Nome do robo
     */
    private String name;

    /**
     * Data de pouso
     */
    private String landing_date;

    /**
     * Data de lançamento
     */
    private String launch_date;

    /**
     * Situação
     */
    private String status;

    /**
     * Posição maxima do sol
     */
    private Integer max_sol;

    /**
     * Data maxima
     */
    private String max_date;

    /**
     * Total de fotos
     */
    private Integer total_photos;


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

    public String getLanding_date() {
        return landing_date;
    }

    public void setLanding_date(String landing_date) {
        this.landing_date = landing_date;
    }

    public String getLaunch_date() {
        return launch_date;
    }

    public void setLaunch_date(String launch_date) {
        this.launch_date = launch_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getMax_sol() {
        return max_sol;
    }

    public void setMax_sol(Integer max_sol) {
        this.max_sol = max_sol;
    }

    public String getMax_date() {
        return max_date;
    }

    public void setMax_date(String max_date) {
        this.max_date = max_date;
    }

    public Integer getTotal_photos() {
        return total_photos;
    }

    public void setTotal_photos(Integer total_photos) {
        this.total_photos = total_photos;
    }
}
