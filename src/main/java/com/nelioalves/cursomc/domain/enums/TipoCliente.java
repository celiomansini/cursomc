package com.nelioalves.cursomc.domain.enums;

//implementação sofisticada
public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa Física"), // VALOR ZERO
	PESSOAJURIDICA(2, "Pessoa Jurídica") // VALOR UM
	;

	private int cod;
	private String descricao;

	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	// static == nao precisa instanciar objeto
	public static TipoCliente toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id Inválido: " + cod);
	}

}
