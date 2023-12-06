import { useState } from "react";
import "./navegacao.css";
import RoboIcon from "./../images/icon/robo.svg";
import Swal from "sweetalert2";
import NavegacaoAPI from "../resources/navegacao-api";
import CardDetalhamento from "../components/card-detalhamento/card-detalhamento";

/**
 * Tela principal da aplicação
 */
function Navegacao() {
  const [roboLeft, setRoboLeft] = useState(0);
  const [roboRight, setRoboRight] = useState(0);
  const [roboScale, setRoboScale] = useState(1);
  const navegacaoAPI = new NavegacaoAPI();

  /**
   * Comando para mover o robo para direita
   */
  function moveRoboRight() {
    setRoboRight(roboRight - 1);
    setRoboLeft(roboLeft + 1);
  }

  /**
   * Comando para mover robo para esquerda
   */
  function moveRoboLeft() {
    setRoboRight(roboRight + 1);
    setRoboLeft(roboLeft - 1);
  }

  /**
   * Valida a quantia de passos para mostrar mensagem de imagem encontrada
   */
  function validaPassosRobo() {
    if (roboLeft % 5 === 0 || roboRight % 5 === 0) return true;

    return false;
  }

  function moveRobo() {
    if (roboScale === 1) {
      moveRoboRight();
    } else {
      moveRoboLeft();
    }
  }

  /**
   * Mostra mensagem que uma imagem foi encontrada
   */
  function dialogImageFound() {
    Swal.fire({
      title: "Uma imagem foi encontrada, gostaria de visualizar?",
      showCancelButton: true,
      cancelButtonText: `Não`,
      confirmButtonText: `Sim`
    }).then((result) => {
      if (result.isConfirmed) {
        Swal.fire({ showConfirmButton: false, title: "Carregando..." });
        findImage(roboLeft);
      }
    });
  }

  /**
   * Busca imagem
   */
  function findImage(position: number) {
    navegacaoAPI
      .getImageByPosition(position)
      .then((result: any) => {
        Swal.fire({
          imageUrl: result.data.dsImage,
          imageHeight: 500,
          imageAlt: "Imagem de marte",
        });
      })
      .catch(() => Swal.close());
  }

  /**
   * Verifica que teclas foram clicadas pelo usuário
   */
  document.onkeydown = function (evt) {
    if (
      evt.key.toUpperCase() === "L" ||
      evt.key.toLowerCase() === "arrowleft"
    ) {
      setRoboScale(-1);
    }
    if (
      evt.key.toUpperCase() === "R" ||
      evt.key.toLowerCase() === "arrowright"
    ) {
      setRoboScale(1);
    }
    if (evt.key.toUpperCase() === "M" || evt.key.toUpperCase() === " ") {
      moveRobo();
      if (validaPassosRobo()) {
        dialogImageFound();
      }
    }
  };

  return (
    <div className="background">
      {CardDetalhamento()}
      <img
        src={RoboIcon}
        className="image-robo"
        style={{
          marginLeft: roboLeft * 10,
          marginRight: roboRight * 10,
          transform: `scaleX(${roboScale})`,
        }}
        alt="logo"
      />
    </div>
  );
}

export default Navegacao;
