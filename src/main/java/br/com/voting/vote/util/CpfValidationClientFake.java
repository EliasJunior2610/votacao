package br.com.voting.vote.util;

import java.util.Random;

public class CpfValidationClientFake {
    public static final String ABLE_TO_VOTE = "ABLE_TO_VOTE";
    public static final String UNABLE_TO_VOTE = "UNABLE_TO_VOTE";

    // Método para validar se um CPF é válido e se o usuário pode votar
    public String validateCpf(String cpf) {
        // Simula a verificação do CPF
        boolean isValidCpf = isValidCpf(cpf);

        // Se o CPF não for válido, retorna HTTP 404 (Not Found)
        if (!isValidCpf) {
            return "404";
        }

        // Se o CPF for válido, retorna se o usuário pode votar ou não aleatoriamente
        return generateRandomVoteStatus();
    }

    // Método para verificar se um CPF é válido
    private boolean isValidCpf(String cpf) {
        // Simula a verificação de validade do CPF
        // Aqui você pode implementar a lógica real de validação do CPF
        // Neste exemplo, estamos apenas retornando um valor aleatório
        return new Random().nextBoolean();
    }

    // Método para gerar aleatoriamente se o usuário pode votar ou não
    private String generateRandomVoteStatus() {
        // Gera aleatoriamente se o usuário pode votar ou não
        return new Random().nextBoolean() ? ABLE_TO_VOTE : UNABLE_TO_VOTE;
    }
}
