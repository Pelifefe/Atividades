Burble Sort:

int []vetor = {5, 1, 8, 6, 4, 2, 0, 9, 3, 7};
int correcao;
 
for(int i = 0; i < vetor.length; i++){ //posição inicial
	for(j = i + 1; j < vetor.length; j++){
		if(vetor[i] > vetor[j]){
			correcao = vetor[j]; //Guarda o valor pois será alterada a posição
			vetor[j] = vetor[i]; //Substitui o valor maior de forma crescente
			vetor[i] = correcao;
		}
	}
}

long fim = System.currentTimeMillis(); //Processo que mostra o tempo de execução


InsertionSort:

int correcao, j;

// Vamos fingir que "vetor" é a sua pilha de cartas desordenadas.
// Você vai olhar para cada carta, uma por uma, começando da segunda carta.
for (int i = 1; i < vetor.length; i++) {

    // Aqui, "correcao" é como se fosse a carta que você está segurando.
    correcao = vetor[i];
    // "j" é como se fosse o índice da carta anterior à carta que você está segurando.
    j = i - 1;

    // Agora, você vai comparar a carta que você está segurando com as cartas que já organizou antes.
    // Você vai continuar olhando para trás (para as cartas que já organizou) até que:
    // - Chegue ao início das cartas, ou
    // - Encontre uma carta que seja menor que a carta que você está segurando.
    while (j >= 0 && vetor[j] > correcao) {
        // Se encontrar uma carta que é maior que a que você está segurando,
        // você move essa carta para frente.
        vetor[j + 1] = vetor[j];
        // E continua olhando para trás.
        j--;


SelectionSort:

int menor, correcao;

for(int i = 0; i < vetor.length; i++){
	menor = i; //Definimos como menor o valor de i para verificar apartir dele
	for(int j = i + 1; j < vetor.length; j++){
		if(vetor[j] < vetor[menor]){ //Encontramos o menor valor do que o valor de i declarado como menor e então fazemos e quando parar iremos para substituição
			menor= j;
		}
	}
	correcao = vetor[menor];
	vetor[menor] = vetor [i];
	vetor[i] = correcao; 
}
