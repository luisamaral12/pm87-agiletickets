package br.com.caelum.agiletickets.domain.precos;

import java.math.BigDecimal;

import br.com.caelum.agiletickets.models.Sessao;

public class AcrescimoParaEspetaculoNormal extends AcrescimoParaEspetaculo {

	static final double TAXA_ESPETACULO_NORMAL = 0.10;

	public BigDecimal acrescimoParaEspetaculoNormal(Sessao sessao,
			double totalDeIngressos, double ingressosRestantes) {
		BigDecimal preco;
		//quando estiver acabando os ingressos...
		
		if(ingressosRestantes / totalDeIngressos <= 0.05) {
			preco = CalculadoraDePrecos.atualizaPreco(sessao, TAXA_ESPETACULO_NORMAL);
		} else {
			preco = sessao.getPreco();
		}
		return preco;
	}

}