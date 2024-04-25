public class OperadoresDois {

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {

            System.out.println("Olha... esses dois não tão mentindo.");
        } else {

            System.out.println("É amigão... eles mentiram pra você!");
        }

        boolean condicao3 = true;
        boolean condicao4 = false;

        if (condicao3 || condicao4) {

            System.out.println("Um deles tá falando a verdade... agora qual, descubra.");
        } else {
            System.out.println("Nenhum deles tá falando a verdade. Os de verdade eu sei quem são!");
        }

    }

}
