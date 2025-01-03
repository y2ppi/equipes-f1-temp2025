import java.util.*;

public class Pilotos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo à aplicação!\n");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Buscar pilotos por equipe");
        System.out.println("2 - Buscar equipe por piloto");

        int escolha = sc.nextInt();
        sc.nextLine();

        switch (escolha) {
            case 1:
                // pilotos -> equipe
                System.out.println("Digite o nome da equipe:");
                String equipe = sc.nextLine();
                String pilotos = obterPilotosPorEquipe(equipe.trim());
                System.out.println(pilotos);
                break;

            case 2:
                // equipe -> piloto
                System.out.println("Digite o nome do piloto:");
                String piloto = sc.nextLine();
                String equipePiloto = obterEquipePorPiloto(piloto.trim());
                System.out.println(equipePiloto);
                break;

            default:
                System.out.println("Opção inválida. Reinicie o programa e escolha 1 ou 2.");
        }

        sc.close();
    }

    // primeiro switch

    private static String obterPilotosPorEquipe(String scuderia) {
        switch (scuderia.toLowerCase()) { 
            case "ferrari":
                return "Pilotos da Ferrari: Lewis Hamilton e Charles Leclerc.";
            case "mclaren":
                return "Pilotos da McLaren: Lando Norris e Oscar Piastri.";
            case "sauber":
                return "Pilotos da Sauber: Gabriel Bortoleto e Nico Hulkenberg.";
            case "williams":
                return "Pilotos da Williams: Alex Albon e Carlos Sainz.";
            case "aston martin":
                return "Pilotos da Aston Martin: Fernando Alonso e Lance Stroll.";
            case "mercedes":
                return "Pilotos da Mercedes: Kimi Antonelli e George Russell.";
            case "red bull":
                return "Pilotos da Red Bull: Max Verstappen e Liam Lawson.";
            case "visa cash app rb":
            case "vcarb":
                return "Pilotos da Visa Cash RB: Isack Hadjar e Yuki Tsunoda.";
            case "haas":
                return "Pilotos da Haas: Esteban Ocon e Ollie Bearman.";
            case "alpine":
                return "Pilotos da Alpine: Pierre Gasly e Jack Doohan.";
            default:
                return "Equipe não encontrada. Tente novamente.";
        }
    }

    // segundo switch

    private static String obterEquipePorPiloto(String piloto) {
        switch (piloto.toLowerCase()) { 
            case "lewis hamilton":
            case "charles leclerc":
                return "Equipe do piloto: Ferrari.";
            case "lando norris":
            case "oscar piastri":
                return "Equipe do piloto: McLaren.";
            case "gabriel bortoleto":
            case "nico hulkenberg":
                return "Equipe do piloto: Sauber.";
            case "alex albon":
            case "carlos sainz":
                return "Equipe do piloto: Williams.";
            case "fernando alonso":
            case "lance stroll":
                return "Equipe do piloto: Aston Martin.";
            case "kimi antonelli":
            case "george russell":
                return "Equipe do piloto: Mercedes.";
            case "max verstappen":
            case "liam lawson":
                return "Equipe do piloto: Red Bull.";
            case "isack hadjar":
            case "yuki tsunoda":
                return "Equipe do piloto: Visa Cash RB.";
            case "esteban ocon":
            case "ollie bearman":
                return "Equipe do piloto: Haas.";
            case "pierre gasly":
            case "jack doohan":
                return "Equipe do piloto: Alpine.";
            default:
                return "Piloto não encontrado. Tente novamente.";
        }
    }
}