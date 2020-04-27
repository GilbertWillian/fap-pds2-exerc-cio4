package com.fap.pds2_exercicio4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 * JavaFX MyApp
 */
public class MyApp extends Application {

    private AnchorPane pane;
    private TextField campoUsuario;
    private PasswordField campoSenha;
    private Button botaoLogin, botaoSair;
    private static Stage stage;
	
	@Override
    public void start(Stage stage) {
        
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		
		stage.setTitle("Form Login");
		stage.show();
		
		MyApp.stage = stage;
    }

	public void componentes() {
		pane = new AnchorPane();
		pane.setPrefSize(500, 400);
		
		campoUsuario = new TextField();
		campoUsuario.setPromptText("Usuário...");
		
		campoSenha = new PasswordField();
		campoSenha.setPromptText("Senha...");
		
		botaoLogin = new Button("Login");
		
		botaoSair = new Button("Sair");
		
		pane.getChildren().addAll(campoUsuario, campoSenha);
		pane.getChildren().addAll(botaoLogin, botaoSair);
		

	}
	
    public static void main(String[] args) {
        launch(); 
    }

}