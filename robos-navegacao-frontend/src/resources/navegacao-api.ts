import axios, { AxiosResponse } from "axios";
import NavegacaoModel from "../model/navegacao-model";

/**
 * Classe de integração com endpoint de navegação
 */
export default class NavegacaoAPI {

  /**
   * Url de conexão
   */
  URL: string = `http://localhost:8080`;

  public async getImageByPosition( position: number ): Promise<AxiosResponse<NavegacaoModel>> {
    return axios({
      method: "get",
      url: `${this.URL}/navegacao/${position}`,
    });
  }

}
