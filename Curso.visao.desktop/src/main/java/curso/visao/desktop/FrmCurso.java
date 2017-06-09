package curso.visao.desktop;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import curso.controle.CursoControle;
import curso.modelo.dao.Curso;

/**
 * <p>
 * Classe que representa a view para gerir clientes
 * </p>
 */
public class FrmCurso extends JFrame {

	private Interface telaPrincipal;

	public FrmCurso(Interface telaPrincipal) {
		this.telaPrincipal = telaPrincipal;
		setTitle("Sistema -> Cursos");
		setSize(320, 240);
		setLocationRelativeTo(telaPrincipal);
		desenhaComponentes();
		setVisible(true);
	}

	private void desenhaComponentes() {
		JLabel lblVagas = new JLabel("Vagas:");
		JLabel lblDesc = new JLabel("Descrição do curso:");
		final JTextField txtVagas = new JTextField(30);
		final JTextField txtDesc = new JTextField(30);
		JButton btnGravar = new JButton("Gravar");

		setLayout(new FlowLayout(FlowLayout.LEFT));

		btnGravar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				CursoControle controle = new CursoControle();
				// pegar os dados da tela
				Curso c = new Curso();
				
				
				// converte para um valor numerico			 
				c.setVagas(controle.converteInteiro(txtVagas.getText()));
				
				//salva a desc
				c.setDescricao(txtDesc.getText());

				// valida os dados
				String erro = controle.validarCurso(c);
				if (erro == null) {
					// nenhum erro criado
					// realiza a gravacao
					controle.gravar(c);
					JOptionPane.showMessageDialog(null, "Gravado com sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, erro, "Validar",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		// adiciona os componentes em tela
		add(lblVagas);
		add(txtVagas);
		add(lblDesc);
		add(txtDesc);
		add(btnGravar);

	}

}
