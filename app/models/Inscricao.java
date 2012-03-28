package models;

import javax.persistence.Entity;

import play.data.validation.Email;
import play.data.validation.Required;
import play.data.validation.Unique;
import play.db.jpa.Model;

@Entity
public class Inscricao extends Model {
	@Required(message="Atenção: Você deve preencher seu CPF.") 
	@Unique(message="Atenção: CPF já cadastrado.")
    public String cpf;
    
	public long matricula;
	
    @Required(message="Atenção: Você deve preencher seu nome completo.")
	public String nomeCompleto;
	
    @Required(message="Atenção: Você deve preencher seu email.") 
    @Email(message="Atenção: Você deve informar um email válido.")
    public String email;
	
    @Required(message="Atenção: Você deve preencher seu telefone.")
    public String telefone;

    public Inscricao() {
    	
    }
    
	public Inscricao(String cpf, long matricula, String nomeCompleto,
			String email, String telefone) {
		super();
		this.cpf = cpf;
		this.matricula = matricula;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.telefone = telefone;
	}
}
