<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar curso</title>
<jsp:include page="../../../importe.jsp"/>

<script type="text/javascript">
	$(function (){
		//$('#txtCPF').number(true);
	})	
</script>


</head>

<body>
	<div class="container">
		<h2>Cadastro de cursos</h2>
		<form action="gravar">
			<div class="form-group">
				<label for="quantidade">Quantidade de vagas:</label> <input type="text"
					name="curso.vagas" id="txtQntVgs" class="form-control" required><br />
			</div>
			<div class="form-group">
				<label for="descricao">Descrição do curso:</label> <input type="text"
					name="curso.descricao" id="txtDesc"  class="form-control" required><br />
			</div>
			<input type="submit" value="gravar" class="btn btn-success">
		</form>
	</div>
</body>
</html>