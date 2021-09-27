package br.com.euleoterio.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

	void valorAlterador(String novoValor);
}
