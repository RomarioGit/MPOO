import controller.ControleLogin;
import model.BaseDados;
import model.Usuario;
import view.TelaBusca;
import view.TelaCadastro;
import view.TelaInicio;
import view.TelaLogin;
/*
 * Como fazer um siatema de atendimento médico(telaMedico,TelaRecepção,TelaAtendente)
 * 
 * if (BaseDados.isUsuario(new Usuario(telaLogin.getLoginField().getText(), 
				telaLogin.getSenhaField().getText()))){
				
		}
 */

public class App {
	public static void main(String[] args) {
		TelaLogin telaLogin = new TelaLogin(); //VIEW
		TelaInicio telainicio = new TelaInicio();
		TelaCadastro telaCadastro = new TelaCadastro();
		TelaBusca telaBusca = new TelaBusca();
		
		ControleLogin controleTela = new ControleLogin(telaLogin,telainicio,telaCadastro,telaBusca);
		
		
	}
}
