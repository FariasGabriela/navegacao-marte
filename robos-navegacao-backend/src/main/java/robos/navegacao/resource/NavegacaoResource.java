package robos.navegacao.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import robos.navegacao.controller.NasaController;

/**
 * Classe de API do projeto
 */
@Path("/navegacao")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class NavegacaoResource {

    /**
     * Injeção de dependencia para classe de controller
     */
    @Inject
    NasaController nasaController;

    /**
     * Endpoint para consultar imagem
     *
     * @param position - posição para buscar a imagem
     * @return - objeto com id e imagem
     */
    @GET
    @Path("{position}")
    public Response getAllImages(@PathParam("position") Integer position) {
        return Response.ok().entity(nasaController.getAllImages(position)).build();
    }
}
