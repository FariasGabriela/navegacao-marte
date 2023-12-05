package robos.navegacao.service;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import robos.navegacao.service.dto.FotosDTO;

/**
 * Integração com a API: Nasa API
 */
@RegisterRestClient(configKey = "nasa-api")
public interface NasaApiService {

    /**
     * Busca todas as imagens
     * @param key - Chave de acesso
     * @return - Lista de imagens
     */
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    FotosDTO getAllImages(@QueryParam("api_key") String key);

}
