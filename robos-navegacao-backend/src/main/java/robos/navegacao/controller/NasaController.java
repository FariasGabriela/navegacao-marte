package robos.navegacao.controller;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import robos.navegacao.dto.NavegacaoDTO;
import robos.navegacao.service.NasaApiService;
import robos.navegacao.service.dto.NasaDTO;
import robos.navegacao.service.dto.FotosDTO;

/**
 * Classe controller com a lógica de implementação de busca de imagens de marte
 */
@RequestScoped
public class NasaController {

    /**
     * Injeção de dependencia da classe Nasa API Service
     */
    @Inject
    @RestClient
    NasaApiService nasaApiService;

    /**
     * Key usada para acessar API de imagens
     */
    @ConfigProperty(name = "nasa_key_api")
    String keyNasaAPI;

    /**
     * Busca as imagens na API da nasa e filtra por posição solicitada
     *
     * @return - imagem da posição solicitada no endpoint
     */
    public NavegacaoDTO getAllImages(Integer position) {
        FotosDTO fotosDTO = nasaApiService.getAllImages(keyNasaAPI);
        NasaDTO nasaDTO = fotosDTO.getPhotos().get(position);

        NavegacaoDTO navegacaoDTO = new NavegacaoDTO();

        navegacaoDTO.setIdNavegacao(nasaDTO.getId());
        navegacaoDTO.setDsImage(nasaDTO.getImg_src());

        return navegacaoDTO;
    }

}
