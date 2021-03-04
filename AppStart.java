import java.util.Scanner;
public class AppStart
{
    public static void main(String [] args){
        Size cup;
        String userEntry;
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tamanho do copo: \n GRANDE \n MEDIO \n PEQUENO  ");
        userEntry = input.nextLine().toUpperCase();
        switch(userEntry){
            case "GRANDE":
                cup = Size.Large;
                System.out.println("Name\t\t:" + cup.name());
                System.out.println("toString()\t:" + cup.toString());
                System.out.println("Ordem\t\t:" + cup.ordinal());
                System.out.println("Valor minimo\t:" + cup.getMinValue() );
                System.out.println("Valor maximo\t:" + cup.getMaxValue());
                System.out.println("Código\t\t:" + cup.getCode());
                break;
            case "MEDIO":
                cup = Size.MEDIUM;
                System.out.println("Name\t\t:" + cup.name());
                System.out.println("toString()\t:" + cup.toString());
                System.out.println("Ordem\t\t:" + cup.ordinal());
                System.out.println("Valor minimo\t:" + cup.getMinValue() );
                System.out.println("Valor maximo\t:" + cup.getMaxValue());
                System.out.println("Código\t\t:" + cup.getCode());
                break;
            case "PEQUENO":
                cup = Size.SMALL;
                System.out.println("Name\t\t:" + cup.name());
                System.out.println("toString()\t:" + cup.toString());
                System.out.println("Ordem\t\t:" + cup.ordinal());
                System.out.println("Valor minimo\t:" + cup.getMinValue() );
                System.out.println("Valor maximo\t:" + cup.getMaxValue());
                System.out.println("Código\t\t:" + cup.getCode());
                break;
            default:
                System.out.println("Valor inserido inválido");
                break;
        }
    }
}
