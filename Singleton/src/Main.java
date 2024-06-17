public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();

        logger.log("Iniciando o aplicativo...");
        logger.log("Executando algumas tarefas...");
        logger.log("Inscrição concluída.");

        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("Registrando outra mensagem com a mesma instância do criador de logs.");
    }
}
