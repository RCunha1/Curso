package curso.controle;

import curso.modelo.dao.Curso;

public class CursoControle extends AControle {
	/**
	 * <p>
	 * Valida se os dados do curso est�o corretos
	 * </p>
	 */
	public String validarCurso(Curso curso) {
		if (curso != null) {
			if( curso.getVagas() == 0 ){
				return "Informe a quantidade de vagas!";
			}else if( curso.getDescricao() == null || curso.getDescricao().isEmpty()){
				return "Por favor, informe uma descri��o!";
			}			
		}else{
			return "Dados do curso n�o informados!";
		}
		return null;
	}

}