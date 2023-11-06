import java.util.Scanner;
class SAcubeCO{
    private int a, b;
    public int area;
    SAcubeCO(int a){
        area = 4*a*a;
    }
    SAcubeCO(int a, int b){
        area = (4*a*a)+(4*b*b);
    }
    void calculateArea(){
        System.out.println(area);
    }

    public static void main(String[] args) {
        int n1, side1, side2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of cube: ");
        n1= sc.nextInt();
        switch (n1) {
            case 1:
                System.out.println("Enter side: ");
                side1 = sc.nextInt();
                SAcubeCO obj= new SAcubeCO(side1);
                obj.calculateArea();
                break;
            case 2:
                System.out.println("Enter side of cube 1: ");
                side1 = sc.nextInt();
                System.out.println("Enter side of cube 2: ");
                side2 = sc.nextInt();
                SAcubeCO obj1= new SAcubeCO(side1,side2);
                obj1.calculateArea();
                break;

            default:
                break;
        }
        sc.close();
    }
}