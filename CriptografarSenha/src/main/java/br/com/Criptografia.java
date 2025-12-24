package br.com;

import org.mindrot.jbcrypt.BCrypt;

public class Criptografia {
    public String criptografarSenha(String senha){
        return BCrypt.hashpw(senha, BCrypt.gensalt());
    }

    public boolean descriptografarSenha(String senha, String hash){
        return BCrypt.checkpw(senha, hash);
    }
}
