package br.com.Jeivede.application;

import java.util.Date;

import br.com.Jeivede.domain.local.Cidade;
import br.com.Jeivede.domain.local.Estado;
import br.com.Jeivede.domain.local.Pais;
import br.com.Jeivede.domain.pessoal.Motorista;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pais
		Pais pais = new Pais();
		
		pais.setId(1);
		
		pais.setNome("Brasil");
		
		System.out.println(pais);
		
		Estado estado = new Estado();
		
		estado.setId(1);
		
		estado.setNome("Parana");
		
		estado.setPais(pais);
		
		System.out.println(estado);
		
		Estado sp = new Estado();
		
		sp.setId(2);
		
		sp.setNome("Sao Paulo");
		
		sp.setPais(pais);
		
		System.out.println(sp);
		
		//Cidade
		Cidade castro = new Cidade();
		
		castro.setId(1);
		
		castro.setNome("Castro");
		
		castro.setEstado(estado);
		
		Cidade itp = new Cidade();
		
		itp.setId(2);
		
		itp.setNome("Itapetininga");
		
		itp.setEstado(sp);
		
		//Pessoas
		Motorista motorista = new Motorista();
		
	    motorista.setNome("Tubarao da 151");
	    
	    motorista.setTelefone("42 99999-9999");
	    
	    motorista.setEmail("coisa.coisa@gmail.com");
	    
	    motorista.setLogradouro("Rua Tal");
	    
	    motorista.setComplemento("apt01");
	    
	    motorista.setNumero("60b");
	    
	    motorista.setCidade(castro);
	    
	    motorista.setxCpf(123456789);
	    
	    motorista.setxRg(123456);
	    
	    motorista.setOrgaoEmisor("sspr");
	    
	    Date dataNascimento = new Date();
	    
	    motorista.setDataNascimento(dataNascimento);
	    
	    motorista.setNumeroDeRegistro(1706);
	    
	    motorista.setEstaAtivo(true);
	    
	    motorista.setxCnh(12365478);
	    
	    motorista.setCategoria("AE");
	    
	    motorista.setEar(true);
		
		

	}

}
