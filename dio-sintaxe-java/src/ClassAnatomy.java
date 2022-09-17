//(projeto|usuario).funcionalidade
public class ClassAnatomy {
    public static void main(String[] args) {
        // variavel sendo declarada: Tipo nomeDaVariavel = Argumento (pode ser opcional)
        String userName = "Wesley";
        String nickName;
        nickName = "VLK";
        String userNameFull = mostrarNomeCompleto(userName, nickName);
        System.out.println(userNameFull);
    }

    // metodo sendo declarado: TipoRetorno nomeObjetivoImperativo (tipo Paramatros)
    public static String mostrarNomeCompleto(
            String primeiroNome,
            String segundoNome) {
        return ("Aqui esta seu Nome Completo: " +
                primeiroNome.concat(" ").concat(segundoNome));
    }
}
