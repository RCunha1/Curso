<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cursos</title>

<jsp:include page="../../../importe.jsp"/>

<script type="text/javascript">
		$(function (){
			$('table').dataTable({
				"language": {
	            	"lengthMenu": "Monstrando _MENU_ registros por pagina",
	            	"zeroRecords": "Nenhuma ocorrência",
	            	"info": "Showing page _PAGE_ of _PAGES_",
	            	"infoEmpty": "No records available",
	            	"infoFiltered": "(filtered from _MAX_ total records)",
	            	"search": "Buscar"
	        	}  
    		})
		});
	</script>
</head>
<body>
	<div class="container">
		<h2>Listagem de Cursos</h2>
		<table>
			<thead>
				<tr>
					<th>Quantidade de vagas</th>
					<th>Descrição do curso</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${Curso}" var="cr">
					<tr>
						<td>${cr.vagas}</td>
						<td>${cr.descricao}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br /> <a href="cadastrar" class="btn btn-primary"> <span
			class="glyphicon glyphicon-plus"></span> Adicionar
		</a>
	</div>
</body>
</html>