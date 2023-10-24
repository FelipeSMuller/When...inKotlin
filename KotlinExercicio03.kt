fun main() {


	val idade = 10

	when (idade) {

		in 1..10 -> println("Baseado em sua idade: $idade, você é uma criança");
		in 11..17 -> println("Baseado em sua idade $idade, você é um adolescente");
		in 18..50 -> println("Baseado em sua idade $idade, você é um adulto");
		in 51..100 -> println("Baseado em sua idade $idade, você é um idoso");
		else -> println("Sua idade não se encaixa em nenhuma categoria especificada");

	}
}

/*
o operador in
é usado em Kotlin
para verificar
a inclusão de valores
em intervalos, coleções e também
é usado para simplificar a
escrita de ex */