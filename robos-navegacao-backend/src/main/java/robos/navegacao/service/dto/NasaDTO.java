package robos.navegacao.service.dto;

/**
 * Dto no endpoint da nasa API
 */
public class NasaDTO {

    /**
     * ID
     */
    private Integer id;

    /**
     * Sol
     */
    private Integer sol;

    /**
     * Link da imagem
     */
    private String img_src;

    /**
     * Dia em que a foto foi tirada, na terra
     */
    private String earth_date;

    /**
     * Dto dos dados da camera
     */
    private CameraDTO camera;

    /**
     * Dto dos dados do robo
     */
    private RoboDTO rover;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSol() {
        return sol;
    }

    public void setSol(Integer sol) {
        this.sol = sol;
    }

    public String getImg_src() {
        return img_src;
    }

    public void setImg_src(String img_src) {
        this.img_src = img_src;
    }

    public String getEarth_date() {
        return earth_date;
    }

    public void setEarth_date(String earth_date) {
        this.earth_date = earth_date;
    }

    public CameraDTO getCamera() {
        return camera;
    }

    public void setCamera(CameraDTO camera) {
        this.camera = camera;
    }

    public RoboDTO getRover() {
        return rover;
    }

    public void setRover(RoboDTO rover) {
        this.rover = rover;
    }
}
