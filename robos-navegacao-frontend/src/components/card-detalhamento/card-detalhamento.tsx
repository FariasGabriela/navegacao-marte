import './card-detalhamento.css'

/**
 * Componente de card com as informações detalhadas dos comandos que podem ser realizados
 * @returns 
 */
function CardDetalhamento() {
  return (
    <div className="card-coordenadas">
      <div>Comandos</div>
      <div>
        <div className="label-instrucao">
          <div className="bold">{"L ou > :"} </div> Robô p/ Esquerda
        </div>
        <div className="label-instrucao">
          <div className="bold">{"R ou < :"} </div> Robô p/ Direita
        </div>
        <div className="label-instrucao">
          <div className="bold">{"M ou Espaço:"} </div> Robô Andar
        </div>
      </div>
    </div>
  );
}

export default CardDetalhamento;