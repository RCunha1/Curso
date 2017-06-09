package curso.visao.web;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import curso.controle.CursoControle;
import curso.modelo.dao.Curso;

//import br.edu.iffarroupilha.bolicho.controle.ClienteControle;
//import br.edu.iffarroupilha.bolicho.modelo.Cliente;

@Resource
public class CursoController {

	private CursoControle controle;
	private Result result;

	public CursoController(CursoControle controle, Result result) {
		this.controle = controle;
		this.result = result;
	}
	
	public void listar(){		
		List itens = controle.buscarTodos(Curso.class);
		result.include("Curso",itens);
	}
	
	//carrega a visao 
	public void cadastrar(){
		
	}
	
	public void gravar(Curso curso){		
		//objeto temporário	
		controle.gravar(curso);
	}
	
}
